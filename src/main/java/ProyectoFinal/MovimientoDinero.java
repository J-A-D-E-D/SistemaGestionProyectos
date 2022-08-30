package ProyectoFinal;

import lombok.Data;
@Data
public class MovimientoDinero {
    private long montoMovimiento;
    private boolean tipoMonto;
    private String conceptoMovimiento;
    private String usuarioEncargado;


}
