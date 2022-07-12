package ClasesJavaUIS;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class Viaje {
    private String origen;
    private String destino;
    private GregorianCalendar horaSalida;
    private GregorianCalendar horaLlegada;
    private Pasajero bus; //esto es agregacón
    private Pasajero [] pasajeros; //agregación de pasajeros

    private int cantidadPasajeros;
    private int contadorPasajeros;

    private ArrayList<Pasajero> listaPasajeros;

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }



    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public GregorianCalendar getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(GregorianCalendar horaSalida) {
        this.horaSalida = horaSalida;
    }

    public GregorianCalendar getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(GregorianCalendar horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public Pasajero getBus() {
        return bus;
    }

    public void setBus(Pasajero bus) {
        this.bus = bus;
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pasajero[] pasajeros) {
        this.pasajeros = pasajeros;
    }



    public Viaje(){
        this.origen = "";
        this.destino = "";

    }

    public Viaje(String origen, String destino, GregorianCalendar horaSalida, GregorianCalendar horaLlegada, int cantidadPasajeros ){
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.cantidadPasajeros = cantidadPasajeros;
        pasajeros =  new Pasajero[cantidadPasajeros];//así se trabaja con arreglo
        listaPasajeros = new ArrayList<Pasajero>(); //así se trabaja con lista
        this.contadorPasajeros = 0;



    }
    public String toString(){
        SimpleDateFormat formato =  new SimpleDateFormat("EEE, d MMM yyy HH:mm:ss Z");
        return "Viaje"+
                "\n Origen:  "+this.origen
                + "\n" +" Destino: " + this.destino
                +"\n"+ " Hora de salida: " + formato.format(this.horaSalida.getTime())
                +"\n" +" Hora de llegada: " + formato.format(this.horaLlegada.getTime());
    }
    public void anadirPasajero(Pasajero pasajero){
        this.pasajeros[contadorPasajeros] = pasajero;
        this.contadorPasajeros ++;

        this.listaPasajeros.add(pasajero);
        int tamano = this.listaPasajeros.size();
    }

    public String presentarPasajeros(){
        String listado = "";
        for (int i =0; i<this.contadorPasajeros; i++){
            listado = listado + this.pasajeros[i].toString() + "\n";//recorrido en arreglo

        }
        int i = 0;
        for (Pasajero pas:listaPasajeros) {
            listado = listado + "Pasajero #: "+ (i+1)+ "\n"+ pas.toString()+"\n";//reorrido rapido en lista(colección)
            i++;
        }
        return listado;
    }
    public String buscarPasajero(String criterio){
        String listado = "";
        for (int i =0; i<this.contadorPasajeros; i++){
            if(this.pasajeros[i].getName().equals(criterio) || this.pasajeros[i].getApellido().equals(criterio)){
                listado = listado + this.pasajeros[i].toString() + "\n";
            }

            for (Pasajero pas: listaPasajeros) {
                if (pas.getName().equals(criterio) || pas.getApellido().equals(criterio)) {
                    listado = listado + pas.toString() + "\n";
                }
            }

        }
        return listado;
    }





}
