package TutoriaTematicaMartes8.Ejemplo2Herencia;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SeleccionFutbol> integrantes = new ArrayList<>();

        Futbolista f1 = new Futbolista(1,25,"Juan","Perez","Colombiana",6384657,8,"Medio Campista");
        Futbolista f2 = new Futbolista(2,36,"Falcao","Garcia","Colombiano",1536475897,9,"Delantero");

        integrantes.add(f1);
        integrantes.add(f2);

        System.out.println("Estos son los integrantes de la seleccion:");

        for(int i=0;i< integrantes.size();i++){
            System.out.println(integrantes.get(i));
        }

        f1.entrenar();
        System.out.println(" y ");
        f2.firmarContrato();
        System.out.println(" y ");
        f2.jugar();
    }
}
