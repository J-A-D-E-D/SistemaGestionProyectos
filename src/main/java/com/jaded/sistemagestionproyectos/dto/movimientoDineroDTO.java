package com.jaded.sistemagestionproyectos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class movimientoDineroDTO {

    private Integer idMovimiento;
    private long montoMovimiento;
    private String conceptoMovimiento;
    private empleadoDTO empleadoAsignado;
}
