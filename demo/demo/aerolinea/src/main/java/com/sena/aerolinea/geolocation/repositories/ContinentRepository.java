package com.sena.aerolinea.geolocation.repositories;

import com.sena.aerolinea.geolocation.entities.models.Continent;
import java.util.List;
import java.util.Optional;

/**
 * Repositorio para la entidad Continent.
 * Proporciona operaciones de lectura y creación.
 */
public interface ContinentRepository {
    /**
     * Guarda un nuevo continente.
     * @param continent entidad a guardar
     * @return continente guardado
     */
    Continent save(Continent continent);
    /**
     * Obtiene todos los continentes.
     * @return lista de continentes
     */
    List<Continent> findAll();
    /**
     * Busca un continente por su ID.
     * @param id identificador del continente
     * @return continente encontrado o vacío
     */
    Optional<Continent> findById(Long id);
}
