package com.sena.aerolinea.parameterization.services;

import com.sena.aerolinea.parameterization.entities.models.CrewRole;
import com.sena.aerolinea.parameterization.repositories.CrewRoleRepository;
import java.util.List;
import java.util.Optional;

/**
 * Servicio para la entidad CrewRole.
 * Proporciona operaciones CRUD completas sobre Rol de Tripulación.
 */
public class CrewRoleService {
    private final CrewRoleRepository repository;

    /**
     * Constructor que recibe el repositorio de Rol de Tripulación.
     * @param repository instancia de CrewRoleRepository
     */
    public CrewRoleService(CrewRoleRepository repository) {
        this.repository = repository;
    }

    /**
     * Crea un nuevo rol de tripulación.
     * @param crewRole entidad a crear
     * @return rol de tripulación creado
     */
    public CrewRole create(CrewRole crewRole) {
        return repository.save(crewRole);
    }

    /**
     * Obtiene todos los roles de tripulación.
     * @return lista de roles de tripulación
     */
    public List<CrewRole> getAll() {
        return repository.findAll();
    }

    /**
     * Obtiene un rol de tripulación por su ID.
     * @param id identificador del rol de tripulación
     * @return rol de tripulación encontrado o vacío
     */
    public Optional<CrewRole> getById(Long id) {
        return repository.findById(id);
    }

    /**
     * Actualiza un rol de tripulación existente.
     * @param id identificador del rol de tripulación
     * @param crewRole datos actualizados
     * @return rol de tripulación actualizado o null si no existe
     */
    public CrewRole update(Long id, CrewRole crewRole) {
        Optional<CrewRole> existing = repository.findById(id);
        if (existing.isPresent()) {
            crewRole.setId(id);
            return repository.save(crewRole);
        }
        return null;
    }

    /**
     * Elimina un rol de tripulación por su ID.
     * @param id identificador del rol de tripulación
     * @return true si existe y se elimina, false si no existe
     */
    public boolean delete(Long id) {
        return repository.findById(id).isPresent();
    }
}
