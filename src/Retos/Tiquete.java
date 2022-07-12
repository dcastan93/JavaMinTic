package Retos;

public class Tiquete {
    String id;
    double valorUnitario;
    int cantidadDePasajeros;
    public Tiquete(String id, double valorUnitario, int cantidadDePasajeros){
        this.valorUnitario = valorUnitario;
        this.cantidadDePasajeros =cantidadDePasajeros;

    }
    double costoTiquete(){
        this.valorUnitario = valorUnitario;
        this.cantidadDePasajeros = cantidadDePasajeros;
        return cantidadDePasajeros*valorUnitario;
    }




}
