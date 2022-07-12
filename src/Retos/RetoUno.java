package Retos;

public class RetoUno {
    public static void main(String[] args) {
        System.out.println(calcularCostoAlmacenamiento(true, 10000));

    }

    static float calcularCostoAlmacenamiento(boolean refrigerado, float valorBase) {
        if (refrigerado) {
            valorBase = (float) (valorBase + valorBase * 0.3);
        } else {
            valorBase = (float) (valorBase + valorBase * 0.15);
        }
        return valorBase;
    }
}
