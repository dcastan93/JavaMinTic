package Ejemplo2Polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> integrantes = new ArrayList<>();

        Entrenador e1 = new Entrenador(1,40,"Felipe","Gómez","Colombiano",546532,"Alto Rendimiento");
        Futbolista f1 = new Futbolista(1,28,"Ambrosi","Rodriguez","Colombiano",6859460,2);

        integrantes.add(e1);
        integrantes.add(f1);

        System.out.println("Estos son los integrantes de la seleccion:");

        for(int i=0;i< integrantes.size();i++){
            System.out.println(integrantes.get(i));
        }

        Entrenador ejemplo = (Entrenador) integrantes.get(0);

        e1.firmarContrato();
        f1.firmarContrato();

    }
}
