package Tema7.corsoGenericosColecciones.genericos.genericosComodin;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Integer> listaInteger = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<String> listaString =  List.of("a","b","c","d");

        System.out.println("Con List<?> list: <<Pudemos impremir cualquie cosa>>");
        ProcesaListas.imprimirLista(listaInteger);
        ProcesaListas.imprimirLista(listaString);


        System.out.println("Con Lista<? extends Numbre>: <<Tememos derecho para impremir sop tipos de numerecos>>");
        ProcesaListas.imprimirLista1(listaInteger);
        ProcesaListas.imprimirLista2(listaInteger);
        ProcesaListas.imprimirLista3(listaInteger);

        System.out.println("Añadir numeros a la lista:");
        ProcesaListas.addLista(listaInteger);

        ProcesaListas.imprimirLista3(listaInteger);
    }
}
