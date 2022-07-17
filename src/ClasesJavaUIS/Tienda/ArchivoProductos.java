package ClasesJavaUIS.Tienda;

import java.io.*;
import java.util.ArrayList;


public class ArchivoProductos {
    private File archivo;
    public ArchivoProductos(){
        this.archivo = new File("productos.csv");


    }

    public void guardarProducto(String texto){

        try {
            FileWriter escribir = new FileWriter(this.archivo, true);
            PrintWriter cursor = new PrintWriter(escribir);
            cursor.println(texto);
            cursor.flush();
            cursor.close();
            escribir.close();

        }
        catch (Exception e){

        }
    }

    public  ArrayList<Producto> cargarProductos(){
        ArrayList<Producto> listaCargada = new ArrayList<>();
        try{
            FileReader reader = new FileReader(this.archivo);
            BufferedReader cursor = new BufferedReader(reader);
            while(cursor.ready()) {
                String linea = cursor.readLine();
                String [] datosProductos = linea.split(";");
                int id = Integer.parseInt(datosProductos[0]);
                String tipo = datosProductos[1];
                String nombre = datosProductos[2];
                String marca = datosProductos[3];
                String  presentacion = datosProductos[4];
                int precio = Integer.parseInt(datosProductos[5]);
                int cantidad = Integer.parseInt(datosProductos[6]);
                Producto p = new Producto(id, tipo, nombre, marca, presentacion, precio, cantidad);
                listaCargada.add(p);



            }



        } catch (Exception e) {

        }
        return listaCargada;
    }


}
