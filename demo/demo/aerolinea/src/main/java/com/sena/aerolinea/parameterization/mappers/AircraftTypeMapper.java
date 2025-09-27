package com.sena.aerolinea.parameterization.mappers;

import com.sena.aerolinea.parameterization.entities.models.AircraftType;
import com.sena.aerolinea.parameterization.entities.dto.AircraftTypeDTO;

/**
 * Mapper para convertir entre AircraftType y AircraftTypeDTO.
 */
public class AircraftTypeMapper {
    /**
     * Convierte un AircraftType a AircraftTypeDTO.
     * @param entity entidad AircraftType
     * @return DTO correspondiente
     */
    public static AircraftTypeDTO toDTO(AircraftType entity) {
        if (entity == null) return null;
        AircraftTypeDTO dto = new AircraftTypeDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    /**
     * Convierte un AircraftTypeDTO a AircraftType.
     * @param dto DTO de tipo de aeronave
     * @return entidad correspondiente
     */
    public static AircraftType toEntity(AircraftTypeDTO dto) {
        if (dto == null) return null;
        AircraftType entity = new AircraftType();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
}
