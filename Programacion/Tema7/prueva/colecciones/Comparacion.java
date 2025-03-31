package Tema7.prueva.colecciones;

import java.util.*;

public class Comparacion {
    public static void main(String[] args) {
        // LIST: Permite duplicados
        List<String> lista = new ArrayList<>(List.of("A", "B", "A"));
        System.out.println("List: " + lista);  // [A, B, A]

        // SET: No permite duplicados
        Set<String> conjunto = new HashSet<>(List.of("A", "B", "A"));
        System.out.println("Set: " + conjunto);  // [A, B] (Sin duplicados)

        // MAP: Clave-Valor
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "A");
        mapa.put(2, "B");
        mapa.put(1, "C");  // Reemplaza "A" con "C"
        System.out.println("Map: " + mapa);  // {1=C, 2=B}
    }
}
