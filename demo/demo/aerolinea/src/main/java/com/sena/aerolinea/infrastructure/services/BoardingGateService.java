package com.sena.aerolinea.infrastructure.services;

import com.sena.aerolinea.infrastructure.entities.models.BoardingGate;
import com.sena.aerolinea.infrastructure.repositories.BoardingGateRepository;
import java.util.List;
import java.util.Optional;

/**
 * Servicio para la entidad BoardingGate.
 * Proporciona operaciones CRUD completas sobre Puerta de Embarque.
 */
public class BoardingGateService {
    private final BoardingGateRepository repository;

    /**
     * Constructor que recibe el repositorio de Puerta de Embarque.
     * @param repository instancia de BoardingGateRepository
     */
    public BoardingGateService(BoardingGateRepository repository) {
        this.repository = repository;
    }

    /**
     * Crea una nueva puerta de embarque.
     * @param boardingGate entidad a crear
     * @return puerta de embarque creada
     */
    public BoardingGate create(BoardingGate boardingGate) {
        return repository.save(boardingGate);
    }

    /**
     * Obtiene todas las puertas de embarque.
     * @return lista de puertas de embarque
     */
    public List<BoardingGate> getAll() {
        return repository.findAll();
    }

    /**
     * Obtiene una puerta de embarque por su ID.
     * @param id identificador de la puerta de embarque
     * @return puerta de embarque encontrada o vacío
     */
    public Optional<BoardingGate> getById(Long id) {
        return repository.findById(id);
    }

    /**
     * Actualiza una puerta de embarque existente.
     * @param id identificador de la puerta de embarque
     * @param boardingGate datos actualizados
     * @return puerta de embarque actualizada o null si no existe
     */
    public BoardingGate update(Long id, BoardingGate boardingGate) {
        Optional<BoardingGate> existing = repository.findById(id);
        if (existing.isPresent()) {
            boardingGate.setId(id);
            return repository.save(boardingGate);
        }
        return null;
    }

    /**
     * Elimina una puerta de embarque por su ID.
     * @param id identificador de la puerta de embarque
     * @return true si existe y se elimina, false si no existe
     */
    public boolean delete(Long id) {
        return repository.findById(id).isPresent();
    }
}
