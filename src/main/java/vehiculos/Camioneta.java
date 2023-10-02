package vehiculos;

public class Camioneta extends Vehiculo{
    private boolean volco;

    protected static int CantidadVehiculos = 0;
    public Camioneta(String placa, int puertas, String nombre, float precio, int peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        CantidadVehiculos++;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }


}
