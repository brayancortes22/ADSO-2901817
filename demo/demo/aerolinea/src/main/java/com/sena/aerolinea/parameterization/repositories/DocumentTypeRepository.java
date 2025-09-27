package com.sena.aerolinea.parameterization.repositories;

import com.sena.aerolinea.parameterization.entities.models.DocumentType;
import java.util.List;
import java.util.Optional;

/**
 * Repositorio para la entidad DocumentType.
 * Proporciona operaciones de lectura y creación.
 */
public interface DocumentTypeRepository {
    /** Guarda un nuevo tipo de documento. */
    DocumentType save(DocumentType documentType);
    /** Obtiene todos los tipos de documento. */
    List<DocumentType> findAll();
    /** Busca un tipo de documento por su ID. */
    Optional<DocumentType> findById(Long id);
}
