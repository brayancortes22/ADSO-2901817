package com.sena.aerolinea.parameterization.mappers;

import com.sena.aerolinea.parameterization.entities.models.CrewRole;
import com.sena.aerolinea.parameterization.entities.dto.CrewRoleDTO;

/**
 * Mapper para convertir entre CrewRole y CrewRoleDTO.
 */
public class CrewRoleMapper {
    /**
     * Convierte un CrewRole a CrewRoleDTO.
     * @param entity entidad CrewRole
     * @return DTO correspondiente
     */
    public static CrewRoleDTO toDTO(CrewRole entity) {
        if (entity == null) return null;
        CrewRoleDTO dto = new CrewRoleDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    /**
     * Convierte un CrewRoleDTO a CrewRole.
     * @param dto DTO de rol de tripulación
     * @return entidad correspondiente
     */
    public static CrewRole toEntity(CrewRoleDTO dto) {
        if (dto == null) return null;
        CrewRole entity = new CrewRole();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
}
