package com.sena.aerolinea.parameterization.entities.dto;

/**
 * DTO para transferencia de datos de Rol de Tripulación.
 * Utilizado en operaciones de creación y actualización.
 */

public class CrewRoleDTO {
    /** Identificador único del rol de tripulación */
    private Long id;
    /** Código del rol de tripulación */
    private String code;
    /** Nombre del rol de tripulación */
    private String name;
    /** Descripción del rol de tripulación */
    private String description;

    /** Obtiene el ID del rol de tripulación. */
    public Long getId() { return id; }
    /** Establece el ID del rol de tripulación. */
    public void setId(Long id) { this.id = id; }
    /** Obtiene el código del rol de tripulación. */
    public String getCode() { return code; }
    /** Establece el código del rol de tripulación. */
    public void setCode(String code) { this.code = code; }
    /** Obtiene el nombre del rol de tripulación. */
    public String getName() { return name; }
    /** Establece el nombre del rol de tripulación. */
    public void setName(String name) { this.name = name; }
    /** Obtiene la descripción del rol de tripulación. */
    public String getDescription() { return description; }
    /** Establece la descripción del rol de tripulación. */
    public void setDescription(String description) { this.description = description; }
}
