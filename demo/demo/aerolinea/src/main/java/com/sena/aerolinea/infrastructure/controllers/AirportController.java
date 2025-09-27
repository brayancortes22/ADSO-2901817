package com.sena.aerolinea.infrastructure.controllers;

import com.sena.aerolinea.infrastructure.entities.models.Airport;
import com.sena.aerolinea.infrastructure.services.AirportService;
import java.util.List;
import java.util.Optional;

/**
 * Controlador para la entidad Airport.
 * Realiza operaciones CRUD completas sobre Aeropuerto.
 */
public class AirportController {
    private final AirportService service;

    /**
     * Constructor que recibe el servicio de Aeropuerto.
     */
    public AirportController(AirportService service) {
        this.service = service;
    }

    /**
     * Crea un nuevo aeropuerto.
     */
    public Airport create(Airport airport) {
        return service.create(airport);
    }

    /**
     * Obtiene todos los aeropuertos.
     */
    public List<Airport> getAll() {
        return service.getAll();
    }

    /**
     * Obtiene un aeropuerto por su ID.
     */
    public Optional<Airport> getById(Long id) {
        return service.getById(id);
    }

    /**
     * Actualiza un aeropuerto existente.
     */
    public Airport update(Long id, Airport airport) {
        return service.update(id, airport);
    }

    /**
     * Elimina un aeropuerto por su ID.
     */
    public boolean delete(Long id) {
        return service.delete(id);
    }
}
