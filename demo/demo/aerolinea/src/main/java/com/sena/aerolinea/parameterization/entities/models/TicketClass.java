package com.sena.aerolinea.parameterization.entities.models;

/**
 * Modelo de datos para Clase de Ticket.
 * Define la estructura de la entidad TicketClass.
 */
public class TicketClass {
    /** Identificador único de la clase de ticket */
    private Long id;
    /** Código de la clase de ticket */
    private String code;
    /** Nombre de la clase de ticket */
    private String name;
    /** Descripción de la clase de ticket */
    private String description;

    /** Obtiene el ID de la clase de ticket. */
    public Long getId() { return id; }
    /** Establece el ID de la clase de ticket. */
    public void setId(Long id) { this.id = id; }
    /** Obtiene el código de la clase de ticket. */
    public String getCode() { return code; }
    /** Establece el código de la clase de ticket. */
    public void setCode(String code) { this.code = code; }
    /** Obtiene el nombre de la clase de ticket. */
    public String getName() { return name; }
    /** Establece el nombre de la clase de ticket. */
    public void setName(String name) { this.name = name; }
    /** Obtiene la descripción de la clase de ticket. */
    public String getDescription() { return description; }
    /** Establece la descripción de la clase de ticket. */
    public void setDescription(String description) { this.description = description; }
}
