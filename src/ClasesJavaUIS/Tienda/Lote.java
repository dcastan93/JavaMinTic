package ClasesJavaUIS.Tienda;

import java.util.ArrayList;

public class Lote {

    private ArrayList<Producto> productos = new ArrayList<>();

    public Lote() {
        productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto p){
        this.productos.add(p);

    }

}
