package ParkingSystem;

import javax.crypto.spec.PSource;

public class Ticket extends Register{

    public Ticket(int iD, String horaEntrada, String tipoVehiculo, String placaVehiculo){
        super(iD, horaEntrada, tipoVehiculo, placaVehiculo);
    }


    public void showData(){
        System.out.println("placa: " + getPlacaVehiculo() + "\n"+ "Hora entrada: "+ getHoraEntrada() + "\n"+ "Tipo vehiculo: "+ getTipoVehiculo());
    }

}
