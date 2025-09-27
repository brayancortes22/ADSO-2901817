package com.sena.aerolinea.geolocation.repositories;

import com.sena.aerolinea.geolocation.entities.models.State;
import java.util.List;
import java.util.Optional;

/**
 * Repositorio para la entidad State.
 * Proporciona operaciones de lectura y creación.
 */
public interface StateRepository {
    /**
     * Guarda un nuevo estado.
     * @param state entidad a guardar
     * @return estado guardado
     */
    State save(State state);
    /**
     * Obtiene todos los estados.
     * @return lista de estados
     */
    List<State> findAll();
    /**
     * Busca un estado por su ID.
     * @param id identificador del estado
     * @return estado encontrado o vacío
     */
    Optional<State> findById(Long id);
}
