package ClasesJavaUIS;

public class Asientos {
    private int puestos;
    private String placa;
    private String tipo;
    private int numeroInterno;

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroInterno() {
        return numeroInterno;
    }

    public void setNumeroInterno(int numeroInterno) {
        this.numeroInterno = numeroInterno;
    }

    public Asientos(){

    }

    public Asientos(int puestos, String placa, String tipo, int numeroInterno){
        this.puestos = puestos;
        this.placa = placa;
        this.tipo = tipo;
        this. numeroInterno =  numeroInterno;
    }
}
