package Retos.Reto3;

public class ProductoNoRefrigerado extends Producto{

    public ProductoNoRefrigerado(){

    }

    public double calcularCostoDeAlmacenamiento(){
        return this.getValorBase()*1.1;
    }
}
