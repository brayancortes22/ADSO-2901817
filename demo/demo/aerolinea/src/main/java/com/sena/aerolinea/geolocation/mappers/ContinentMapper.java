package com.sena.aerolinea.geolocation.mappers;

import com.sena.aerolinea.geolocation.entities.models.Continent;
import com.sena.aerolinea.geolocation.entities.dto.ContinentDTO;

/**
 * Mapper para transformar entre Continent y ContinentDTO.
 * Facilita la conversión entre modelo y DTO.
 */
public class ContinentMapper {
    /**
     * Convierte un ContinentDTO a Continent (Model).
     * @param dto objeto DTO
     * @return objeto modelo
     */
    public static Continent toModel(ContinentDTO dto) {
        Continent model = new Continent();
        model.setCode(dto.getCode());
        model.setName(dto.getName());
        model.setDescription(dto.getDescription());
        return model;
    }

    /**
     * Convierte un Continent (Model) a ContinentDTO.
     * @param model objeto modelo
     * @return objeto DTO
     */
    public static ContinentDTO toDTO(Continent model) {
        ContinentDTO dto = new ContinentDTO();
        dto.setCode(model.getCode());
        dto.setName(model.getName());
        dto.setDescription(model.getDescription());
        return dto;
    }
}
