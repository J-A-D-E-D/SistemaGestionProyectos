package ProyectoFinal.Model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdRole;

    private String NombreRol;

}
