package TutoriaTematicaMartes8.Polimorfismo;

public class Triangulo implements Figura{

    protected double base;
    protected double altura;

    public double obtenerArea(){

        return (base*altura)/2;

    }
    public String queSoy(){
        return "soy un triangulo";
    }

}
