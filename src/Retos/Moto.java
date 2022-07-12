package Retos;

public class Moto extends Vehiculo{

    private int cilindraje;



    public Moto(int cilindraje, String placa) {
        super(placa);

        this.cilindraje = cilindraje;
    }

    public int calcularImpuesto(){
        int valorPagar;

        if (cilindraje > 150 ){
            valorPagar = 90000;
        }
        else{
            valorPagar = 45000;
        }

    return valorPagar;

    }
}
