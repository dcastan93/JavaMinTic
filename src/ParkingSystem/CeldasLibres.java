package ParkingSystem;

import java.util.ArrayList;

public class CeldasLibres{

    
    ArrayList<CeldasLibres> celdasLibres = new ArrayList<>();
    private int espacioLibresCarros = 52;
    private int espacioLibreMotos = 50;

    public int getEspacioLibresCarros() {
        return espacioLibresCarros;
    }

    public void setEspacioLibresCarros(int espacioLibresCarros) {
        this.espacioLibresCarros = espacioLibresCarros;
    }

    public int getEspacioLibreMotos() {
        return espacioLibreMotos;
    }

    public void setEspacioLibreMotos(int espacioLibreMotos) {
        this.espacioLibreMotos = espacioLibreMotos;
    }

    public int showCarAvaible() {
        int avaible = espacioLibresCarros-celdasLibres.size();
        //System.out.println("El numero de celdas diponibles es: "+ avaible);
        setEspacioLibresCarros(avaible);

        return avaible;

    }

    public void addCar(){

    }

}
