package ParkingSystem;

public class Register {
    private int iD;
    private String horaEntrada;
    private String placaVehiculo;
    private String tipoVehiculo;

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public Register(int iD, String horaEntrada, String placaVehiculo, String tipoVehiculo){
        this.iD = iD;
        this.horaEntrada = horaEntrada;
        this.placaVehiculo = placaVehiculo;
        this.tipoVehiculo = tipoVehiculo;


    }
}
