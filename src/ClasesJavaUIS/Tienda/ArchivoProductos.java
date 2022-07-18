package ClasesJavaUIS.Tienda;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;


public class ArchivoProductos {
    private File archivo;
    public ArchivoProductos(){
        this.archivo = new File("productos.csv");


    }

    public void guardarProducto(String texto){
        this.guardar(texto, true);

    }

    private void guardar(String texto, Boolean agregar){
        try {
            FileWriter escribir = new FileWriter(this.archivo, Charset.forName("UTF-8"), agregar );
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

    public void actualizarLista(ArrayList<Producto> lista){
        String texto = "";
        for ( int i=0; i<lista.size(); i++){
            if ( i !=0){
                texto = texto + "\n";
            }
            texto = texto + lista.get(i).toCSV() ;

        }

        guardar(texto, false);

    }


}
