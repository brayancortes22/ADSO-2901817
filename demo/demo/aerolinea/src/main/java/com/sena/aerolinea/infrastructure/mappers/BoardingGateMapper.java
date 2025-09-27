package com.sena.aerolinea.infrastructure.mappers;

import com.sena.aerolinea.infrastructure.entities.models.BoardingGate;
import com.sena.aerolinea.infrastructure.entities.dto.BoardingGateDTO;

/**
 * Mapper para transformar entre BoardingGate y BoardingGateDTO.
 * Facilita la conversión entre modelo y DTO.
 */
public class BoardingGateMapper {
    /**
     * Convierte un BoardingGateDTO a BoardingGate (Model).
     * @param dto objeto DTO
     * @return objeto modelo
     */
    public static BoardingGate toModel(BoardingGateDTO dto) {
        BoardingGate model = new BoardingGate();
        model.setCode(dto.getCode());
        model.setName(dto.getName());
        model.setTerminalId(dto.getTerminalId());
        return model;
    }

    /**
     * Convierte un BoardingGate (Model) a BoardingGateDTO.
     * @param model objeto modelo
     * @return objeto DTO
     */
    public static BoardingGateDTO toDTO(BoardingGate model) {
        BoardingGateDTO dto = new BoardingGateDTO();
        dto.setCode(model.getCode());
        dto.setName(model.getName());
        dto.setTerminalId(model.getTerminalId());
        return dto;
    }
}
