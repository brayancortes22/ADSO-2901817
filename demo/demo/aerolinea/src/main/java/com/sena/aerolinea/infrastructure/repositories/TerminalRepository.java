package com.sena.aerolinea.infrastructure.repositories;

import com.sena.aerolinea.infrastructure.entities.models.Terminal;
import java.util.List;
import java.util.Optional;

/**
 * Repositorio para la entidad Terminal.
 * Proporciona operaciones de lectura y creación.
 */
public interface TerminalRepository {
    /** Guarda una nueva terminal. */
    Terminal save(Terminal terminal);
    /** Obtiene todas las terminales. */
    List<Terminal> findAll();
    /** Busca una terminal por su ID. */
    Optional<Terminal> findById(Long id);
}
