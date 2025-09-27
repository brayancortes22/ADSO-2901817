package com.sena.aerolinea.parameterization.entities.models;

/**
 * Modelo de datos para Tipo de Vuelo.
 * Define la estructura de la entidad FlightType.
 */
public class FlightType {
    /** Identificador único del tipo de vuelo */
    private Long id;
    /** Código del tipo de vuelo */
    private String code;
    /** Nombre del tipo de vuelo */
    private String name;
    /** Descripción del tipo de vuelo */
    private String description;

    /** Obtiene el ID del tipo de vuelo. */
    public Long getId() { return id; }
    /** Establece el ID del tipo de vuelo. */
    public void setId(Long id) { this.id = id; }
    /** Obtiene el código del tipo de vuelo. */
    public String getCode() { return code; }
    /** Establece el código del tipo de vuelo. */
    public void setCode(String code) { this.code = code; }
    /** Obtiene el nombre del tipo de vuelo. */
    public String getName() { return name; }
    /** Establece el nombre del tipo de vuelo. */
    public void setName(String name) { this.name = name; }
    /** Obtiene la descripción del tipo de vuelo. */
    public String getDescription() { return description; }
    /** Establece la descripción del tipo de vuelo. */
    public void setDescription(String description) { this.description = description; }
}
