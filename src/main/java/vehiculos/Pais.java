package vehiculos;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Pais {
    private String nombre;
    static Map<Pais, Integer> cantidadPais = new ConcurrentHashMap<>();

    public Pais(String nombre) {
        this.nombre = nombre;
        cantidadPais.put(this, 0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void sumarACantidad(Pais pais){
        cantidadPais.merge(pais, 1, Integer::sum);
    }

    public static Pais paisMasVendedor(){
        return Collections.max(cantidadPais.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
