package ClasesJavaUIS;

import java.util.Arrays;

public class Pasajero {
    private String name;
    private String apellido;

    private int numeroDocumento;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String[] getEquipajes() {
        return equipajes;
    }

    public void setEquipajes(String[] equipajes) {
        this.equipajes = equipajes;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    private String [] equipajes;


    public Pasajero (){
        this.name = "";
        this.apellido = "";
        this.numeroDocumento = 0;
        this.equipajes = new String[3];
        this.equipajes[0] = "";
        this.equipajes[1] = "";
        this.equipajes[2] = "";
    }

    public Pasajero (String name, String apellido, int numeroDocumento, String [] equipajes ){
        this.name = name;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.equipajes = equipajes;
    }
    public String toString(){

        return "nombre del pasajero:  "+this.name
                + "\n" +" apellido del pasajero: " + this.apellido
                +"\n"+ " numero de documento: " + this.numeroDocumento
                +"\n" +" tipo de equipaje: " + Arrays.toString(this.equipajes);
    }



}
