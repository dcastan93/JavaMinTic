package HerenciaClass;

public class Terreno {

    //atributos
    protected double area;
    protected int estrato;
    protected double valorTerreno;

    public double getArea() {
        return area;
    }



    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public double getValorTerreno() {
        return valorTerreno;
    }

    double calcularTerreno(){
        if (this.estrato ==1 || this.estrato==2){
            this.valorTerreno = valorTerreno;
        }
        return this.valorTerreno;
    }


}
