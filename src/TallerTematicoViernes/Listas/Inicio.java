package TallerTematicoViernes.Listas;

import java.util.ArrayList;
import java.util.List;

public class Inicio {
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<>();

        String elemento1 = "Diego";
        String elemento2 = "Leon";
        String elemento3 = "Castañeda";
        String elemento4 = "Saldarriaga";
        lista1.add(elemento1);
        lista1.add(elemento2);
        lista1.add(elemento3);
        lista1.add(elemento4);

        for ( String p : lista1){
            System.out.println(p);

        }


    }
}
