package TallerRefuerzoRelacionesClases;

public class Empleado {
    private String nombre;
    private Banco banco;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Empleado(String nombre){
        this.nombre = nombre;
    }
}
