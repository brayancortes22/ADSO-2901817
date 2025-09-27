package com.sena.aerolinea.infrastructure.controllers;

import com.sena.aerolinea.infrastructure.entities.models.BoardingGate;
import com.sena.aerolinea.infrastructure.services.BoardingGateService;
import java.util.List;
import java.util.Optional;

/**
 * Controlador para la entidad BoardingGate.
 * Realiza operaciones CRUD completas sobre Puerta de Embarque.
 */
public class BoardingGateController {
    private final BoardingGateService service;

    /**
     * Constructor que recibe el servicio de Puerta de Embarque.
     */
    public BoardingGateController(BoardingGateService service) {
        this.service = service;
    }

    /**
     * Crea una nueva puerta de embarque.
     */
    public BoardingGate create(BoardingGate boardingGate) {
        return service.create(boardingGate);
    }

    /**
     * Obtiene todas las puertas de embarque.
     */
    public List<BoardingGate> getAll() {
        return service.getAll();
    }

    /**
     * Obtiene una puerta de embarque por su ID.
     */
    public Optional<BoardingGate> getById(Long id) {
        return service.getById(id);
    }

    /**
     * Actualiza una puerta de embarque existente.
     */
    public BoardingGate update(Long id, BoardingGate boardingGate) {
        return service.update(id, boardingGate);
    }

    /**
     * Elimina una puerta de embarque por su ID.
     */
    public boolean delete(Long id) {
        return service.delete(id);
    }
}
