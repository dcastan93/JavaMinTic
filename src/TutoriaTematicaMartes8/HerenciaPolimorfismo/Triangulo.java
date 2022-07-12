package TutoriaTematicaMartes8.HerenciaPolimorfismo;

public class Triangulo extends DosDimensiones{
    int id;

    public double area(){

        return (getAltura()*getBase())/2;
    }
    public void mostrarId(){
        System.out.println("el identificador de la figura es: "+ id);
    }
}
