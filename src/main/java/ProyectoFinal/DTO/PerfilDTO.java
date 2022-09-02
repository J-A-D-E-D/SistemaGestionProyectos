package ProyectoFinal.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PerfilDTO {
    private Integer idPerfil;
    private String imagen;
    private String telefono;
    private Integer idEmpleado;

}
