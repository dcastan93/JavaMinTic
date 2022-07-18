package ClasesJavaUIS.Tienda;

import java.util.ArrayList;
//Clase contenedora
public class Bodega {
    private ArrayList<Producto> productosAlmacenados;

    public Bodega() {
        ArchivoProductos a = new ArchivoProductos();

        this.productosAlmacenados = a.cargarProductos();
    }
    public void anadirProducto(Producto producto){
        this.productosAlmacenados.add(producto);
        ArchivoProductos archivo = new ArchivoProductos();
        archivo.guardarProducto(producto.toCSV());


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
        ArchivoProductos a = new ArchivoProductos();
        a.actualizarLista(this.productosAlmacenados);

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
