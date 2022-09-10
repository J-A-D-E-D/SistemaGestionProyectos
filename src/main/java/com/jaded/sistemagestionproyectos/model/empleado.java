package com.jaded.sistemagestionproyectos.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;


@Data
@Entity
@Table(name = "Employee")
public class empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmpleado;

    //@Email
    @Column(length = 70)
    private String correoEmpleado;

    @OneToOne
    @JoinColumn(name = "idPerfil")
    private perfil perfilEmpleado;

    @OneToOne
    @JoinColumn(name= "rol")
    private rol rolEmpleado;

    @ManyToOne
    @JoinColumn(name = "EmpresaEmpleado")
    private empresa empresaEmpleado;

   /* @OneToMany
    @JoinColumn(name ="Transaction", nullable = false)
    private com.jaded.sistemagestionproyectos.model.movimientoDinero movimientoDinero;*/



}
