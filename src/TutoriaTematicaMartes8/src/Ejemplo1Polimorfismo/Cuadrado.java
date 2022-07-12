package Ejemplo1Polimorfismo;

public class Cuadrado implements Figura {

    protected double lado;

    public double obtenerArea() {
        return lado*lado;
    }


    public String queSoy() {
        return "Soy un Cuadrado";
    }
}
