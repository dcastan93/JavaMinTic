package Ejemplo2Herencia;

public class SeleccionFutbol {
    private int edad;
    private  String nombre;
    private String apellido;
    private String id;
    private String nacionalidad;
    private String telefono;

    public SeleccionFutbol(){

    }

    public SeleccionFutbol(int edad, String nombre, String apellido, String id, String nacionalidad, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
    }

    public void estaTrabajando(){
        System.out.println("estoy trabajando");
    }
    public void firmarContrato(){
        System.out.println("me contrataron");

    }
    public void noTrabajando(){
        System.out.println("No estoy trabajando");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
