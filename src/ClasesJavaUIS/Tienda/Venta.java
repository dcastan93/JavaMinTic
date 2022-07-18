package ClasesJavaUIS.Tienda;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private List<Producto> carritoCompra;
    public  Venta(){
        this.carritoCompra = new ArrayList<Producto>();

    }
    public void agregarProductoAlCarrito(Producto p, int cantidad){
        p.setCantidad(cantidad);
        this.carritoCompra.add(p);

    }
    public int calcularTotalVenta(){
        int valortotal = 0;
        for (Producto p: carritoCompra) {
           valortotal = valortotal+ p.getCantidad()*p.getPrecio();

        }
        return valortotal;
    }

    public  void finalizarVenta(){
        Bodega b =  new Bodega();
        for (Producto p: carritoCompra) {
            b.disminuirProducto(p.getId(), p.getCantidad());

        }
        b.actualizarListaEnArchivo();
    }

}
