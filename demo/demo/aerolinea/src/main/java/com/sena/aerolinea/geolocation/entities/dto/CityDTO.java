package com.sena.aerolinea.geolocation.entities.dto;

/**
 * DTO para transferencia de datos de Ciudad.
 * Utilizado en operaciones de creación y actualización.
 */
public class CityDTO {
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
