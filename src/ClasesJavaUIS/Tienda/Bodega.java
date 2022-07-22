package ClasesJavaUIS.Tienda;

import java.util.ArrayList;
import java.sql.ResultSet;
//Clase contenedora
public class Bodega {
    private ArrayList<Producto> productosAlmacenados;

    public Bodega() {
        this.productosAlmacenados = new ArrayList<Producto>();

    }

    public ArrayList<Producto> getProductosAlmacenados() {
        this.productosAlmacenados.clear();
        Conexion con = new Conexion();
        con.crearConexion();
        String sql = "SELECT id, codigobarras, tipo, nombre, marca, presentacion, precio, cantidad "+
                "FROM TProductos ";
        ResultSet rs = con.consultarDatosBD(sql);
        try
        {
            while(rs.next())
            {
                int id = rs.getInt(1);
                int codigobarras = rs.getInt(2);
                String tipo = rs.getString(3);
                String nombre = rs.getString(4);
                String marca = rs.getString(5);
                String presentacion = rs.getString(6);
                int precio = rs.getInt(7);
                int cantidad = rs.getInt(8);
                Producto p = new Producto(id, codigobarras, tipo, nombre, marca, presentacion, cantidad, precio);
                this.productosAlmacenados.add(p);
                System.out.println("Se leyeron los productos");
            }
        }
        catch(Exception e)
        {
            return null;
        }
        con.cerrarConexion();
        System.out.println("No se leyeron los productos");
        return this.productosAlmacenados;

    }
    public void anadirProducto(Producto producto){
    }


    public Producto getProducto(int id){


        return null;
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
