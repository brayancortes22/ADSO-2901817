package com.sena.aerolinea.parameterization.services;

import com.sena.aerolinea.parameterization.entities.models.TicketClass;
import com.sena.aerolinea.parameterization.repositories.TicketClassRepository;
import java.util.List;
import java.util.Optional;

/**
 * Servicio para la entidad TicketClass.
 * Proporciona operaciones CRUD completas sobre Clase de Ticket.
 */
public class TicketClassService {
    private final TicketClassRepository repository;

    /**
     * Constructor que recibe el repositorio de Clase de Ticket.
     * @param repository instancia de TicketClassRepository
     */
    public TicketClassService(TicketClassRepository repository) {
        this.repository = repository;
    }

    /**
     * Crea una nueva clase de ticket.
     * @param ticketClass entidad a crear
     * @return clase de ticket creada
     */
    public TicketClass create(TicketClass ticketClass) {
        return repository.save(ticketClass);
    }

    /**
     * Obtiene todas las clases de ticket.
     * @return lista de clases de ticket
     */
    public List<TicketClass> getAll() {
        return repository.findAll();
    }

    /**
     * Obtiene una clase de ticket por su ID.
     * @param id identificador de la clase de ticket
     * @return clase de ticket encontrada o vacío
     */
    public Optional<TicketClass> getById(Long id) {
        return repository.findById(id);
    }

    /**
     * Actualiza una clase de ticket existente.
     * @param id identificador de la clase de ticket
     * @param ticketClass datos actualizados
     * @return clase de ticket actualizada o null si no existe
     */
    public TicketClass update(Long id, TicketClass ticketClass) {
        Optional<TicketClass> existing = repository.findById(id);
        if (existing.isPresent()) {
            ticketClass.setId(id);
            return repository.save(ticketClass);
        }
        return null;
    }

    /**
     * Elimina una clase de ticket por su ID.
     * @param id identificador de la clase de ticket
     * @return true si existe y se elimina, false si no existe
     */
    public boolean delete(Long id) {
        return repository.findById(id).isPresent();
    }
}
