package Tema7_1.corsoGenericosColecciones.clecciones.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> lista1 = Arrays.asList("Uno", "Dos", "Tres");

        //Para add y remove en Arrays.asList no vale
        //lista.add("Cuatro");
        //lista.remove(0);

        //El set si vale par modificar(Sutetier)
        lista1.set(0, "Cero");
        System.out.println(lista1);

        List<Integer> lista2 = List.of(1,2,3);

        //error
        //lista2.add(5);
        //lista2.remove(2);
        //lista2.set(0, 4);

        List<Prodocto> lista3 = List.of(
                new Prodocto("Boligrafo", 1.20),
                new Prodocto("Folios", 3.30)
        );
        System.out.println(lista3);

        //Para modificar si pudemos
        lista3.get(1).setPrecio(4.9);
        System.out.println(lista3);


        List<Integer> lista4 = new ArrayList<>();
        //Añadir
        lista4.add(1);
        lista4.add(2);
        lista4.add(3);
        //Borar el 2
        lista4.remove(1);
        //Añadir forma lista
        lista4.addAll(List.of(4,5,6));
        System.out.println(lista4);

        System.out.println();

        for (int i = 0; i < lista4.size(); i++) {
            System.out.println(lista4.get(i));
        }

        System.out.println();

        for (int n : lista4) {
            System.out.println(n);
        }

        List<Integer> lista5 = new ArrayList<>(List.of(13,25,35, 10));
        for (Iterator<Integer> it = lista5.iterator(); it.hasNext(); ) {
            int n = it.next();
            if (n%5==0){
                it.remove();
            }
            System.out.println(lista5);
        }

        System.out.println(lista5);
        System.out.println();

        //indexOf bosque las cosas de vvuelva -1 si es fales
        int pos = lista1.indexOf("Cero");
        System.out.println(pos);
        int pos2 = lista4.lastIndexOf(11);
        System.out.println(pos2);

        System.out.println();

        //Se usa el clear con la lista new ArrayList<>(Lista.of(1,2,3,4)); y no con la lista normal Lista.of(1,2,3,4)
        lista5.clear();
        System.out.println(lista5.isEmpty());

        System.out.println();
        lista4.set(0,12);
        System.out.println(lista4);
        lista4.removeAll(List.of(4,5,6));
        System.out.println(lista4);

        System.out.println();
        //subList(0,2) intenta obtener una sublista desde el indice 0 hasta el indice 2
        List<Integer> sublistas = lista4.subList(0,2);
        System.out.println(sublistas);
        lista4.set(0,3);
        System.out.println(sublistas);
        //lista4.remove(0);
        //System.out.println(sublistas);

        String[] array = new String[lista4.size()];
        //array = lista4.toArray(array);
        System.out.println(Arrays.toString(array));

    }
}
