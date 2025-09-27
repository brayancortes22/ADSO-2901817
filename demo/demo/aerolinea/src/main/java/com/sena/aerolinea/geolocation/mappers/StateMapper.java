package com.sena.aerolinea.geolocation.mappers;

import com.sena.aerolinea.geolocation.entities.models.State;
import com.sena.aerolinea.geolocation.entities.dto.StateDTO;

/**
 * Mapper para transformar entre State y StateDTO.
 * Facilita la conversión entre modelo y DTO.
 */
public class StateMapper {
    /**
     * Convierte un StateDTO a State (Model).
     * @param dto objeto DTO
     * @return objeto modelo
     */
    public static State toModel(StateDTO dto) {
        State model = new State();
        model.setCode(dto.getCode());
        model.setName(dto.getName());
        model.setDescription(dto.getDescription());
        model.setCountryId(dto.getCountryId());
        return model;
    }

    /**
     * Convierte un State (Model) a StateDTO.
     * @param model objeto modelo
     * @return objeto DTO
     */
    public static StateDTO toDTO(State model) {
        StateDTO dto = new StateDTO();
        dto.setCode(model.getCode());
        dto.setName(model.getName());
        dto.setDescription(model.getDescription());
        dto.setCountryId(model.getCountryId());
        return dto;
    }
}
