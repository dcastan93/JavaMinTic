package Ejemplo2Polimorfismo;

import Ejemplo2Herencia.SeleccionFutbol;

public class Futbolista extends SeleccionFutbol {

    private int numCamisa;

    public Futbolista() {
        super();
    }

    public Futbolista(int id, int edad, String nombre, String apellido, String nacionalidad, int telefono, int numCamisa) {
        super(id, edad, nombre, apellido, nacionalidad, telefono);
        this.numCamisa = numCamisa;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "numCamisa=" + numCamisa +
                '}';
    }

    @Override
    public void firmarContrato() {
        System.out.println("Estoy firmando como Futbolista");
    }
}
