package com.sena.aerolinea.infrastructure.services;

import com.sena.aerolinea.infrastructure.entities.models.Airport;
import com.sena.aerolinea.infrastructure.repositories.AirportRepository;
import java.util.List;
import java.util.Optional;

/**
 * Servicio para la entidad Airport.
 * Proporciona operaciones CRUD completas sobre Aeropuerto.
 */
public class AirportService {
    private final AirportRepository repository;

    /**
     * Constructor que recibe el repositorio de Aeropuerto.
     * @param repository instancia de AirportRepository
     */
    public AirportService(AirportRepository repository) {
        this.repository = repository;
    }

    /**
     * Crea un nuevo aeropuerto.
     * @param airport entidad a crear
     * @return aeropuerto creado
     */
    public Airport create(Airport airport) {
        return repository.save(airport);
    }

    /**
     * Obtiene todos los aeropuertos.
     * @return lista de aeropuertos
     */
    public List<Airport> getAll() {
        return repository.findAll();
    }

    /**
     * Obtiene un aeropuerto por su ID.
     * @param id identificador del aeropuerto
     * @return aeropuerto encontrado o vacío
     */
    public Optional<Airport> getById(Long id) {
        return repository.findById(id);
    }

    /**
     * Actualiza un aeropuerto existente.
     * @param id identificador del aeropuerto
     * @param airport datos actualizados
     * @return aeropuerto actualizado o null si no existe
     */
    public Airport update(Long id, Airport airport) {
        Optional<Airport> existing = repository.findById(id);
        if (existing.isPresent()) {
            airport.setId(id);
            return repository.save(airport);
        }
        return null;
    }

    /**
     * Elimina un aeropuerto por su ID.
     * @param id identificador del aeropuerto
     * @return true si existe y se elimina, false si no existe
     */
    public boolean delete(Long id) {
        return repository.findById(id).isPresent();
    }
}
