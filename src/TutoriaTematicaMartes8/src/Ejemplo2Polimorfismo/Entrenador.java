package Ejemplo2Polimorfismo;

import TutoriaTematicaMartes8.Ejemplo2Herencia.SeleccionFutbol;

public class Entrenador extends SeleccionFutbol {

    private String especializacion;

    public Entrenador() {
        super();
    }

    public Entrenador(int id, int edad, String nombre, String apellido, String nacionalidad, int telefono, String especializacion) {
        super(id, edad, nombre, apellido, nacionalidad, telefono);
        this.especializacion = especializacion;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    @Override
    public void firmarContrato() {
        System.out.println("Estoy firmando como Entrenador!");
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "especializacion='" + especializacion + '\'' +
                '}';
    }
}
