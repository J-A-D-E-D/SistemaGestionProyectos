package ProyectoFinal.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoDTO {
        private Integer idEmpleado;
        private String nombreEmpleado;
        private String correoEmpleado;
        private String empresaEmpleado;
        private String rolEmpleado;

    }
