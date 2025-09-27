package com.sena.aerolinea.geolocation.controllers;

import com.sena.aerolinea.geolocation.entities.models.City;
import com.sena.aerolinea.geolocation.services.CityService;
import java.util.List;
import java.util.Optional;

/**
 * Controlador para la entidad City.
 * Realiza operaciones CRUD completas sobre Ciudad.
 * Sigue arquitectura n capas y buenas prácticas.
 */
public class CityController {
    private final CityService service;

    /**
     * Constructor que recibe el servicio de Ciudad.
     */
    public CityController(CityService service) {
        this.service = service;
    }

    /**
     * Crea una nueva ciudad.
     */
    public City create(City city) {
        return service.create(city);
    }

    /**
     * Obtiene todas las ciudades.
     */
    public List<City> getAll() {
        return service.getAll();
    }

    /**
     * Obtiene una ciudad por su ID.
     */
    public Optional<City> getById(Long id) {
        return service.getById(id);
    }

    /**
     * Actualiza una ciudad existente.
     */
    public City update(Long id, City city) {
        return service.update(id, city);
    }

    /**
     * Elimina una ciudad por su ID.
     */
    public boolean delete(Long id) {
        return service.delete(id);
    }
}
