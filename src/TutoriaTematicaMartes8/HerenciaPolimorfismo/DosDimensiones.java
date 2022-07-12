package TutoriaTematicaMartes8.HerenciaPolimorfismo;

public class DosDimensiones {
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void mostrarDimensiones(){
        System.out.println("base: "+ base+ "\n altura: "+ altura);
    }
}
