package Ejemplo1Herencia;

public class DosDimensiones {
    private double base;
    private double altura;

    public void mostrarDimension(){
        System.out.println("Base = "+base + " Altura="+altura);
    }

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
}
