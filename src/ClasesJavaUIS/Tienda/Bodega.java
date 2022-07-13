package ClasesJavaUIS.Tienda;

import java.util.ArrayList;
//Clase contenedora
public class Bodega {
    private ArrayList<Producto> productosAlmacenados;

    public Bodega() {
        this.productosAlmacenados = new ArrayList<Producto>();
    }
    public void anadirProducto(Producto producto){
        this.productosAlmacenados.add(producto);

    }
    public Producto getProducto(int id){
        Producto productoEncontrado = null;

        for (Producto p: this.productosAlmacenados) {

            if(p.getId() == id){
                productoEncontrado= p;
            }
            else{
                System.out.println("Producto no encontrado");
            }

        }

        return productoEncontrado;
    }
    public void eliminarProducto(int id){


    }
    public void incrementarProducto(int id, int cantidad){

    }

    public void disminuirProducto(int id, int cantidad){

    }

    public void modificarPrecio(int id, int precio){

    }

    public ArrayList<Producto> getProductosAlmacenados(int id) {
        return productosAlmacenados;
    }
}
