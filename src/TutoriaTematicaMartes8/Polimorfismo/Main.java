package TutoriaTematicaMartes8.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado();
        c1.base = 12;
        System.out.println(c1.queSoy() + " y mi area es: "+ c1.obtenerArea());

        Triangulo t1 = new Triangulo();
        t1.altura = 3;
        t1.base = 8;
        System.out.println(t1.queSoy() + " y mi area es: "+ t1.obtenerArea());

    }
}
