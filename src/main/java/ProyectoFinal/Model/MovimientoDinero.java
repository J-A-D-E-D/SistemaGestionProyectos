package ProyectoFinal.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Transaction")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdMovimientoDinero;

    @Column(length = 20, nullable = false)
    private String conceptoMovimiento;

    @Column(columnDefinition = "decimal(15)", nullable = false)
    private float montoMovimiento;

    @ManyToOne
    @JoinColumn(name = "UsuarioEncargado", nullable = false)
    private Perfil perfil;

    @ManyToOne
    @JoinColumn(name = "Empresa", nullable = false)
    private Empresa empresa;


}
