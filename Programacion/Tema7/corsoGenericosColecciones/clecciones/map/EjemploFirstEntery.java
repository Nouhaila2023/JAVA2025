package Tema7.corsoGenericosColecciones.clecciones.map;

import java.util.Map;
import java.util.TreeMap;

public class EjemploFirstEntery {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");

        // Obtener la primera entrada
        Map.Entry<Integer, String> entry = map.firstEntry();
        System.out.println(entry.getKey() + ": " + entry.getValue()); // Salida: 10: A
    }
}
