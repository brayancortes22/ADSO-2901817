package com.sena.aerolinea.infrastructure.entities.models;

/**
 * Modelo de datos para Terminal.
 * Define la estructura de la entidad Terminal.
 */
public class Terminal {
    /** Identificador único de la terminal */
    private Long id;
    /** Código de la terminal */
    private String code;
    /** Nombre de la terminal */
    private String name;
    /** ID del aeropuerto al que pertenece la terminal */
    private Long airportId;

    /** Obtiene el ID de la terminal. */
    public Long getId() { return id; }
    /** Establece el ID de la terminal. */
    public void setId(Long id) { this.id = id; }
    /** Obtiene el código de la terminal. */
    public String getCode() { return code; }
    /** Establece el código de la terminal. */
    public void setCode(String code) { this.code = code; }
    /** Obtiene el nombre de la terminal. */
    public String getName() { return name; }
    /** Establece el nombre de la terminal. */
    public void setName(String name) { this.name = name; }
    /** Obtiene el ID del aeropuerto. */
    public Long getAirportId() { return airportId; }
    /** Establece el ID del aeropuerto. */
    public void setAirportId(Long airportId) { this.airportId = airportId; }
}
