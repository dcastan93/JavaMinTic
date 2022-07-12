package Ejemplo1Herencia;

public class Main {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();

        t1.setBase(2);
        t1.setAltura(8);
        t1.identificador=1;

        t2.setBase(10);
        t2.setAltura(6);
        t2.identificador=2;

        System.out.println("Información para el triangulo "+t1.identificador);
        t1.mostrarDimension();
        System.out.println(t1.area());

        System.out.println("Información para el triangulo "+t2.identificador);
        t2.mostrarDimension();
        System.out.println(t2.area());
    }
}