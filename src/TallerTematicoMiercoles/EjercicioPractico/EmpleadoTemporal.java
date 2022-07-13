package TallerTematicoMiercoles.EjercicioPractico;

public class EmpleadoTemporal extends Empleado{
    @Override
    public double calcularSalario() {
        return this.getBaseSalarial()*44;
    }
}
