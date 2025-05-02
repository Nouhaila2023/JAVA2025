package Tema7_1.corsoGenericosColecciones.clecciones.set;

import java.util.*;


public class App {
    public static void main(String[] args) {

        Set<String> set1 = Set.of("A", "B", "C", "D");
        System.out.println(set1.size());
        for (String s : set1) {
            System.out.println(s);
        }

        System.out.println();

        /**
         *  for (Iterable<String> i = set1.iterator(); i.ihasNext();){
         *             System.out.println(i.next());
         *         }
         */

        //Este colicsion no permite repertidos
        Set<Alumno> set2 = new HashSet<>();
        set2.add(new Alumno("Y121314", "Nouhaila", "El Haloui"));
        set2.add(new Alumno("A121314", "Catalina", "Cari"));
        set2.add(new Alumno("G121314", "Calos", "Ca"));
        set2.add(new Alumno("G121314", "Calos", "Ca"));

        System.out.println();
        for (Alumno a : set2) {
            System.out.println(a);
        }

        System.out.println();

        Set<Alumno> set3 = new LinkedHashSet<>(set2);
        //siempre va estar el ultimo
        set3.add(new Alumno("D121314", "Miguel", "Rosa"));

        System.out.println();
        for (Alumno a : set3) {
            System.out.println(a);
        }


        //Ordena el numero de menor a mayor
        TreeSet<Integer> set4 = new TreeSet<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            set4.add(r.nextInt(100));
        }

        System.out.println(set4);

        for (int i : set4.descendingSet()){
            System.out.print(i + " ");
        }
        System.out.println();

        Set<Integer> set5 = set4.subSet(25,70);
        for (int i : set5){
            System.out.print(i + " ");
        }
        System.out.println();



    }
}
