package com.sena.aerolinea.infrastructure.repositories;

import com.sena.aerolinea.infrastructure.entities.models.Airport;
import java.util.List;
import java.util.Optional;

/**
 * Repositorio para la entidad Airport.
 * Proporciona operaciones de lectura y creación.
 */
public interface AirportRepository {
    /** Guarda un nuevo aeropuerto. */
    Airport save(Airport airport);
    /** Obtiene todos los aeropuertos. */
    List<Airport> findAll();
    /** Busca un aeropuerto por su ID. */
    Optional<Airport> findById(Long id);
}
