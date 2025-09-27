package com.sena.aerolinea.geolocation.entities.dto;

/**
 * DTO para transferencia de datos de Estado.
 * Utilizado en operaciones de creación y actualización.
 */
public class StateDTO {
    /** Código del estado */
    private String code;
    /** Nombre del estado */
    private String name;
    /** Descripción del estado */
    private String description;
    /** ID del país al que pertenece */
    private Long countryId;

    // Getters y Setters
    /**
     * Obtiene el código del estado.
     */
    public String getCode() { return code; }
    /**
     * Establece el código del estado.
     */
    public void setCode(String code) { this.code = code; }
    /**
     * Obtiene el nombre del estado.
     */
    public String getName() { return name; }
    /**
     * Establece el nombre del estado.
     */
    public void setName(String name) { this.name = name; }
    /**
     * Obtiene la descripción del estado.
     */
    public String getDescription() { return description; }
    /**
     * Establece la descripción del estado.
     */
    public void setDescription(String description) { this.description = description; }
    /**
     * Obtiene el ID del país.
     */
    public Long getCountryId() { return countryId; }
    /**
     * Establece el ID del país.
     */
    public void setCountryId(Long countryId) { this.countryId = countryId; }
}
