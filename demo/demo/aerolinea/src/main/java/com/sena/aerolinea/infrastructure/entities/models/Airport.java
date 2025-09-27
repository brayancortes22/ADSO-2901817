package com.sena.aerolinea.infrastructure.entities.models;

/**
 * Modelo de datos para Aeropuerto.
 * Define la estructura de la entidad Airport.
 */
public class Airport {
    /** Identificador único del aeropuerto */
    private Long id;
    /** Código del aeropuerto */
    private String code;
    /** Nombre del aeropuerto */
    private String name;
    /** Dirección del aeropuerto */
    private String address;
    /** ID de la ciudad donde se ubica el aeropuerto */
    private Long cityId;

    /** Obtiene el ID del aeropuerto. */
    public Long getId() { return id; }
    /** Establece el ID del aeropuerto. */
    public void setId(Long id) { this.id = id; }
    /** Obtiene el código del aeropuerto. */
    public String getCode() { return code; }
    /** Establece el código del aeropuerto. */
    public void setCode(String code) { this.code = code; }
    /** Obtiene el nombre del aeropuerto. */
    public String getName() { return name; }
    /** Establece el nombre del aeropuerto. */
    public void setName(String name) { this.name = name; }
    /** Obtiene la dirección del aeropuerto. */
    public String getAddress() { return address; }
    /** Establece la dirección del aeropuerto. */
    public void setAddress(String address) { this.address = address; }
    /** Obtiene el ID de la ciudad. */
    public Long getCityId() { return cityId; }
    /** Establece el ID de la ciudad. */
    public void setCityId(Long cityId) { this.cityId = cityId; }
}
