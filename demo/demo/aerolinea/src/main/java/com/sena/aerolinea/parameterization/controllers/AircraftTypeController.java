package com.sena.aerolinea.parameterization.controllers;

import com.sena.aerolinea.parameterization.entities.models.AircraftType;
import com.sena.aerolinea.parameterization.services.AircraftTypeService;
import java.util.List;
import java.util.Optional;

/**
 * Controlador para la entidad AircraftType.
 * Expone endpoints para operaciones CRUD sobre Tipo de Aeronave.
 */
public class AircraftTypeController {
    private final AircraftTypeService service;

    /**
     * Constructor que recibe el servicio de Tipo de Aeronave.
     * @param service instancia de AircraftTypeService
     */
    public AircraftTypeController(AircraftTypeService service) {
        this.service = service;
    }

    /**
     * Crea un nuevo tipo de aeronave.
     * @param aircraftType entidad a crear
     * @return tipo de aeronave creado
     */
    public AircraftType create(AircraftType aircraftType) {
        return service.create(aircraftType);
    }

    /**
     * Obtiene todos los tipos de aeronave.
     * @return lista de tipos de aeronave
     */
    public List<AircraftType> getAll() {
        return service.getAll();
    }

    /**
     * Obtiene un tipo de aeronave por su ID.
     * @param id identificador del tipo de aeronave
     * @return tipo de aeronave encontrado o vacío
     */
    public Optional<AircraftType> getById(Long id) {
        return service.getById(id);
    }

    /**
     * Actualiza un tipo de aeronave existente.
     * @param id identificador del tipo de aeronave
     * @param aircraftType datos actualizados
     * @return tipo de aeronave actualizado o null si no existe
     */
    public AircraftType update(Long id, AircraftType aircraftType) {
        return service.update(id, aircraftType);
    }

    /**
     * Elimina un tipo de aeronave por su ID.
     * @param id identificador del tipo de aeronave
     * @return true si existe y se elimina, false si no existe
     */
    public boolean delete(Long id) {
        return service.delete(id);
    }
}
