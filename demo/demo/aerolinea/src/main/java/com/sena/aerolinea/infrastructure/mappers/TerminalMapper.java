package com.sena.aerolinea.infrastructure.mappers;

import com.sena.aerolinea.infrastructure.entities.models.Terminal;
import com.sena.aerolinea.infrastructure.entities.dto.TerminalDTO;

/**
 * Mapper para transformar entre Terminal y TerminalDTO.
 * Facilita la conversión entre modelo y DTO.
 */
public class TerminalMapper {
    /**
     * Convierte un TerminalDTO a Terminal (Model).
     * @param dto objeto DTO
     * @return objeto modelo
     */
    public static Terminal toModel(TerminalDTO dto) {
        Terminal model = new Terminal();
        model.setCode(dto.getCode());
        model.setName(dto.getName());
        model.setAirportId(dto.getAirportId());
        return model;
    }

    /**
     * Convierte un Terminal (Model) a TerminalDTO.
     * @param model objeto modelo
     * @return objeto DTO
     */
    public static TerminalDTO toDTO(Terminal model) {
        TerminalDTO dto = new TerminalDTO();
        dto.setCode(model.getCode());
        dto.setName(model.getName());
        dto.setAirportId(model.getAirportId());
        return dto;
    }
}
