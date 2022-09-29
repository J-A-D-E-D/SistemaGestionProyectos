package com.jaded.sistemagestionproyectos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;


@Data
@Entity
@Table(name = "Employee")
public class empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmpleado;

    //@Email
    @Column(length = 70)
    private String correoEmpleado;

    @OneToOne
    @JoinColumn(name = "idperfil")
    private perfil perfilEmpleado;

    @ManyToOne
    @JoinColumn(name= "idrole")
    private rol rolEmpleado;

    @ManyToOne
    @JoinColumn(name = "idempresa")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private empresa empresaEmpleado;

    @Column
    private String password;

   /* @OneToMany
    @JoinColumn(name ="Transaction", nullable = false)
    private com.jaded.sistemagestionproyectos.model.movimientoDinero movimientoDinero;*/



}
