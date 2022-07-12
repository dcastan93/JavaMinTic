package ClasesJavaUIS;

public class Estudiantes {
    private String name;
    private double [] notas;

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    private double promedio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public Estudiantes(String name, double [] notas){
        this.name = name;
        this.notas = notas;
    }

    public void calcularPromedio(){
        if ( notas.length>0){
            double acum = 0;
            for (int i = 0; i< notas.length ; i++){
                acum = acum + notas[i];

            }
            this.promedio = acum/notas.length;
        }
        else{
            System.out.println("Ingrese al menos una nota");
        }

    }
}
