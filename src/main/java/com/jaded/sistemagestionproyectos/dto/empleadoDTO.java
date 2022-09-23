package com.jaded.sistemagestionproyectos.dto;

import com.jaded.sistemagestionproyectos.model.empresa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class empleadoDTO {
        /*@Min(1)
        @Max(999)*/
        private Integer idEmpleado;
        private String correoEmpleado;
        private empresaDTO empresaEmpleado;
        private perfilDTO perfilEmpleado;
        private roleDTO rolEmpleado;
        // comentario de prueba Julio //
    }
