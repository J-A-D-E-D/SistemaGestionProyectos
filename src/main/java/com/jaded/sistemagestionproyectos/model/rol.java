package com.jaded.sistemagestionproyectos.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdRole;

    private String NombreRol;

}
