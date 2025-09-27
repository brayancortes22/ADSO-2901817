package com.sena.aerolinea.infrastructure.controllers;

import com.sena.aerolinea.infrastructure.entities.models.Terminal;
import com.sena.aerolinea.infrastructure.services.TerminalService;
import java.util.List;
import java.util.Optional;

/**
 * Controlador para la entidad Terminal.
 * Realiza operaciones CRUD completas sobre Terminal.
 */
public class TerminalController {
    private final TerminalService service;

    /**
     * Constructor que recibe el servicio de Terminal.
     */
    public TerminalController(TerminalService service) {
        this.service = service;
    }

    /**
     * Crea una nueva terminal.
     */
    public Terminal create(Terminal terminal) {
        return service.create(terminal);
    }

    /**
     * Obtiene todas las terminales.
     */
    public List<Terminal> getAll() {
        return service.getAll();
    }

    /**
     * Obtiene una terminal por su ID.
     */
    public Optional<Terminal> getById(Long id) {
        return service.getById(id);
    }

    /**
     * Actualiza una terminal existente.
     */
    public Terminal update(Long id, Terminal terminal) {
        return service.update(id, terminal);
    }

    /**
     * Elimina una terminal por su ID.
     */
    public boolean delete(Long id) {
        return service.delete(id);
    }
}
