package com.jaded.sistemagestionproyectos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class empleadoDTO {
        @Min(1)
        @Max(999)
        private Integer idEmpleado;
        private String correoEmpleado;
        private String empresaEmpleado;
        private String perfilEmpleado;
        private String rolEmpleado;
        // comentario de prueba Julio //
    }
