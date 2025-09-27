package com.sena.aerolinea.geolocation.controllers;

import com.sena.aerolinea.geolocation.entities.models.State;
import com.sena.aerolinea.geolocation.services.StateService;
import java.util.List;
import java.util.Optional;

/**
 * Controlador para la entidad State.
 * Realiza operaciones CRUD completas sobre Estado.
 * Sigue arquitectura n capas y buenas prácticas.
 */
public class StateController {
    private final StateService service;

    /**
     * Constructor que recibe el servicio de Estado.
     */
    public StateController(StateService service) {
        this.service = service;
    }

    /**
     * Crea un nuevo estado.
     */
    public State create(State state) {
        return service.create(state);
    }

    /**
     * Obtiene todos los estados.
     */
    public List<State> getAll() {
        return service.getAll();
    }

    /**
     * Obtiene un estado por su ID.
     */
    public Optional<State> getById(Long id) {
        return service.getById(id);
    }

    /**
     * Actualiza un estado existente.
     */
    public State update(Long id, State state) {
        return service.update(id, state);
    }

    /**
     * Elimina un estado por su ID.
     */
    public boolean delete(Long id) {
        return service.delete(id);
    }
}
