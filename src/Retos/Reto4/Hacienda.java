package Retos.Reto4;

import java.util.ArrayList;

public class Hacienda implements PatronHacienda{
    List<Vehiculo> vehiculos;

    public Hacienda(List<Vehiculo> vehiculos) {
        this.vehiculos =  new ArrayList<Vehiculo>();

    }

    public void agregarVehiculo(Vehiculo c){
        this.vehiculos.add(c);
    };
    public  void mostrarVehiculos(){};

    public void mostrarImpuestosVehiculo(){
        for (Vehiculo v: this.vehiculos) {
            System.out.println(v.toString());
        }
    };
}
