package Ejemplo2Polimorfismo;

public class SeleccionFutbol {

    private int id;
    private int edad;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int telefono;

    public SeleccionFutbol(){}

    public SeleccionFutbol(int id, int edad, String nombre, String apellido, String nacionalidad, int telefono) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "SeleccionFutbol{" +
                "id=" + id +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", telefono=" + telefono +
                '}';
    }


    public void estaTrabajando(){
        System.out.println("Estoy trabajando!");
    }

    public void noTrabajando(){
        System.out.println("No estoy trabajando!");
    }
    public void firmarContrato(){
        System.out.println("Me contrataron!");
    }

}
