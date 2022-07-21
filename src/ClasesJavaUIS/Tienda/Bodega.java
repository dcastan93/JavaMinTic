package ClasesJavaUIS.Tienda;

import java.util.ArrayList;
import java.sql.ResultSet;
//Clase contenedora
public class Bodega {
    private ArrayList<Producto> productosAlmacenados;

    public Bodega() {

    }
    public void anadirProducto(Producto producto){



    }
    public Producto getProducto(int id){

        for (Producto p: this.productosAlmacenados) {

            if(p.getId() == id){
                return p;
            }
            else{
                System.out.println("Producto no encontrado");
            }

        }

        return null;
    }

    public ArrayList<Producto> getProductosAlmacenados() {
        this.productosAlmacenados.clear();
        Conexion con = new Conexion();
        con.crearConexion();
        //operaciones
        String sql = "SELECT id, codigobarras, nombre, marca, presentacio, precio, cantidad" +
                "FROM TProductos";

        ResultSet rs = con.consultarDatosBD(sql);
        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                int codigobarras = rs.getInt(2);
                String tipo = rs.getString(3);
                String nombre = rs.getString(4);
                String marca = rs.getString(5);
                String presentacion = rs.getString(6);
                int precio = rs.getInt(7);
                int cantidad = rs.getInt(8);
                Producto p = new Producto(id, codigobarras, tipo, nombre, marca, presentacion, precio, cantidad);

            }
        }
        catch (Exception e){
            return null;

        }


        con.cerrarConexion();
        return this.productosAlmacenados;
    }

    public ArrayList<Producto> buscarProducto(String criterio){

        ArrayList<Producto> productosEncontrados = new ArrayList<>(productosAlmacenados);
        for (Producto p: this.productosAlmacenados) {

            if(p.getNombre().equals(criterio)||p.getMarca().equals(criterio)||p.getPresentacion().equals(criterio)||(p.getId() + "").equals(criterio)){
                productosEncontrados.add(p);
            }

        }
        return productosEncontrados;
    }

    public void eliminarProducto(int id){
        Producto productoEliminar = this.getProducto(id);
        if ( productoEliminar != null){
            this.productosAlmacenados.remove(productoEliminar);
        }


    }
    public void incrementarProducto(int id, int cantidad){
        Producto productoIncrementar = this.getProducto(id);
        if (productoIncrementar != null){
            int index = productosAlmacenados.indexOf(productoIncrementar);
            this.productosAlmacenados.get(index).setCantidad(productoIncrementar.getCantidad() + cantidad);

        }
        this.actualizarListaEnArchivo();

    }

    public void actualizarListaEnArchivo(){

    }

    public void disminuirProducto(int id, int cantidad){
        Producto productoDisminuir = this.getProducto(id);
        if (productoDisminuir != null){
            int index = productosAlmacenados.indexOf(productoDisminuir);
            if (productoDisminuir.getCantidad() > cantidad) {
                this.productosAlmacenados.get(index).setCantidad(productoDisminuir.getCantidad() - cantidad);
            }
            else{
                System.out.println("Tiene menor cantidad del producto que el que quiere disminuir");
            }
        }

    }

    public void modificarPrecio(int id, int precio){
        Producto modificandoPrecio = this.getProducto(id);
        int index = productosAlmacenados.indexOf(modificandoPrecio);
        if( modificandoPrecio != null){
            this.productosAlmacenados.get(index).setPrecio(precio);
        }
        

    }

    @Override
    public String toString() {
        return "Bodega{" +
                "productosAlmacenados=" + productosAlmacenados +
                '}';
    }
}
