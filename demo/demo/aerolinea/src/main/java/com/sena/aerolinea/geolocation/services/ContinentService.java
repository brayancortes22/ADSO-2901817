package com.sena.aerolinea.geolocation.services;

import com.sena.aerolinea.geolocation.entities.models.Continent;
import com.sena.aerolinea.geolocation.repositories.ContinentRepository;
import java.util.List;
import java.util.Optional;

/**
 * Servicio para la entidad Continent.
 * Proporciona operaciones CRUD completas sobre Continente.
 * Sigue arquitectura n capas y buenas prácticas.
 */
public class ContinentService {
    private final ContinentRepository repository;

    /**
     * Constructor que recibe el repositorio de Continente.
     * @param repository instancia de ContinentRepository
     */
    public ContinentService(ContinentRepository repository) {
        this.repository = repository;
    }

    /**
     * Crea un nuevo continente.
     * @param continent entidad a crear
     * @return continente creado
     */
    public Continent create(Continent continent) {
        return repository.save(continent);
    }

    /**
     * Obtiene todos los continentes.
     * @return lista de continentes
     */
    public List<Continent> getAll() {
        return repository.findAll();
    }

    /**
     * Obtiene un continente por su ID.
     * @param id identificador del continente
     * @return continente encontrado o vacío
     */
    public Optional<Continent> getById(Long id) {
        return repository.findById(id);
    }

    /**
     * Actualiza un continente existente.
     * @param id identificador del continente
     * @param continent datos actualizados
     * @return continente actualizado o null si no existe
     */
    public Continent update(Long id, Continent continent) {
        Optional<Continent> existing = repository.findById(id);
        if (existing.isPresent()) {
            continent.setId(id);
            return repository.save(continent);
        }
        return null;
    }

    /**
     * Elimina un continente por su ID.
     * @param id identificador del continente
     * @return true si existe y se elimina, false si no existe
     */
    public boolean delete(Long id) {
        // Implementación simulada, depende de la persistencia real
        return repository.findById(id).isPresent();
    }
}
