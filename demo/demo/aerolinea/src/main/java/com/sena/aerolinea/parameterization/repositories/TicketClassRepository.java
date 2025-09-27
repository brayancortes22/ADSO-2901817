package com.sena.aerolinea.parameterization.repositories;

import com.sena.aerolinea.parameterization.entities.models.TicketClass;
import java.util.List;
import java.util.Optional;

/**
 * Repositorio para la entidad TicketClass.
 * Proporciona operaciones de lectura y creación.
 */
public interface TicketClassRepository {
    /** Guarda una nueva clase de ticket. */
    TicketClass save(TicketClass ticketClass);
    /** Obtiene todas las clases de ticket. */
    List<TicketClass> findAll();
    /** Busca una clase de ticket por su ID. */
    Optional<TicketClass> findById(Long id);
}
