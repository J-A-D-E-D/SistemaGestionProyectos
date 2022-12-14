package com.jaded.sistemagestionproyectos.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Enterprise")
public class empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmpresa;

    @Column(length = 40)
    private String nombreEmpresa;

    @Column(length = 20)
    private String nitEmpresa;

    @Column(length = 20)
    private String telefonoEmpresa;

    @Column(length = 80)
    private String direccionEmpresa;

/*    @OneToMany
    @JoinColumn(name = "Usuario", nullable = false)
    private com.jaded.sistemagestionproyectos.model.perfil perfil;

    @OneToMany
    @JoinColumn(name = "Transaction", nullable = false)
    private com.jaded.sistemagestionproyectos.model.movimientoDinero movimientoDinero;*/



}
