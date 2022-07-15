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
       // FileWriter escribir = new FileWriter("productos.csv");
    }
}
