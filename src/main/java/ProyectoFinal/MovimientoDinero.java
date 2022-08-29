package ProyectoFinal;

public class MovimientoDinero {
    private long montoMovimiento;
    private boolean tipoMonto;
    private String conceptoMovimiento;
    private String usuarioEncargado;

    public long getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(long montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public boolean isTipoMonto() {
        return tipoMonto;
    }

    public void setTipoMonto(boolean tipoMonto) {
        this.tipoMonto = tipoMonto;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public String getUsuarioEncargado() {
        return usuarioEncargado;
    }

    public void setUsuarioEncargado(String usuarioEncargado) {
        this.usuarioEncargado = usuarioEncargado;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
