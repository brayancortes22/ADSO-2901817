package com.sena.aerolinea.parameterization.entities.models;

/**
 * Modelo de datos para Tipo de Aeronave.
 * Define la estructura de la entidad AircraftType.
 */
public class AircraftType {
    /** Identificador único del tipo de aeronave */
    private Long id;
    /** Código del tipo de aeronave */
    private String code;
    /** Nombre del tipo de aeronave */
    private String name;
    /** Descripción del tipo de aeronave */
    private String description;

    /** Obtiene el ID del tipo de aeronave. */
    public Long getId() { return id; }
    /** Establece el ID del tipo de aeronave. */
    public void setId(Long id) { this.id = id; }
    /** Obtiene el código del tipo de aeronave. */
    public String getCode() { return code; }
    /** Establece el código del tipo de aeronave. */
    public void setCode(String code) { this.code = code; }
    /** Obtiene el nombre del tipo de aeronave. */
    public String getName() { return name; }
    /** Establece el nombre del tipo de aeronave. */
    public void setName(String name) { this.name = name; }
    /** Obtiene la descripción del tipo de aeronave. */
    public String getDescription() { return description; }
    /** Establece la descripción del tipo de aeronave. */
    public void setDescription(String description) { this.description = description; }
}
