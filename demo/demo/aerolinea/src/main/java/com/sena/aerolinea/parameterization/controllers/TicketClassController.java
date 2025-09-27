package com.sena.aerolinea.parameterization.controllers;

import com.sena.aerolinea.parameterization.entities.models.TicketClass;
import com.sena.aerolinea.parameterization.services.TicketClassService;
import java.util.List;
import java.util.Optional;

/**
 * Controlador para la entidad TicketClass.
 * Expone endpoints para operaciones CRUD sobre Clase de Ticket.
 */
public class TicketClassController {
    private final TicketClassService service;

    /**
     * Constructor que recibe el servicio de Clase de Ticket.
     * @param service instancia de TicketClassService
     */
    public TicketClassController(TicketClassService service) {
        this.service = service;
    }

    /**
     * Crea una nueva clase de ticket.
     * @param ticketClass entidad a crear
     * @return clase de ticket creada
     */
    public TicketClass create(TicketClass ticketClass) {
        return service.create(ticketClass);
    }

    /**
     * Obtiene todas las clases de ticket.
     * @return lista de clases de ticket
     */
    public List<TicketClass> getAll() {
        return service.getAll();
    }

    /**
     * Obtiene una clase de ticket por su ID.
     * @param id identificador de la clase de ticket
     * @return clase de ticket encontrada o vacío
     */
    public Optional<TicketClass> getById(Long id) {
        return service.getById(id);
    }

    /**
     * Actualiza una clase de ticket existente.
     * @param id identificador de la clase de ticket
     * @param ticketClass datos actualizados
     * @return clase de ticket actualizada o null si no existe
     */
    public TicketClass update(Long id, TicketClass ticketClass) {
        return service.update(id, ticketClass);
    }

    /**
     * Elimina una clase de ticket por su ID.
     * @param id identificador de la clase de ticket
     * @return true si existe y se elimina, false si no existe
     */
    public boolean delete(Long id) {
        return service.delete(id);
    }
}
