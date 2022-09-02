package ProyectoFinal.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovimientoDineroDTO {

    private Integer idMovimiento;
    private long montoMovimiento;
    private boolean tipoMonto;
    private String conceptoMovimiento;
    private String usuarioEncargado;
}
