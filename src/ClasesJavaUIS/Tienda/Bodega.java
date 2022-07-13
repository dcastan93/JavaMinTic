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
