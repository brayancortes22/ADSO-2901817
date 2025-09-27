package com.sena.aerolinea.parameterization.controllers;

import com.sena.aerolinea.parameterization.entities.models.DocumentType;
import com.sena.aerolinea.parameterization.services.DocumentTypeService;
import java.util.List;
import java.util.Optional;

/**
 * Controlador para la entidad DocumentType.
 * Expone endpoints para operaciones CRUD sobre Tipo de Documento.
 */
public class DocumentTypeController {
    private final DocumentTypeService service;

    /**
     * Constructor que recibe el servicio de Tipo de Documento.
     * @param service instancia de DocumentTypeService
     */
    public DocumentTypeController(DocumentTypeService service) {
        this.service = service;
    }

    /**
     * Crea un nuevo tipo de documento.
     * @param documentType entidad a crear
     * @return tipo de documento creado
     */
    public DocumentType create(DocumentType documentType) {
        return service.create(documentType);
    }

    /**
     * Obtiene todos los tipos de documento.
     * @return lista de tipos de documento
     */
    public List<DocumentType> getAll() {
        return service.getAll();
    }

    /**
     * Obtiene un tipo de documento por su ID.
     * @param id identificador del tipo de documento
     * @return tipo de documento encontrado o vacío
     */
    public Optional<DocumentType> getById(Long id) {
        return service.getById(id);
    }

    /**
     * Actualiza un tipo de documento existente.
     * @param id identificador del tipo de documento
     * @param documentType datos actualizados
     * @return tipo de documento actualizado o null si no existe
     */
    public DocumentType update(Long id, DocumentType documentType) {
        return service.update(id, documentType);
    }

    /**
     * Elimina un tipo de documento por su ID.
     * @param id identificador del tipo de documento
     * @return true si existe y se elimina, false si no existe
     */
    public boolean delete(Long id) {
        return service.delete(id);
    }
}
