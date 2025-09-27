package com.sena.aerolinea.parameterization.controllers;

import com.sena.aerolinea.parameterization.entities.models.CrewRole;
import com.sena.aerolinea.parameterization.services.CrewRoleService;
import java.util.List;
import java.util.Optional;

/**
 * Controlador para la entidad CrewRole.
 * Expone endpoints para operaciones CRUD sobre Rol de Tripulación.
 */
public class CrewRoleController {
    private final CrewRoleService service;

    /**
     * Constructor que recibe el servicio de Rol de Tripulación.
     * @param service instancia de CrewRoleService
     */
    public CrewRoleController(CrewRoleService service) {
        this.service = service;
    }

    /**
     * Crea un nuevo rol de tripulación.
     * @param crewRole entidad a crear
     * @return rol de tripulación creado
     */
    public CrewRole create(CrewRole crewRole) {
        return service.create(crewRole);
    }

    /**
     * Obtiene todos los roles de tripulación.
     * @return lista de roles de tripulación
     */
    public List<CrewRole> getAll() {
        return service.getAll();
    }

    /**
     * Obtiene un rol de tripulación por su ID.
     * @param id identificador del rol de tripulación
     * @return rol de tripulación encontrado o vacío
     */
    public Optional<CrewRole> getById(Long id) {
        return service.getById(id);
    }

    /**
     * Actualiza un rol de tripulación existente.
     * @param id identificador del rol de tripulación
     * @param crewRole datos actualizados
     * @return rol de tripulación actualizado o null si no existe
     */
    public CrewRole update(Long id, CrewRole crewRole) {
        return service.update(id, crewRole);
    }

    /**
     * Elimina un rol de tripulación por su ID.
     * @param id identificador del rol de tripulación
     * @return true si existe y se elimina, false si no existe
     */
    public boolean delete(Long id) {
        return service.delete(id);
    }
}
