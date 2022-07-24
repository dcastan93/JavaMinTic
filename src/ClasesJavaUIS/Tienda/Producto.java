package ClasesJavaUIS.Tienda;

public class Producto {
    private int id;
    private int codigobarras = 0;
    private String tipo;
    private String nombre;
    private String marca;
    private String presentacion;
    private int cantidad;
    private int precio;

    public Producto(){
        this.id = 0;
        this.codigobarras = 0;
        this.tipo = "tipo";
        this.nombre = "nombre";
        this.marca = "marca";
        this.presentacion = "presentacion";
        this.cantidad = 0;
        this.precio = 0;

    }

    public Producto(int id, int codigobarras, String tipo, String nombre, String marca, String presentacion, int precio, int cantidad
    ) {
        this.id = id;
        this.codigobarras = codigobarras;
        this.tipo = tipo;
        this.nombre = nombre;
        this.marca = marca;
        this.presentacion = presentacion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCodigoBarras() {
        return codigobarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigobarras = codigobarras;
    }

    @Override
    public String toString()
    {
        return "Cod:" +this.codigobarras+ " - Producto: "+this.nombre +"- Marca:  "+ this.marca + " - Presentación " +this.presentacion+" Precio: "+this.precio+" Stock: "+this.cantidad;
    }
    public String mostrarInformacion(){
        //return "Cod: "+ this.id+ "- Producto: "+ this.nombre+ this.marca+ " - "+this.presentacion;
        return "Producto{" +
                "id=" + id +
                "codigo de barras=" + codigobarras +'\'' +
                ", tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", presentacion='" + presentacion + '\'' +
                ", precio=" + precio + '\''+
                ", cantidad=" + cantidad + '\''+
                '}';

    }
    public String toCSV(){
        return this.id + ";" +this.tipo + ";"+ this.nombre+";"+this.marca+";"+this.presentacion+";"+this.precio+ ";"+this.cantidad;

    }
}
