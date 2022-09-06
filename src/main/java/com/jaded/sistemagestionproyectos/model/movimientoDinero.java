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

    @Column(length = 20, nullable = false)
    private String conceptoMovimiento;

    @Column(columnDefinition = "decimal(15)", nullable = false)
    private float montoMovimiento;

    @ManyToOne
    @JoinColumn(name = "UsuarioEncargado", nullable = false)
    private com.jaded.sistemagestionproyectos.model.perfil perfil;

    @ManyToOne
    @JoinColumn(name = "Empresa", nullable = false)
    private com.jaded.sistemagestionproyectos.model.empresa empresa;


}
