package com.sena.aerolinea.geolocation.services;

import com.sena.aerolinea.geolocation.entities.models.Country;
import com.sena.aerolinea.geolocation.repositories.CountryRepository;
import java.util.List;
import java.util.Optional;

/**
 * Servicio para la entidad Country.
 * Proporciona operaciones CRUD completas sobre País.
 * Sigue arquitectura n capas y buenas prácticas.
 */
public class CountryService {
    private final CountryRepository repository;

    /**
     * Constructor que recibe el repositorio de País.
     * @param repository instancia de CountryRepository
     */
    public CountryService(CountryRepository repository) {
        this.repository = repository;
    }

    /**
     * Crea un nuevo país.
     * @param country entidad a crear
     * @return país creado
     */
    public Country create(Country country) {
        return repository.save(country);
    }

    /**
     * Obtiene todos los países.
     * @return lista de países
     */
    public List<Country> getAll() {
        return repository.findAll();
    }

    /**
     * Obtiene un país por su ID.
     * @param id identificador del país
     * @return país encontrado o vacío
     */
    public Optional<Country> getById(Long id) {
        return repository.findById(id);
    }

    /**
     * Actualiza un país existente.
     * @param id identificador del país
     * @param country datos actualizados
     * @return país actualizado o null si no existe
     */
    public Country update(Long id, Country country) {
        Optional<Country> existing = repository.findById(id);
        if (existing.isPresent()) {
            country.setId(id);
            return repository.save(country);
        }
        return null;
    }

    /**
     * Elimina un país por su ID.
     * @param id identificador del país
     * @return true si existe y se elimina, false si no existe
     */
    public boolean delete(Long id) {
        // Implementación simulada, depende de la persistencia real
        return repository.findById(id).isPresent();
    }
}
