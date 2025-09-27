package com.sena.aerolinea.parameterization.mappers;

import com.sena.aerolinea.parameterization.entities.models.FlightType;
import com.sena.aerolinea.parameterization.entities.dto.FlightTypeDTO;

/**
 * Mapper para convertir entre FlightType y FlightTypeDTO.
 */
public class FlightTypeMapper {
    /**
     * Convierte un FlightType a FlightTypeDTO.
     * @param entity entidad FlightType
     * @return DTO correspondiente
     */
    public static FlightTypeDTO toDTO(FlightType entity) {
        if (entity == null) return null;
        FlightTypeDTO dto = new FlightTypeDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    /**
     * Convierte un FlightTypeDTO a FlightType.
     * @param dto DTO de tipo de vuelo
     * @return entidad correspondiente
     */
    public static FlightType toEntity(FlightTypeDTO dto) {
        if (dto == null) return null;
        FlightType entity = new FlightType();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
}
