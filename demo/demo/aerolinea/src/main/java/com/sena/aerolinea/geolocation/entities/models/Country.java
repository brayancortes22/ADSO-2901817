package com.sena.aerolinea.geolocation.entities.models;

/**
 * Modelo de datos para País.
 * Define la estructura de la entidad Country.
 */
public class Country {
    /** Identificador único del país */
    private Long id;
    /** Código del país */
    private String code;
    /** Nombre del país */
    private String name;
    /** Descripción del país */
    private String description;
    /** ID del continente al que pertenece */
    private Long continentId;

    // Getters y Setters
    /**
     * Obtiene el ID del país.
     */
    public Long getId() { return id; }
    /**
     * Establece el ID del país.
     */
    public void setId(Long id) { this.id = id; }
    /**
     * Obtiene el código del país.
     */
    public String getCode() { return code; }
    /**
     * Establece el código del país.
     */
    public void setCode(String code) { this.code = code; }
    /**
     * Obtiene el nombre del país.
     */
    public String getName() { return name; }
    /**
     * Establece el nombre del país.
     */
    public void setName(String name) { this.name = name; }
    /**
     * Obtiene la descripción del país.
     */
    public String getDescription() { return description; }
    /**
     * Establece la descripción del país.
     */
    public void setDescription(String description) { this.description = description; }
    /**
     * Obtiene el ID del continente.
     */
    public Long getContinentId() { return continentId; }
    /**
     * Establece el ID del continente.
     */
    public void setContinentId(Long continentId) { this.continentId = continentId; }
}
