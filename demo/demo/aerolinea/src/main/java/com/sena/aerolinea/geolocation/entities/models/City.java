package com.sena.aerolinea.geolocation.entities.models;

/**
 * Modelo de datos para Ciudad.
 * Define la estructura de la entidad City.
 */
public class City {
    /** Identificador único de la ciudad */
    private Long id;
    /** Código de la ciudad */
    private String code;
    /** Nombre de la ciudad */
    private String name;
    /** Descripción de la ciudad */
    private String description;
    /** ID del estado al que pertenece */
    private Long stateId;

    // Getters y Setters
    /**
     * Obtiene el ID de la ciudad.
     */
    public Long getId() { return id; }
    /**
     * Establece el ID de la ciudad.
     */
    public void setId(Long id) { this.id = id; }
    /**
     * Obtiene el código de la ciudad.
     */
    public String getCode() { return code; }
    /**
     * Establece el código de la ciudad.
     */
    public void setCode(String code) { this.code = code; }
    /**
     * Obtiene el nombre de la ciudad.
     */
    public String getName() { return name; }
    /**
     * Establece el nombre de la ciudad.
     */
    public void setName(String name) { this.name = name; }
    /**
     * Obtiene la descripción de la ciudad.
     */
    public String getDescription() { return description; }
    /**
     * Establece la descripción de la ciudad.
     */
    public void setDescription(String description) { this.description = description; }
    /**
     * Obtiene el ID del estado.
     */
    public Long getStateId() { return stateId; }
    /**
     * Establece el ID del estado.
     */
    public void setStateId(Long stateId) { this.stateId = stateId; }
}
