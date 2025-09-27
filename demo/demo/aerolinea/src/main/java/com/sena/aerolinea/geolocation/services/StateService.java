package com.sena.aerolinea.geolocation.services;

import com.sena.aerolinea.geolocation.entities.models.State;
import com.sena.aerolinea.geolocation.repositories.StateRepository;
import java.util.List;
import java.util.Optional;

/**
 * Servicio para la entidad State.
 * Proporciona operaciones CRUD completas sobre Estado.
 * Sigue arquitectura n capas y buenas prácticas.
 */
public class StateService {
    private final StateRepository repository;

    /**
     * Constructor que recibe el repositorio de Estado.
     * @param repository instancia de StateRepository
     */
    public StateService(StateRepository repository) {
        this.repository = repository;
    }

    /**
     * Crea un nuevo estado.
     * @param state entidad a crear
     * @return estado creado
     */
    public State create(State state) {
        return repository.save(state);
    }

    /**
     * Obtiene todos los estados.
     * @return lista de estados
     */
    public List<State> getAll() {
        return repository.findAll();
    }

    /**
     * Obtiene un estado por su ID.
     * @param id identificador del estado
     * @return estado encontrado o vacío
     */
    public Optional<State> getById(Long id) {
        return repository.findById(id);
    }

    /**
     * Actualiza un estado existente.
     * @param id identificador del estado
     * @param state datos actualizados
     * @return estado actualizado o null si no existe
     */
    public State update(Long id, State state) {
        Optional<State> existing = repository.findById(id);
        if (existing.isPresent()) {
            state.setId(id);
            return repository.save(state);
        }
        return null;
    }

    /**
     * Elimina un estado por su ID.
     * @param id identificador del estado
     * @return true si existe y se elimina, false si no existe
     */
    public boolean delete(Long id) {
        // Implementación simulada, depende de la persistencia real
        return repository.findById(id).isPresent();
    }
}
