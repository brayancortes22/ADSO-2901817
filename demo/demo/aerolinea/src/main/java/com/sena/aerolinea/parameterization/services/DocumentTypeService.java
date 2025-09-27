package com.sena.aerolinea.parameterization.services;

import com.sena.aerolinea.parameterization.entities.models.DocumentType;
import com.sena.aerolinea.parameterization.repositories.DocumentTypeRepository;
import java.util.List;
import java.util.Optional;

/**
 * Servicio para la entidad DocumentType.
 * Proporciona operaciones CRUD completas sobre Tipo de Documento.
 */
public class DocumentTypeService {
    private final DocumentTypeRepository repository;

    /**
     * Constructor que recibe el repositorio de Tipo de Documento.
     * @param repository instancia de DocumentTypeRepository
     */
    public DocumentTypeService(DocumentTypeRepository repository) {
        this.repository = repository;
    }

    /**
     * Crea un nuevo tipo de documento.
     * @param documentType entidad a crear
     * @return tipo de documento creado
     */
    public DocumentType create(DocumentType documentType) {
        return repository.save(documentType);
    }

    /**
     * Obtiene todos los tipos de documento.
     * @return lista de tipos de documento
     */
    public List<DocumentType> getAll() {
        return repository.findAll();
    }

    /**
     * Obtiene un tipo de documento por su ID.
     * @param id identificador del tipo de documento
     * @return tipo de documento encontrado o vacío
     */
    public Optional<DocumentType> getById(Long id) {
        return repository.findById(id);
    }

    /**
     * Actualiza un tipo de documento existente.
     * @param id identificador del tipo de documento
     * @param documentType datos actualizados
     * @return tipo de documento actualizado o null si no existe
     */
    public DocumentType update(Long id, DocumentType documentType) {
        Optional<DocumentType> existing = repository.findById(id);
        if (existing.isPresent()) {
            documentType.setId(id);
            return repository.save(documentType);
        }
        return null;
    }

    /**
     * Elimina un tipo de documento por su ID.
     * @param id identificador del tipo de documento
     * @return true si existe y se elimina, false si no existe
     */
    public boolean delete(Long id) {
        return repository.findById(id).isPresent();
    }
}
