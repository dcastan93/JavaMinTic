package ParkingSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //acá se emula la interfaz de usuario
       /** Ticket ticket = new Ticket(123,"13:00", "JPV129", "Carro");

        ticket.showData();*/

       CeldasLibres celdasLibres = new CeldasLibres();



       if (celdasLibres.showCarAvaible() != 0){
           int response;
           System.out.println("El numero celdas disponibles es: " + celdasLibres.showCarAvaible());
           System.out.println("Escriba la opcion que necesite: \n 1. Ingresar Retos.Vehiculo \n 2. Salida de vehiculo ");
           Scanner sc = new Scanner(System.in);
           response = Integer.valueOf(sc.nextLine());
           switch (response){
               case 1:
                   //1System.out.println("Ingresar la siguiente informacion: \n iD. \n  Hora entrada. \n Tipo de vehiculo \n Placa del vehiculo");
                   int iD;
                   System.out.println("Ingrese ID");
                   iD = Integer.valueOf(sc.nextLine());
                   String horaEntrada;
                   System.out.println("Ingrese Hora de entrada");
                   horaEntrada =  String.valueOf(sc.nextLine());
                   String tipoVehiculo;
                   System.out.println("Ingrese tipo de vehiculo");
                   tipoVehiculo =  String.valueOf(sc.nextLine());
                   String placaVehiculo;
                   System.out.println("Ingrese placa vehiculo");
                   placaVehiculo =  String.valueOf(sc.nextLine());

                   Ticket ticket = new Ticket(iD, horaEntrada, tipoVehiculo, placaVehiculo);
                   ticket.showData();
                   break;
               case 2:
                   System.out.println("Salga pues");
                   break;
           }



       }
    }
}
