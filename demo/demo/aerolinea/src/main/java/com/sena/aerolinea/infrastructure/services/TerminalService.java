package com.sena.aerolinea.infrastructure.services;

import com.sena.aerolinea.infrastructure.entities.models.Terminal;
import com.sena.aerolinea.infrastructure.repositories.TerminalRepository;
import java.util.List;
import java.util.Optional;

/**
 * Servicio para la entidad Terminal.
 * Proporciona operaciones CRUD completas sobre Terminal.
 */
public class TerminalService {
    private final TerminalRepository repository;

    /**
     * Constructor que recibe el repositorio de Terminal.
     * @param repository instancia de TerminalRepository
     */
    public TerminalService(TerminalRepository repository) {
        this.repository = repository;
    }

    /**
     * Crea una nueva terminal.
     * @param terminal entidad a crear
     * @return terminal creada
     */
    public Terminal create(Terminal terminal) {
        return repository.save(terminal);
    }

    /**
     * Obtiene todas las terminales.
     * @return lista de terminales
     */
    public List<Terminal> getAll() {
        return repository.findAll();
    }

    /**
     * Obtiene una terminal por su ID.
     * @param id identificador de la terminal
     * @return terminal encontrada o vacío
     */
    public Optional<Terminal> getById(Long id) {
        return repository.findById(id);
    }

    /**
     * Actualiza una terminal existente.
     * @param id identificador de la terminal
     * @param terminal datos actualizados
     * @return terminal actualizada o null si no existe
     */
    public Terminal update(Long id, Terminal terminal) {
        Optional<Terminal> existing = repository.findById(id);
        if (existing.isPresent()) {
            terminal.setId(id);
            return repository.save(terminal);
        }
        return null;
    }

    /**
     * Elimina una terminal por su ID.
     * @param id identificador de la terminal
     * @return true si existe y se elimina, false si no existe
     */
    public boolean delete(Long id) {
        return repository.findById(id).isPresent();
    }
}
