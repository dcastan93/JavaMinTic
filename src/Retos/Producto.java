package Retos;

public class Producto {
    private String nombre;
    private String codigo;
    private String categoria;
    private String laboratorio;
    private boolean cotizante;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public boolean isCotizante() {
        return cotizante;
    }

    public void setCotizante(boolean cotizante) {
        this.cotizante = cotizante;
    }

    public Producto (String nombre, String codigo, String categoria,String laboratorio, boolean cotizante){
        this.nombre = nombre;
        this.codigo = codigo;
        this.categoria = categoria;
        this.laboratorio = laboratorio;
        this.cotizante = cotizante;

    }

    /*public String info(){


        return getNombre()+ "\n"+getCodigo() +"\n"+getCategoria()+ "\n"+getLaboratorio()+ "\n"+getClass()+ "\n"+isCotizante();

    }*/
    public void info() {
        System.out.println("[Retos.Producto]:");
        System.out.println("Nombre:" +this.nombre);
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Laboratorio: " + this.laboratorio);
        System.out.println("Precio: " + this.costo());
    }

    public double costo(){
        double costo = 0;
        if(isCotizante()){
            costo = 3500;
        }
        else{
            costo = 14000;
        }
    return costo;
    }

}
