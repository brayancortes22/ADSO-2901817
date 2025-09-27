package com.sena.aerolinea.security;

import com.sena.aerolinea.security.entity.Role;
import com.sena.aerolinea.security.repository.RoleRepository;
import com.sena.aerolinea.security.service.RoleService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Optional;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RoleServiceTest {
    @Mock
    private RoleRepository roleRepository;

    @InjectMocks
    private RoleService roleService;

    public RoleServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        when(roleRepository.findAll()).thenReturn(Collections.emptyList());
        List<Role> roles = roleService.findAll();
        assertNotNull(roles);
        assertEquals(0, roles.size());
    }

    @Test
    void testSaveAndFindById() {
        Role role = new Role();
        role.setId(1L);
        role.setName("ADMIN");
        role.setDescription("Administrador");
        when(roleRepository.save(any(Role.class))).thenReturn(role);
        when(roleRepository.findById(1L)).thenReturn(Optional.of(role));
        Role saved = roleService.save(role);
        assertEquals("ADMIN", saved.getName());
        Optional<Role> found = roleService.findById(1L);
        assertTrue(found.isPresent());
        assertEquals("Administrador", found.get().getDescription());
    }

    @Test
    void testDeleteById() {
        doNothing().when(roleRepository).deleteById(1L);
        roleService.deleteById(1L);
        verify(roleRepository, times(1)).deleteById(1L);
    }
}
