package com.sena.aerolinea.infrastructure.mappers;

import com.sena.aerolinea.infrastructure.entities.models.Airport;
import com.sena.aerolinea.infrastructure.entities.dto.AirportDTO;

/**
 * Mapper para transformar entre Airport y AirportDTO.
 * Facilita la conversión entre modelo y DTO.
 */
public class AirportMapper {
    /**
     * Convierte un AirportDTO a Airport (Model).
     * @param dto objeto DTO
     * @return objeto modelo
     */
    public static Airport toModel(AirportDTO dto) {
        Airport model = new Airport();
        model.setCode(dto.getCode());
        model.setName(dto.getName());
        model.setAddress(dto.getAddress());
        model.setCityId(dto.getCityId());
        return model;
    }

    /**
     * Convierte un Airport (Model) a AirportDTO.
     * @param model objeto modelo
     * @return objeto DTO
     */
    public static AirportDTO toDTO(Airport model) {
        AirportDTO dto = new AirportDTO();
        dto.setCode(model.getCode());
        dto.setName(model.getName());
        dto.setAddress(model.getAddress());
        dto.setCityId(model.getCityId());
        return dto;
    }
}
