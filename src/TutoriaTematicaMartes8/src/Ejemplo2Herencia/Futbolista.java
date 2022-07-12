package Ejemplo2Herencia;

public class Futbolista extends SeleccionFutbol{

    private int numCamisa;
    private String posicion;

    public Futbolista(){
        super();
    }

    public Futbolista(int id, int edad, String nombre, String apellido, String nacionalidad, int telefono, int numCamisa, String posicion) {
        super(id, edad, nombre, apellido, nacionalidad, telefono);
        this.numCamisa = numCamisa;
        this.posicion = posicion;
    }

    public void entrenar(){
        System.out.println("Estoy entrenando");
    }

    public void jugar(){
        System.out.println("Estoy jugando");
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "numCamisa=" + numCamisa +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
