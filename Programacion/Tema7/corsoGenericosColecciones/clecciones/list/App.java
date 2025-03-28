package Tema7.corsoGenericosColecciones.clecciones.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> lista = Arrays.asList("Uno", "Dos", "Tres");

        //Para add y remove en Arrays.asList no vale
        //lista.add("Cuatro");
        //lista.remove(0);

        //El set si vale par modificar(Sutetier)
        lista.set(0, "Cero");
        System.out.println(lista);

        List<Integer> lista2 = List.of(1,2,3);

        //error
        //lista2.add(5);
        //lista2.remove(2);
        //lista2.set(0, 4);

        List<Prodocto> lista1 = List.of(
                new Prodocto("Boligrafo", 1.20),
                new Prodocto("Folios", 3.30)
        );
        System.out.println(lista1);

        //Para modificar si pudemos
        lista1.get(1).setPrecio(4.9);
        System.out.println(lista1);


        List<Integer> lista3 = new ArrayList<>();
        //Añadir
        lista3.add(1);
        lista3.add(2);
        lista3.add(3);
        //Borar el 2
        lista3.remove(1);
        //Añadir forma lista
        lista3.addAll(List.of(4,5,6));
        System.out.println(lista3);

        System.out.println();

        for (int i = 0; i < lista3.size(); i++) {
            System.out.println(lista3.get(i));
        }

        System.out.println();

        for (int n : lista3) {
            System.out.println(n);
        }

        List<Integer> lista4 = new ArrayList<>(List.of(13,25,35, 10));
        for (Iterator<Integer> it = lista4.iterator(); it.hasNext(); ) {
            int n = it.next();
            if (n%5==0){
                it.remove();
            }
            System.out.println(lista4);
        }

        System.out.println(lista4);
        System.out.println();

        int pos = lista.indexOf("Cero");
        System.out.println(pos);
        int pos2 = lista4.lastIndexOf(11);
        System.out.println(pos2);

        System.out.println();




    }
}
