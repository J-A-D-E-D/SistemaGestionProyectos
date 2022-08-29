package ProyectoFinal;

public class Empresa {
    private String nombreEmpresa;
    private String direccionEmpresa;
    private long telefonoEmpresa;
    private long nitEmpresa;



    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public long getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(long telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public long getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(long nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
