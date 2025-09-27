package com.sena.aerolinea.parameterization.services;

import com.sena.aerolinea.parameterization.entities.models.AircraftType;
import com.sena.aerolinea.parameterization.repositories.AircraftTypeRepository;
import java.util.List;
import java.util.Optional;

/**
 * Servicio para la entidad AircraftType.
 * Proporciona operaciones CRUD completas sobre Tipo de Aeronave.
 */
public class AircraftTypeService {
    private final AircraftTypeRepository repository;

    /**
     * Constructor que recibe el repositorio de Tipo de Aeronave.
     * @param repository instancia de AircraftTypeRepository
     */
    public AircraftTypeService(AircraftTypeRepository repository) {
        this.repository = repository;
    }

    /**
     * Crea un nuevo tipo de aeronave.
     * @param aircraftType entidad a crear
     * @return tipo de aeronave creado
     */
    public AircraftType create(AircraftType aircraftType) {
        return repository.save(aircraftType);
    }

    /**
     * Obtiene todos los tipos de aeronave.
     * @return lista de tipos de aeronave
     */
    public List<AircraftType> getAll() {
        return repository.findAll();
    }

    /**
     * Obtiene un tipo de aeronave por su ID.
     * @param id identificador del tipo de aeronave
     * @return tipo de aeronave encontrado o vacío
     */
    public Optional<AircraftType> getById(Long id) {
        return repository.findById(id);
    }

    /**
     * Actualiza un tipo de aeronave existente.
     * @param id identificador del tipo de aeronave
     * @param aircraftType datos actualizados
     * @return tipo de aeronave actualizado o null si no existe
     */
    public AircraftType update(Long id, AircraftType aircraftType) {
        Optional<AircraftType> existing = repository.findById(id);
        if (existing.isPresent()) {
            aircraftType.setId(id);
            return repository.save(aircraftType);
        }
        return null;
    }

    /**
     * Elimina un tipo de aeronave por su ID.
     * @param id identificador del tipo de aeronave
     * @return true si existe y se elimina, false si no existe
     */
    public boolean delete(Long id) {
        return repository.findById(id).isPresent();
    }
}
