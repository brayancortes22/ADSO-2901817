package com.sena.aerolinea.geolocation.entities.dto;

/**
 * DTO para transferencia de datos de Continente.
 * Utilizado en operaciones de creación y actualización.
 */
public class ContinentDTO {
    /** Código del continente */
    private String code;
    /** Nombre del continente */
    private String name;
    /** Descripción del continente */
    private String description;

    // Getters y Setters
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
