package com.sena.aerolinea.parameterization.mappers;

import com.sena.aerolinea.parameterization.entities.models.DocumentType;
import com.sena.aerolinea.parameterization.entities.dto.DocumentTypeDTO;

/**
 * Mapper para convertir entre DocumentType y DocumentTypeDTO.
 */
public class DocumentTypeMapper {
    /**
     * Convierte un DocumentType a DocumentTypeDTO.
     * @param entity entidad DocumentType
     * @return DTO correspondiente
     */
    public static DocumentTypeDTO toDTO(DocumentType entity) {
        if (entity == null) return null;
        DocumentTypeDTO dto = new DocumentTypeDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    /**
     * Convierte un DocumentTypeDTO a DocumentType.
     * @param dto DTO de tipo de documento
     * @return entidad correspondiente
     */
    public static DocumentType toEntity(DocumentTypeDTO dto) {
        if (dto == null) return null;
        DocumentType entity = new DocumentType();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
}
