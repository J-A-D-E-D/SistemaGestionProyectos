package ProyectoFinal.Model;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;


@Data
@Entity
@Table(name = "Employee")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdEmpleado;

    @Column(length = 70, nullable = false)
    private String correoEmpleado;

    @OneToOne
    @JoinColumn(name = "id_user", nullable = false)
    private Perfil perfil;

    @ManyToOne
    @JoinColumn(name= "role", nullable = false)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "EmpresaEmpleado", nullable = false)
    private Empresa empresa;

    @OneToMany
    @JoinColumn(name ="Transaction", nullable = false)
    private MovimientoDinero movimientoDinero;



}
