package TallerRefuerzoRelacionesClases;

public class Banco {
    private String nombre;
    private String nombreBanco;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public Banco(String nombreBanco){
        this.nombreBanco = nombreBanco;

    }

}
