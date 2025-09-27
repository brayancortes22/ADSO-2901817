package com.sena.aerolinea.geolocation.repositories;

import com.sena.aerolinea.geolocation.entities.models.City;
import java.util.List;
import java.util.Optional;

/**
 * Repositorio para la entidad City.
 * Proporciona operaciones de lectura y creación.
 */
public interface CityRepository {
    /**
     * Guarda una nueva ciudad.
     * @param city entidad a guardar
     * @return ciudad guardada
     */
    City save(City city);
    /**
     * Obtiene todas las ciudades.
     * @return lista de ciudades
     */
    List<City> findAll();
    /**
     * Busca una ciudad por su ID.
     * @param id identificador de la ciudad
     * @return ciudad encontrada o vacío
     */
    Optional<City> findById(Long id);
}
