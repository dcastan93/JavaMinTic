package Ejemplo1Herencia;

public class Triangulo extends DosDimensiones{

    int identificador;

    public double area(){

        return (getBase() *getAltura())/2;
    }

    public void mostrarIdentificador(){
        System.out.println("El identificador de la figura es: "+identificador);
    }
}
