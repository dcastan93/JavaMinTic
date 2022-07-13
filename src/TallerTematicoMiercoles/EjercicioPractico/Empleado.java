package TallerTematicoMiercoles.EjercicioPractico;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private float baseSalarial;
    private int anios;

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getBaseSalarial() {
        return baseSalarial;
    }

    public void setBaseSalarial(float baseSalarial) {
        this.baseSalarial = baseSalarial;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }


    public abstract  double calcularSalario();

    @Override
    public String toString() {
        return "el nombre del empleado es: "+ nombre +" "+ apellido+ " Con base salarial : "+ baseSalarial;
    }
}
