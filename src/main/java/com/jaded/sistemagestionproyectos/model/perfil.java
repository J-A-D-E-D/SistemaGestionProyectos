package com.jaded.sistemagestionproyectos.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Profile")

public class perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdPerfil;

    @Column(length = 70, nullable = false)
    private String nombreUsuario;

    @Column(length = 20, nullable = false)
    private String telefonoUsuario;

    @Column(length = 30, nullable = false)
    private String imagenUsuario;

    @OneToOne
    @JoinColumn(name = "Id_Empleado", nullable = false)
    private empleado usuario;
}
