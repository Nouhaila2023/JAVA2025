package Tema7.corsoGenericosColecciones.clecciones.map;

import java.util.*;

public class App {
    public static void main(String[] args) {

        //Forma 1
        Map<Integer, String> m1 = Map.of(1,"Uno", 2,"Dos",3,"Tres");
        System.out.println(m1);

        //Forma2
        Map<Integer, String> m2 = Map.ofEntries(
                Map.entry(1,"Uno"),
                Map.entry(2, "Dos"),
                Map.entry(3, "Tres")
        );
        System.out.println(m2);

        Map<Integer, String> m3 = new HashMap<>();
        m3.put(1,"Uno");
        m3.put(2,"Dos");
        m3.put(3,"Tres");
        System.out.println(m3);

        System.out.println(m1.equals(m3));
        System.out.println(m3.get(3));
        System.out.println(m3.get(4));
        System.out.println(m3.getOrDefault(4,"Cuatro"));
        System.out.println(m3);
        System.out.println();

        for (int n : m3.keySet()) {
            System.out.println("%d %s".formatted(n, m3.get(n)));
        }

        if (!m3.containsKey(4)){
            m3.put(4,"Cuatro");
        }

        System.out.println(m3);

        m3.replace(3,"TRES");
        m3.remove(2);
        System.out.println(m3);

        Map<Integer, String> m4 = new LinkedHashMap<>();
        m4.put(1,"Uno");
        m4.put(2,"Dos");
        m4.put(3,"Tres");

        System.out.println(m4);

        for (Integer s : m4.keySet()){
            System.out.println(s);
        }

        for (int n : m4.keySet()) {
            System.out.println("%d %s".formatted(n, m4.get(n)));
        }

        TreeMap<Integer, String> m5 = new TreeMap<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int n = r.nextInt(100);
            m5.put(n , String.valueOf(n*n));
        }

/**
 *         Map.Entry<Integer, String> menor = m5.firstEntry();
 *         System.out.println("%d %d".formatted(menor.getKey(), menor.getKey()));
 *         //floorKey
 *         int mayorQueValor = m5.ceilingKey(50);
 *         System.out.println("%d %d".formatted(mayorQueValor, m5.get(mayorQueValor)));
 */





    }
}
