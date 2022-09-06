package com.jaded.sistemagestionproyectos.model;

import javax.persistence.*;

@Entity
@Table(name = "rol")
public class rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdRole;

    private String NombreRol;

}
