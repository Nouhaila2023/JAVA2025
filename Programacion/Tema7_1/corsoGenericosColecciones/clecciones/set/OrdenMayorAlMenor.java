package Tema7_1.corsoGenericosColecciones.clecciones.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class OrdenMayorAlMenor {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        set.add(5);
        set.add(2);
        set.add(8);
        set.add(1);

        System.out.println(set); // 🔹 Salida: [8, 5, 2, 1] (Ordenado de mayor a menor)
    }
}
