package com.sena.aerolinea.geolocation.entities.models;

/**
 * Modelo de datos para Continente.
 * Define la estructura de la entidad Continent.
 */
public class Continent {
    /** Identificador único del continente */
    private Long id;
    /** Código del continente */
    private String code;
    /** Nombre del continente */
    private String name;
    /** Descripción del continente */
    private String description;

    // Getters y Setters
    /**
     * Obtiene el ID del continente.
     */
    public Long getId() { return id; }
    /**
     * Establece el ID del continente.
     */
    public void setId(Long id) { this.id = id; }
    /**
     * Obtiene el código del continente.
     */
    public String getCode() { return code; }
    /**
     * Establece el código del continente.
     */
    public void setCode(String code) { this.code = code; }
    /**
     * Obtiene el nombre del continente.
     */
    public String getName() { return name; }
    /**
     * Establece el nombre del continente.
     */
    public void setName(String name) { this.name = name; }
    /**
     * Obtiene la descripción del continente.
     */
    public String getDescription() { return description; }
    /**
     * Establece la descripción del continente.
     */
    public void setDescription(String description) { this.description = description; }
}
