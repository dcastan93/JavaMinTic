package TutoriaTematicaMartes8.Ejemplo2Herencia;

public class Futbolista extends SeleccionFutbol{
    private int numCamisa;
    private String posicion;

    public Futbolista() {
        super();
    }

    public Futbolista(int edad, String nombre, String apellido, String id, String nacionalidad, String telefono, int numCamisa, String posicion) {
        super(edad, nombre, apellido, id, nacionalidad, telefono);
        this.numCamisa = numCamisa;
        this.posicion = posicion;
    }

    public void entrenando(){
        System.out.println("Estoy entrenando");

    }
    public void jugando(){
        System.out.println("estoy jugando");
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "numCamisa=" + numCamisa +
                ", posicion='" + posicion + '\'' +
                '}'+ "\n Nombre: "+ getNombre()+ "\n apellido: "+ getApellido();
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
