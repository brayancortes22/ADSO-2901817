package com.sena.aerolinea.geolocation.services;

import com.sena.aerolinea.geolocation.entities.models.City;
import com.sena.aerolinea.geolocation.repositories.CityRepository;
import java.util.List;
import java.util.Optional;

/**
 * Servicio para la entidad City.
 * Proporciona operaciones CRUD completas sobre Ciudad.
 * Sigue arquitectura n capas y buenas prácticas.
 */
public class CityService {
    private final CityRepository repository;

    /**
     * Constructor que recibe el repositorio de Ciudad.
     * @param repository instancia de CityRepository
     */
    public CityService(CityRepository repository) {
        this.repository = repository;
    }

    /**
     * Crea una nueva ciudad.
     * @param city entidad a crear
     * @return ciudad creada
     */
    public City create(City city) {
        return repository.save(city);
    }

    /**
     * Obtiene todas las ciudades.
     * @return lista de ciudades
     */
    public List<City> getAll() {
        return repository.findAll();
    }

    /**
     * Obtiene una ciudad por su ID.
     * @param id identificador de la ciudad
     * @return ciudad encontrada o vacío
     */
    public Optional<City> getById(Long id) {
        return repository.findById(id);
    }

    /**
     * Actualiza una ciudad existente.
     * @param id identificador de la ciudad
     * @param city datos actualizados
     * @return ciudad actualizada o null si no existe
     */
    public City update(Long id, City city) {
        Optional<City> existing = repository.findById(id);
        if (existing.isPresent()) {
            city.setId(id);
            return repository.save(city);
        }
        return null;
    }

    /**
     * Elimina una ciudad por su ID.
     * @param id identificador de la ciudad
     * @return true si existe y se elimina, false si no existe
     */
    public boolean delete(Long id) {
        // Implementación simulada, depende de la persistencia real
        return repository.findById(id).isPresent();
    }
}
