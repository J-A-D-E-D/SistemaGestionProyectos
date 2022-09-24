package com.jaded.sistemagestionproyectos.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "rol")
public class rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdRole;

    @Column(length = 80)
    private String NombreRol;

}
