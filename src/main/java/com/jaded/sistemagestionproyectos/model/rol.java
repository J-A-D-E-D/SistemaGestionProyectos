package com.jaded.sistemagestionproyectos.model;

import javax.persistence.*;

@Entity
@Table(name = "rol")
public class rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdRole;

    @Column(length = 80)
    private String NombreRol;

}
