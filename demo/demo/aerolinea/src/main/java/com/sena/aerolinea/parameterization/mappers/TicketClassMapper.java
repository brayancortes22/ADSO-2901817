package com.sena.aerolinea.parameterization.mappers;

import com.sena.aerolinea.parameterization.entities.models.TicketClass;
import com.sena.aerolinea.parameterization.entities.dto.TicketClassDTO;

/**
 * Mapper para convertir entre TicketClass y TicketClassDTO.
 */
public class TicketClassMapper {
    /**
     * Convierte un TicketClass a TicketClassDTO.
     * @param entity entidad TicketClass
     * @return DTO correspondiente
     */
    public static TicketClassDTO toDTO(TicketClass entity) {
        if (entity == null) return null;
        TicketClassDTO dto = new TicketClassDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    /**
     * Convierte un TicketClassDTO a TicketClass.
     * @param dto DTO de clase de ticket
     * @return entidad correspondiente
     */
    public static TicketClass toEntity(TicketClassDTO dto) {
        if (dto == null) return null;
        TicketClass entity = new TicketClass();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
}
