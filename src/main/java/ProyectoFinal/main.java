import ProyectoFinal.Empleado;
import ProyectoFinal.Empresa;
import ProyectoFinal.MovimientoDinero;

public class main{
        public static void main(String[] args) {
                Empleado empleado = new Empleado();
                Empresa empresa = new Empresa();
                MovimientoDinero movimientodinero = new MovimientoDinero();
                empleado.setNombreEmpleado("Andres");
                empleado.setCorreoEmpleado("pepito@gmail.com");
                empleado.setEmpresaEmpleado("JADED");
                empleado.setRolEmpleado("administrador");

                empresa.setDireccionEmpresa("Calle 3");
                empresa.setNitEmpresa(56651);
                empresa.setNombreEmpresa("JADED");
                empresa.setTelefonoEmpresa(5555555);

                movimientodinero.setUsuarioEncargado("Dannys");
                movimientodinero.setMontoMovimiento(100);
                movimientodinero.setConceptoMovimiento("hola");
                movimientodinero.setTipoMonto(true);

                System.out.println("Datos de la empresa: ");
                System.out.println(empresa.getNombreEmpresa());
                System.out.println(empresa.getDireccionEmpresa());
                System.out.println(empresa.getTelefonoEmpresa());
                System.out.println(empresa.getNitEmpresa());

                System.out.println("Datos del Empleado: ");
                System.out.println(empleado.getNombreEmpleado());
                System.out.println(empleado.getCorreoEmpleado());
                System.out.println(empleado.getEmpresaEmpleado());
                System.out.println(empleado.getRolEmpleado());

                System.out.println("Datos sobre el movimiento del dinero: ");
                System.out.println(movimientodinero.getMontoMovimiento());
                System.out.println(movimientodinero.isTipoMonto());
                System.out.println(movimientodinero.getConceptoMovimiento());
                System.out.println(movimientodinero.getUsuarioEncargado());
        }
}