package ClasesJavaUIS;

import java.util.GregorianCalendar;
import java.util.Scanner;


public class Main {
    static Scanner teclado = new Scanner(System.in);
    static Viaje viaje = new Viaje();
    public static void main(String[] args) {


        int opcion;

        do{
            String mensajeMenu = "Menu principal \n"+
                    "1) Crear viaje \n"+
                    "2) Añadir Pasajeros al viaje \n"+
                    "3) Mostrar pasajeros \n"+
                    "4) Asignar bus \n"+
                    "5) buscar pasajeros: \n"+
                    "0) Salir";

            System.out.println(mensajeMenu);
            opcion = Integer.parseInt(teclado.nextLine());
            switch(opcion){
                case 1:
                    viaje = crearViaje();
                    System.out.println("Viaje creado: \n"+ viaje.toString());
                    break;
                case 2:
                    anadirPasajero();
                    break;

                case 3:
                    System.out.println(viaje.presentarPasajeros());
                    break;
                case 4:
                    break;
                case 5:
                    buscarPasajeros();
                    break;
                case 0:
                    break;

            }



        }while(opcion != 0);


    }
    public static Pasajero preguntarPasajero(){
        Scanner teclado = new Scanner(System.in);


        //preguntas
        System.out.println("Ingrese nombre del pasajero: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese apellido del pasajero: ");
        String apellido = teclado.nextLine();
        System.out.println("Ingrese documento del pasajero: ");
        int documento = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese el numero de equipaje: ");
        int numeroEquipaje = Integer.parseInt(teclado.nextLine());
        String [] equipajes = new String[numeroEquipaje];

        for ( int i = 0 ; i<numeroEquipaje; i++){
            System.out.println("Ingrese tipo de equipaje numero: "+ i+1);
            equipajes[i] = teclado.nextLine();
        }



        //impresión del objeto

        Pasajero pasajero = new Pasajero(nombre, apellido, documento, equipajes);

        return pasajero;
    }
    public static void anadirPasajero(){
        Pasajero pasajero = preguntarPasajero();
        viaje.anadirPasajero(pasajero);


    }

    public static void crearBus(){
        Asientos asientos = new Asientos();


    }

    public static GregorianCalendar preguntarFecha(String dato){
        System.out.println("ingrese fecha de" + dato +" (dd-mm-yyyy)");
        String fechaSalida = teclado.nextLine();
        String [] datosFechaSalida = fechaSalida.split("-");
        System.out.println("Ingrese la hora de " + dato +" (hh:mm)");
        String horaSalida = teclado.nextLine();
        String [] datoHoraSalida = horaSalida.split(":");
        GregorianCalendar fecha = new GregorianCalendar(Integer.parseInt(datosFechaSalida[2]),
                Integer.parseInt(datosFechaSalida[1])-1,
                Integer.parseInt(datosFechaSalida[0]),
                Integer.parseInt(datoHoraSalida[0]),
                Integer.parseInt(datoHoraSalida[1]));
        return fecha;

    }

    public static Viaje crearViaje(){
        System.out.println("Ingrese origen");
        String origen = teclado.nextLine();
        System.out.println("Ingrese destino");
        String destino = teclado.nextLine();
        GregorianCalendar datosfechaSalida = preguntarFecha("salida");
        GregorianCalendar datosfechaLlegada = preguntarFecha("llegada");


        System.out.println("Ingrese cantidad de pasajeros");
        int cantidadPasajeros = Integer.parseInt(teclado.nextLine());

        Viaje viaje = new Viaje(origen, destino, datosfechaSalida, datosfechaLlegada, cantidadPasajeros);
        return viaje;
    }
    public static void  buscarPasajeros(){
        System.out.println("ingrese nombre o apellido a buscar en el viaje");
        String criterio = teclado.nextLine();
        System.out.println("pasajeros encontrados:");

        System.out.println(viaje.buscarPasajero(criterio));

    }
}
