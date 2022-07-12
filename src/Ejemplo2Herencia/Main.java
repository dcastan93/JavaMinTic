package Ejemplo2Herencia;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SeleccionFutbol> integrantes = new ArrayList<>();

        Futbolista f1 =  new Futbolista(36, "Falcao", "Radamel", "10", "Colombiana", "123", 10, "delantero");
        integrantes.add(f1);
        Futbolista f2 =  new Futbolista(20, "Diego", "Cast", "5", "Colombiana", "789", 6, "saguero central");
        integrantes.add(f2);

        //mprimir nombres
        for (int i = 0; i < integrantes.size(); i++) {

            System.out.println(integrantes.get(i));


        }

        //mostrart metodos

    }
}
