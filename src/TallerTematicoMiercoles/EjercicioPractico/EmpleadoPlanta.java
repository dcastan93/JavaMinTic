package TallerTematicoMiercoles.EjercicioPractico;

public class EmpleadoPlanta extends Empleado{


    @Override
    public double calcularSalario() {

        return this.getBaseSalarial()*44;
    }
}
