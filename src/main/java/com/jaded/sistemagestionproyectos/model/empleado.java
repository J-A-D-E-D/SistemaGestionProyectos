package com.jaded.sistemagestionproyectos.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "Employee")
public class empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdEmpleado;

    @Column(length = 70, nullable = false)
    private String correoEmpleado;

    @OneToOne
    @JoinColumn(name = "id_user", nullable = false)
    private com.jaded.sistemagestionproyectos.model.perfil perfil;

    @OneToOne
    @JoinColumn(name= "rol", nullable = false)
    private rol rol;

    @ManyToOne
    @JoinColumn(name = "EmpresaEmpleado", nullable = false)
    private com.jaded.sistemagestionproyectos.model.empresa empresa;

   /* @OneToMany
    @JoinColumn(name ="Transaction", nullable = false)
    private com.jaded.sistemagestionproyectos.model.movimientoDinero movimientoDinero;*/



}
