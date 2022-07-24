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
                int id = rs.getInt("id");
                int codigobarras = rs.getInt("codigobarras");
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
            System.out.println("No se leyeron los productos");
            return null;

        }
        con.cerrarConexion();

        return this.productosAlmacenados;

    }
    public void anadirProducto(Producto p){
        Conexion con = new Conexion();
        con.crearConexion();
        String sql = "INSERT INTO TProductos(codigobarras, tipo, nombre, marca, presentacion, precio, cantidad) "+
                "VALUES ("+p.getCodigoBarras()+", \""+p.getTipo()+"\",  \""+p.getNombre()+"\",  \""+p.getMarca()+"\", \""+p.getPresentacion()+"\", "+p.getPrecio()+", "+p.getCantidad()+")" ;
        con.insertarDatosBD(sql);
        //OPERACIONES
        con.cerrarConexion();
    }


    public Producto getProducto(int codigo){
        Producto p = null;
        Conexion con = new Conexion();
        con.crearConexion();
        String sql = "SELECT id, codigobarras, tipo, nombre, marca, presentacion, precio, cantidad "+
                "FROM TProductos WHERE codigobarras = "+ codigo;
        ResultSet rs = con.consultarDatosBD(sql);
        System.out.println("se leyo el SQL y se ejecuto");
        try
        {
            while(rs.next())
            {
                int id = rs.getInt("id");
                int codigobarras = rs.getInt("codigobarras");
                String tipo = rs.getString(3);
                String nombre = rs.getString(4);
                String marca = rs.getString(5);
                String presentacion = rs.getString(6);
                int precio = rs.getInt(7);
                int cantidad = rs.getInt(8);
                p = new Producto(id, codigobarras, tipo, nombre, marca, presentacion, precio, cantidad);
                this.productosAlmacenados.add(p);
                System.out.println("Se leyeron los productos");

            }
        }
        catch(Exception e)
        {
            System.out.println("No se leyeron los productos");
            return null;

        }
        //OPERACIONES
        con.cerrarConexion();
        return p;

    }



    public ArrayList<Producto> buscarProducto(String criterio){



        this.productosAlmacenados.clear();
        Conexion con = new Conexion();
        con.crearConexion();
        String sql = "SELECT id, codigobarras, tipo, nombre, marca, presentacion, precio, cantidad "+
                "FROM TProductos " +
                "WHERE tipo LIKE \"%"+criterio+"%\" " +
                "OR nombre LIKE \"%"+criterio+"%\" " +
                "OR presentacion LIKE \"%"+criterio+"%\" " +
                "OR marca LIKE \"%"+criterio+"%\" ";
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
            }
        }
        catch(Exception e)
        {
            return null;
        }
        con.cerrarConexion();

        return this.productosAlmacenados;
    }

    public void eliminarProducto(int codigo){
        Conexion con = new Conexion();
        con.crearConexion();
        String sql = "DELETE FROM TProductos "+
                "WHERE codigobarras = "+codigo;
        con.borrarDatosBD(sql);
        con.cerrarConexion();

    }
    public void incrementarProducto(int codigobarras, int cantidad) {
        Conexion con  = new Conexion();
        con.crearConexion();
        //operaciones
        String sql = "UPDATE TProductos " +
                "SET cantidad = cantidad +"+ cantidad +
                "WHERE codigobarras = "+ codigobarras;
        con.actualizarDatosBD(sql);

        con.cerrarConexion();


    }

    public void actualizarListaEnArchivo(){

    }

    public void disminuirProducto(int codigobarras, int cantidad){
        Conexion con = new Conexion();
        con.crearConexion();
        String sql = "UPDATE TProductos "+
                "SET cantidad = cantidad - "+ cantidad +" "+
                "WHERE codigobarras = "+codigobarras;
        con.actualizarDatosBD(sql);
        con.cerrarConexion();


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
