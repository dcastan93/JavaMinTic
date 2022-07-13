package TallerTematicoMiercoles;

public abstract class Animal {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void comer(){
        System.out.println(this.getNombre()+ ": esta comiendo");
    }

    public abstract void sonido();
}
