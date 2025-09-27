package com.sena.aerolinea.geolocation.mappers;

import com.sena.aerolinea.geolocation.entities.models.City;
import com.sena.aerolinea.geolocation.entities.dto.CityDTO;

/**
 * Mapper para transformar entre City y CityDTO.
 * Facilita la conversión entre modelo y DTO.
 */
public class CityMapper {
    /**
     * Convierte un CityDTO a City (Model).
     * @param dto objeto DTO
     * @return objeto modelo
     */
    public static City toModel(CityDTO dto) {
        City model = new City();
        model.setCode(dto.getCode());
        model.setName(dto.getName());
        model.setDescription(dto.getDescription());
        model.setStateId(dto.getStateId());
        return model;
    }

    /**
     * Convierte un City (Model) a CityDTO.
     * @param model objeto modelo
     * @return objeto DTO
     */
    public static CityDTO toDTO(City model) {
        CityDTO dto = new CityDTO();
        dto.setCode(model.getCode());
        dto.setName(model.getName());
        dto.setDescription(model.getDescription());
        dto.setStateId(model.getStateId());
        return dto;
    }
}
