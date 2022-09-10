package com.jaded.sistemagestionproyectos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class perfilDTO {
    private Integer idPerfil;
    private String nombreUsuario;
    private String imagenUsuario;
    private String telefonoUsuario;
    //private Integer idEmpleado;

}
