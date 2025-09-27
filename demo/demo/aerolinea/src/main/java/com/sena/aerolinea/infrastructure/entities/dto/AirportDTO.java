package com.sena.aerolinea.infrastructure.entities.dto;

/**
 * DTO para transferencia de datos de Aeropuerto.
 * Utilizado en operaciones de creación y actualización.
 */
public class AirportDTO {
    /** Código del aeropuerto */
    private String code;
    /** Nombre del aeropuerto */
    private String name;
    /** Dirección del aeropuerto */
    private String address;
    /** ID de la ciudad donde se ubica el aeropuerto */
    private Long cityId;

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
