package ClasesJavaUIS.Tienda;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io. BufferedReader;
import java.io.PrintWriter;



public class ArchivoProductos {
    private File archivo;
    public ArchivoProductos(){
        this.archivo = new File("productos.csv");


    }

    public void guardarArchivo(){
        String info = "hola";
        try {
            FileWriter escribir = new FileWriter(this.archivo, true);
            PrintWriter cursor = new PrintWriter(escribir);
            cursor.println(info);
            cursor.flush();
            cursor.close();
            escribir.close();

        }
        catch (Exception e){

        }
    }


}
