package Tema7_1.corsoGenericosColecciones.clecciones.map;

import java.util.TreeMap;

public class EjemploCeilingKey {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");

        // Buscar la primera clave mayor o igual a 25
        Integer clave = map.ceilingKey(25);
        System.out.println(clave); // Salida: 30 (porque 30 es mayor o igual a 25)
    }
}
