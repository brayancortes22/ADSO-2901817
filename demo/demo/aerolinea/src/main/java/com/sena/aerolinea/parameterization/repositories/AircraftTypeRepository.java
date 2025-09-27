package com.sena.aerolinea.parameterization.repositories;

import com.sena.aerolinea.parameterization.entities.models.AircraftType;
import java.util.List;
import java.util.Optional;

/**
 * Repositorio para la entidad AircraftType.
 * Proporciona operaciones de lectura y creación.
 */
public interface AircraftTypeRepository {
    /** Guarda un nuevo tipo de aeronave. */
    AircraftType save(AircraftType aircraftType);
    /** Obtiene todos los tipos de aeronave. */
    List<AircraftType> findAll();
    /** Busca un tipo de aeronave por su ID. */
    Optional<AircraftType> findById(Long id);
}
