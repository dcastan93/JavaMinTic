package Ejemplo1Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado();
        c1.lado=12;
        System.out.println(c1.queSoy()+" y mi area es de:"+c1.obtenerArea());

        Triangulo t1 = new Triangulo();
        t1.base=3;
        t1.altura=8;
        System.out.println(t1.queSoy()+" y mi area es de:"+t1.obtenerArea());
    }
}
