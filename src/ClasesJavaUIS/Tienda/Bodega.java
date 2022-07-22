package ClasesJavaUIS.Tienda;

import java.util.ArrayList;
import java.sql.ResultSet;
//Clase contenedora
public class Bodega {
    private ArrayList<Producto> productosAlmacenados;

    public Bodega() {
        this.productosAlmacenados = new ArrayList<Producto>();

    }
    public void anadirProducto(Producto producto){



    }
    public Producto getProducto(int id){


        return null;
    }

    public ArrayList<Producto> getProductosAlmacenados() {

        return this.productosAlmacenados;
    }

    public ArrayList<Producto> buscarProducto(String criterio){


        return null;
    }

    public void eliminarProducto(int id){

    }
    public void incrementarProducto(int id, int cantidad){


    }

    public void actualizarListaEnArchivo(){

    }

    public void disminuirProducto(int id, int cantidad){


    }

    public void modificarPrecio(int id, int precio){


    }

    @Override
    public String toString() {
        return "Bodega{" +
                "productosAlmacenados=" + productosAlmacenados +
                '}';
    }
}
