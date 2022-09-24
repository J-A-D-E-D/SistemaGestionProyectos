package com.jaded.sistemagestionproyectos.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Transaction")
public class movimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdMovimientoDinero;

    @Column(length = 20)
    private String conceptoMovimiento;

    @Column(columnDefinition = "decimal(15)")
    private long montoMovimiento;

    @ManyToOne
    @JoinColumn(name = "IdEmpleado")
    private empleado empleadoAsignado;

   /* @ManyToOne
    @JoinColumn(name = "Empresa")
    private empresa empresa;
*/

}
