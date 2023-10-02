package vehiculos;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Fabricante {
    private String nombre;
    private Pais pais;
    static Map<Fabricante, Integer> cantidadFabricante = new ConcurrentHashMap<>();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        Pais.sumarACantidad(pais);
        cantidadFabricante.put(this, 0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public static void sumarACantidad(Fabricante fabricante){
        cantidadFabricante.merge(fabricante, 1, Integer::sum);
    }

    public static Fabricante fabricaMayorVentas(){
        return Collections.max(cantidadFabricante.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
