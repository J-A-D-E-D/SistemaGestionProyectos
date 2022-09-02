package ProyectoFinal.Model;

import lombok.Data;
import javax.persistence.Entity;


@Data
@Entity
public class Empleado {
    private String nombreEmpleado;
    private String correoEmpleado;
    private String empresaEmpleado;
    private String rolEmpleado;

}
