package com.sena.aerolinea.parameterization.repositories;

import com.sena.aerolinea.parameterization.entities.models.FlightType;
import java.util.List;
import java.util.Optional;

/**
 * Repositorio para la entidad FlightType.
 * Proporciona operaciones de lectura y creación.
 */
public interface FlightTypeRepository {
    /** Guarda un nuevo tipo de vuelo. */
    FlightType save(FlightType flightType);
    /** Obtiene todos los tipos de vuelo. */
    List<FlightType> findAll();
    /** Busca un tipo de vuelo por su ID. */
    Optional<FlightType> findById(Long id);
}
