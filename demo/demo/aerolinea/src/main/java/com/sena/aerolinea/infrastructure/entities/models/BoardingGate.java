package com.sena.aerolinea.infrastructure.entities.models;

/**
 * Modelo de datos para Puerta de Embarque.
 * Define la estructura de la entidad BoardingGate.
 */
public class BoardingGate {
    /** Identificador único de la puerta de embarque */
    private Long id;
    /** Código de la puerta de embarque */
    private String code;
    /** Nombre de la puerta de embarque */
    private String name;
    /** ID de la terminal a la que pertenece */
    private Long terminalId;

    /** Obtiene el ID de la puerta de embarque. */
    public Long getId() { return id; }
    /** Establece el ID de la puerta de embarque. */
    public void setId(Long id) { this.id = id; }
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
