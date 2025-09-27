package com.sena.aerolinea.geolocation.controllers;

import com.sena.aerolinea.geolocation.entities.models.Country;
import com.sena.aerolinea.geolocation.services.CountryService;
import java.util.List;
import java.util.Optional;

/**
 * Controlador para la entidad Country.
 * Realiza operaciones CRUD completas sobre País.
 * Sigue arquitectura n capas y buenas prácticas.
 */
public class CountryController {
    private final CountryService service;

    /**
     * Constructor que recibe el servicio de País.
     */
    public CountryController(CountryService service) {
        this.service = service;
    }

    /**
     * Crea un nuevo país.
     */
    public Country create(Country country) {
        return service.create(country);
    }

    /**
     * Obtiene todos los países.
     */
    public List<Country> getAll() {
        return service.getAll();
    }

    /**
     * Obtiene un país por su ID.
     */
    public Optional<Country> getById(Long id) {
        return service.getById(id);
    }

    /**
     * Actualiza un país existente.
     */
    public Country update(Long id, Country country) {
        return service.update(id, country);
    }

    /**
     * Elimina un país por su ID.
     */
    public boolean delete(Long id) {
        return service.delete(id);
    }
}
