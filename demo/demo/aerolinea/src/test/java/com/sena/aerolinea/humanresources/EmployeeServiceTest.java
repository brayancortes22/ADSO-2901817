package com.sena.aerolinea.humanresources;

import com.sena.aerolinea.humanresources.entity.Employee;
import com.sena.aerolinea.humanresources.repository.EmployeeRepository;
import com.sena.aerolinea.humanresources.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Optional;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class EmployeeServiceTest {
    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeService employeeService;

    public EmployeeServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        when(employeeRepository.findAll()).thenReturn(Collections.emptyList());
        List<Employee> employees = employeeService.findAll();
        assertNotNull(employees);
        assertEquals(0, employees.size());
    }

    @Test
    void testSaveAndFindById() {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setFirstName("Juan");
        employee.setLastName("Pérez");
        employee.setPosition("Piloto");
        when(employeeRepository.save(any(Employee.class))).thenReturn(employee);
        when(employeeRepository.findById(1L)).thenReturn(Optional.of(employee));
        Employee saved = employeeService.save(employee);
        assertEquals("Juan", saved.getFirstName());
        Optional<Employee> found = employeeService.findById(1L);
        assertTrue(found.isPresent());
        assertEquals("Piloto", found.get().getPosition());
    }

    @Test
    void testDeleteById() {
        doNothing().when(employeeRepository).deleteById(1L);
        employeeService.deleteById(1L);
        verify(employeeRepository, times(1)).deleteById(1L);
    }
}
