package com.sena.aerolinea.parameterization.services;

import com.sena.aerolinea.parameterization.entities.models.FlightType;
import com.sena.aerolinea.parameterization.repositories.FlightTypeRepository;
import java.util.List;
import java.util.Optional;

/**
 * Servicio para la entidad FlightType.
 * Proporciona operaciones CRUD completas sobre Tipo de Vuelo.
 */
public class FlightTypeService {
    private final FlightTypeRepository repository;

    /**
     * Constructor que recibe el repositorio de Tipo de Vuelo.
     * @param repository instancia de FlightTypeRepository
     */
    public FlightTypeService(FlightTypeRepository repository) {
        this.repository = repository;
    }

    /**
     * Crea un nuevo tipo de vuelo.
     * @param flightType entidad a crear
     * @return tipo de vuelo creado
     */
    public FlightType create(FlightType flightType) {
        return repository.save(flightType);
    }

    /**
     * Obtiene todos los tipos de vuelo.
     * @return lista de tipos de vuelo
     */
    public List<FlightType> getAll() {
        return repository.findAll();
    }

    /**
     * Obtiene un tipo de vuelo por su ID.
     * @param id identificador del tipo de vuelo
     * @return tipo de vuelo encontrado o vacío
     */
    public Optional<FlightType> getById(Long id) {
        return repository.findById(id);
    }

    /**
     * Actualiza un tipo de vuelo existente.
     * @param id identificador del tipo de vuelo
     * @param flightType datos actualizados
     * @return tipo de vuelo actualizado o null si no existe
     */
    public FlightType update(Long id, FlightType flightType) {
        Optional<FlightType> existing = repository.findById(id);
        if (existing.isPresent()) {
            flightType.setId(id);
            return repository.save(flightType);
        }
        return null;
    }

    /**
     * Elimina un tipo de vuelo por su ID.
     * @param id identificador del tipo de vuelo
     * @return true si existe y se elimina, false si no existe
     */
    public boolean delete(Long id) {
        return repository.findById(id).isPresent();
    }
}
