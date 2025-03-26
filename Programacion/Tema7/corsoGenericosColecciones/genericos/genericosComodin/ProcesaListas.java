package Tema7.corsoGenericosColecciones.genericos.genericosComodin;

import java.util.List;

public class ProcesaListas {

    public static void imprimirLista(List<?> list){
        for (Object o : list){
            System.out.println(o);
        }
    }

    public static void imprimirLista1(List<? extends Number> list){
        for (Object o : list){
            System.out.println(o);
        }
    }

    public static void imprimirLista2(List<? extends Number> list){
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + ",");
        }
        System.out.println(" ");
    }

    public static void imprimirLista3(List<? extends Number> list){
        for(int i = 0; i<=list.size()-2; i++){
            System.out.print(list.get(i) + ",");
        }
        System.out.println(list.get(list.size()-1));
    }

    public static void addLista(List <? super Integer> list){
        for (int i=6; i<= 10; i++){
            list.add(i);
        }
    }
}
