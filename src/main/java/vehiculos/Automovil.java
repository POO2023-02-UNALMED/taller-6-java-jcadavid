package vehiculos;

public class Automovil extends Vehiculo{
    private int puestos;
    protected static int CantidadVehiculos = 0;
    public Automovil(String placa, String nombre, float precio, int peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        CantidadVehiculos++;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
}
