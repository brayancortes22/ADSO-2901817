package com.sena.aerolinea.parameterization.controllers;

import com.sena.aerolinea.parameterization.entities.models.FlightType;
import com.sena.aerolinea.parameterization.services.FlightTypeService;
import java.util.List;
import java.util.Optional;

/**
 * Controlador para la entidad FlightType.
 * Expone endpoints para operaciones CRUD sobre Tipo de Vuelo.
 */
public class FlightTypeController {
    private final FlightTypeService service;

    /**
     * Constructor que recibe el servicio de Tipo de Vuelo.
     * @param service instancia de FlightTypeService
     */
    public FlightTypeController(FlightTypeService service) {
        this.service = service;
    }

    /**
     * Crea un nuevo tipo de vuelo.
     * @param flightType entidad a crear
     * @return tipo de vuelo creado
     */
    public FlightType create(FlightType flightType) {
        return service.create(flightType);
    }

    /**
     * Obtiene todos los tipos de vuelo.
     * @return lista de tipos de vuelo
     */
    public List<FlightType> getAll() {
        return service.getAll();
    }

    /**
     * Obtiene un tipo de vuelo por su ID.
     * @param id identificador del tipo de vuelo
     * @return tipo de vuelo encontrado o vacío
     */
    public Optional<FlightType> getById(Long id) {
        return service.getById(id);
    }

    /**
     * Actualiza un tipo de vuelo existente.
     * @param id identificador del tipo de vuelo
     * @param flightType datos actualizados
     * @return tipo de vuelo actualizado o null si no existe
     */
    public FlightType update(Long id, FlightType flightType) {
        return service.update(id, flightType);
    }

    /**
     * Elimina un tipo de vuelo por su ID.
     * @param id identificador del tipo de vuelo
     * @return true si existe y se elimina, false si no existe
     */
    public boolean delete(Long id) {
        return service.delete(id);
    }
}
