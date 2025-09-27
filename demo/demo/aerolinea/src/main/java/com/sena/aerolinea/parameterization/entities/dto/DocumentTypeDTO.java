package com.sena.aerolinea.parameterization.entities.dto;

/**
 * DTO para transferencia de datos de Tipo de Documento.
 * Utilizado en operaciones de creación y actualización.
 */

public class DocumentTypeDTO {
    /** Identificador único del tipo de documento */
    private Long id;
    /** Código del tipo de documento */
    private String code;
    /** Nombre del tipo de documento */
    private String name;
    /** Descripción del tipo de documento */
    private String description;

    /** Obtiene el ID del tipo de documento. */
    public Long getId() { return id; }
    /** Establece el ID del tipo de documento. */
    public void setId(Long id) { this.id = id; }
    /** Obtiene el código del tipo de documento. */
    public String getCode() { return code; }
    /** Establece el código del tipo de documento. */
    public void setCode(String code) { this.code = code; }
    /** Obtiene el nombre del tipo de documento. */
    public String getName() { return name; }
    /** Establece el nombre del tipo de documento. */
    public void setName(String name) { this.name = name; }
    /** Obtiene la descripción del tipo de documento. */
    public String getDescription() { return description; }
    /** Establece la descripción del tipo de documento. */
    public void setDescription(String description) { this.description = description; }
}
