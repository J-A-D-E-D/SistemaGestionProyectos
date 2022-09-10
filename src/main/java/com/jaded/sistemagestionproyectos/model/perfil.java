package com.jaded.sistemagestionproyectos.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Profile")

public class perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPerfil;

    @Column(length = 70)
    private String nombreUsuario;

    @Column(length = 20)
    private String telefonoUsuario;

    @Column(length = 30)
    private String imagenUsuario;

   /* @OneToOne
    @JoinColumn(name = "Id_Empleado", nullable = false)
    private empleado usuario;*/
}
