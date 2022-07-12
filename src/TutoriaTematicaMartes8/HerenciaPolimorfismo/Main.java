package TutoriaTematicaMartes8.HerenciaPolimorfismo;

public class Main {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();
        t1.setBase(2) ;
        t1.setAltura(8);
        t1.id=123;

        t1.setBase(10);
        t1.setAltura(6);
        t1.id=456;

        System.out.println("El identificador de la figura es: "+ t1.id);
        t1.mostrarDimensiones();
        System.out.println(t1.area());

    }
}
