package com.sena.aerolinea.parameterization;

import com.sena.aerolinea.parameterization.entity.DocumentType;
import com.sena.aerolinea.parameterization.repository.DocumentTypeRepository;
import com.sena.aerolinea.parameterization.service.DocumentTypeService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Optional;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class DocumentTypeServiceTest {
    @Mock
    private DocumentTypeRepository documentTypeRepository;

    @InjectMocks
    private DocumentTypeService documentTypeService;

    public DocumentTypeServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        when(documentTypeRepository.findAll()).thenReturn(Collections.emptyList());
        List<DocumentType> types = documentTypeService.findAll();
        assertNotNull(types);
        assertEquals(0, types.size());
    }

    @Test
    void testSaveAndFindById() {
        DocumentType type = new DocumentType();
        type.setId(1L);
        type.setName("CC");
        type.setDescription("Cédula de Ciudadanía");
        when(documentTypeRepository.save(any(DocumentType.class))).thenReturn(type);
        when(documentTypeRepository.findById(1L)).thenReturn(Optional.of(type));
        DocumentType saved = documentTypeService.save(type);
        assertEquals("CC", saved.getName());
        Optional<DocumentType> found = documentTypeService.findById(1L);
        assertTrue(found.isPresent());
        assertEquals("Cédula de Ciudadanía", found.get().getDescription());
    }

    @Test
    void testDeleteById() {
        doNothing().when(documentTypeRepository).deleteById(1L);
        documentTypeService.deleteById(1L);
        verify(documentTypeRepository, times(1)).deleteById(1L);
    }
}
