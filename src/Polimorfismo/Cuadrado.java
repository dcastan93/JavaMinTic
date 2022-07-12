package Polimorfismo;

public class Cuadrado implements Figura{
    protected double base;


    public double obtenerArea(){

        return (base*base);

    }
    public String queSoy(){
        return "soy un cuadrado";
    }
}
