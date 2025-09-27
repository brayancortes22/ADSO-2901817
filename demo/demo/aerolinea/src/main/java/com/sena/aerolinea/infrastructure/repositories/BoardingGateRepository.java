package com.sena.aerolinea.infrastructure.repositories;

import com.sena.aerolinea.infrastructure.entities.models.BoardingGate;
import java.util.List;
import java.util.Optional;

/**
 * Repositorio para la entidad BoardingGate.
 * Proporciona operaciones de lectura y creación.
 */
public interface BoardingGateRepository {
    /** Guarda una nueva puerta de embarque. */
    BoardingGate save(BoardingGate boardingGate);
    /** Obtiene todas las puertas de embarque. */
    List<BoardingGate> findAll();
    /** Busca una puerta de embarque por su ID. */
    Optional<BoardingGate> findById(Long id);
}
