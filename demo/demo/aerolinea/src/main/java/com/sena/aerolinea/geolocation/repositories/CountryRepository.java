package com.sena.aerolinea.geolocation.repositories;

import com.sena.aerolinea.geolocation.entities.models.Country;
import java.util.List;
import java.util.Optional;

/**
 * Repositorio para la entidad Country.
 * Proporciona operaciones de lectura y creación.
 */
public interface CountryRepository {
    /**
     * Guarda un nuevo país.
     * @param country entidad a guardar
     * @return país guardado
     */
    Country save(Country country);
    /**
     * Obtiene todos los países.
     * @return lista de países
     */
    List<Country> findAll();
    /**
     * Busca un país por su ID.
     * @param id identificador del país
     * @return país encontrado o vacío
     */
    Optional<Country> findById(Long id);
}
