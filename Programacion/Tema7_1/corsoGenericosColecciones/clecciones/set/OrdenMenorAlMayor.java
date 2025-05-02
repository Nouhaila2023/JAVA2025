package Tema7_1.corsoGenericosColecciones.clecciones.set;

import java.util.Set;
import java.util.TreeSet;

public class OrdenMenorAlMayor {
        public static void main(String[] args) {
            Set<Integer> set = new TreeSet<>();
            set.add(5);
            set.add(2);
            set.add(8);
            set.add(1);

            System.out.println(set); // 🔹 Salida: [1, 2, 5, 8] (Ordenado de menor a mayor)
        }
}
