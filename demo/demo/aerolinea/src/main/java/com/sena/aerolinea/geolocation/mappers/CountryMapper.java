package com.sena.aerolinea.geolocation.mappers;

import com.sena.aerolinea.geolocation.entities.models.Country;
import com.sena.aerolinea.geolocation.entities.dto.CountryDTO;

/**
 * Mapper para transformar entre Country y CountryDTO.
 * Facilita la conversión entre modelo y DTO.
 */
public class CountryMapper {
    /**
     * Convierte un CountryDTO a Country (Model).
     * @param dto objeto DTO
     * @return objeto modelo
     */
    public static Country toModel(CountryDTO dto) {
        Country model = new Country();
        model.setCode(dto.getCode());
        model.setName(dto.getName());
        model.setDescription(dto.getDescription());
        model.setContinentId(dto.getContinentId());
        return model;
    }

    /**
     * Convierte un Country (Model) a CountryDTO.
     * @param model objeto modelo
     * @return objeto DTO
     */
    public static CountryDTO toDTO(Country model) {
        CountryDTO dto = new CountryDTO();
        dto.setCode(model.getCode());
        dto.setName(model.getName());
        dto.setDescription(model.getDescription());
        dto.setContinentId(model.getContinentId());
        return dto;
    }
}
