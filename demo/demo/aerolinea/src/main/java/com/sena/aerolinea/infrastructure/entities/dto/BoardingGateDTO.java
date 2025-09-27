package com.sena.aerolinea.infrastructure.entities.dto;

/**
 * DTO para transferencia de datos de Puerta de Embarque.
 * Utilizado en operaciones de creación y actualización.
 */
public class BoardingGateDTO {
    /** Código de la puerta de embarque */
    private String code;
    /** Nombre de la puerta de embarque */
    private String name;
    /** ID de la terminal a la que pertenece */
    private Long terminalId;

    /** Obtiene el código de la puerta de embarque. */
    public String getCode() { return code; }
    /** Establece el código de la puerta de embarque. */
    public void setCode(String code) { this.code = code; }
    /** Obtiene el nombre de la puerta de embarque. */
    public String getName() { return name; }
    /** Establece el nombre de la puerta de embarque. */
    public void setName(String name) { this.name = name; }
    /** Obtiene el ID de la terminal. */
    public Long getTerminalId() { return terminalId; }
    /** Establece el ID de la terminal. */
    public void setTerminalId(Long terminalId) { this.terminalId = terminalId; }
}
