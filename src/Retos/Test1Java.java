package Retos;

public class Test1Java {
    public static void main(String[] args) {

        System.out.println(salario(10));



    }
    static double salario(int horas){
        double salaryMinimun =1000000;
        double salary = 0;
        if (horas <= 40){
            salary = 0.015*salaryMinimun*horas;
        }

        else if (horas > 40){
            salary = 0.02*salaryMinimun*horas;

        }
        return salary;
    }


}
