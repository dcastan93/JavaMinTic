package ClasesJavaUIS;

import javax.swing.*;

public class ArrayClass {
    int numeroEstudiantes = 0;
    double [] notas = new double[numeroEstudiantes];

    public ArrayClass( int numeroEstudiantes){
        this.numeroEstudiantes = numeroEstudiantes;
        System.out.println("El numero de estudiantes es: "+numeroEstudiantes);
    }

    public void promedio(){
        double promedio = 0.0;
        for (int i = 0; i<numeroEstudiantes; i++){
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese nota"+(i+1)));
        }

    }



}
