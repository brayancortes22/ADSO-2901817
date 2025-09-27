package com.sena.aerolinea.parameterization.repositories;

import com.sena.aerolinea.parameterization.entities.models.CrewRole;
import java.util.List;
import java.util.Optional;

/**
 * Repositorio para la entidad CrewRole.
 * Proporciona operaciones de lectura y creación.
 */
public interface CrewRoleRepository {
    /** Guarda un nuevo rol de tripulación. */
    CrewRole save(CrewRole crewRole);
    /** Obtiene todos los roles de tripulación. */
    List<CrewRole> findAll();
    /** Busca un rol de tripulación por su ID. */
    Optional<CrewRole> findById(Long id);
}
