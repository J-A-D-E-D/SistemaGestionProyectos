package com.jaded.sistemagestionproyectos.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Transaction")
public class movimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdMovimientoDinero;

    @Column(length = 20)
    private String conceptoMovimiento;

    @Column(columnDefinition = "decimal(15)")
    private float montoMovimiento;

    @ManyToOne
    @JoinColumn(name = "IdEmpleado")
    private com.jaded.sistemagestionproyectos.model.empleado empleado;

    @ManyToOne
    @JoinColumn(name = "Empresa")
    private com.jaded.sistemagestionproyectos.model.empresa empresa;


}
