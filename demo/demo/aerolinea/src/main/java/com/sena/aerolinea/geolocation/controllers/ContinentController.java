package com.sena.aerolinea.geolocation.controllers;

import com.sena.aerolinea.geolocation.entities.models.Continent;
import com.sena.aerolinea.geolocation.services.ContinentService;
import java.util.List;
import java.util.Optional;

/**
 * Controlador para la entidad Continent.
 * Realiza operaciones CRUD completas sobre Continente.
 * Sigue arquitectura n capas y buenas prácticas.
 */
public class ContinentController {
    private final ContinentService service;

    /**
     * Constructor que recibe el servicio de Continente.
     */
    public ContinentController(ContinentService service) {
        this.service = service;
    }

    /**
     * Crea un nuevo continente.
     */
    public Continent create(Continent continent) {
        return service.create(continent);
    }

    /**
     * Obtiene todos los continentes.
     */
    public List<Continent> getAll() {
        return service.getAll();
    }

    /**
     * Obtiene un continente por su ID.
     */
    public Optional<Continent> getById(Long id) {
        return service.getById(id);
    }

    /**
     * Actualiza un continente existente.
     */
    public Continent update(Long id, Continent continent) {
        return service.update(id, continent);
    }

    /**
     * Elimina un continente por su ID.
     */
    public boolean delete(Long id) {
        return service.delete(id);
    }
}
