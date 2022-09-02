package ProyectoFinal.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpresaDTO {
    private Integer idEmpresa;
    private String nombreEmpresa;
    private String direccionEmpresa;
    private long telefonoEmpresa;
    private long nitEmpresa;
}
