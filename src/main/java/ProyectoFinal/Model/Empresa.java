package ProyectoFinal.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Enterprise")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdEmpresa;

    @Column(length = 40, nullable = false)
    private String nombreEmpresa;

    @Column(length = 20, nullable = false)
    private String nitEmpresa;

    @Column(length = 20, nullable = false)
    private String telefonoEmpresa;

    @Column(length = 80, nullable = false)
    private String direccionEmpresa;

    @OneToMany
    @JoinColumn(name = "Usuario", nullable = false)
    private Perfil perfil;

    @OneToMany
    @JoinColumn(name = "Transaction", nullable = false)
    private MovimientoDinero movimientoDinero;



}
