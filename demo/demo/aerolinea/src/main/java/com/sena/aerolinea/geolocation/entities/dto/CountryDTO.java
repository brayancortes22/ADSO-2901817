package com.sena.aerolinea.geolocation.entities.dto;

/**
 * DTO para transferencia de datos de País.
 * Utilizado en operaciones de creación y actualización.
 */
public class CountryDTO {
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
