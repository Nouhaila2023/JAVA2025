package Tema7_1.corsoGenericosColecciones.genericos.metodosGenericos;


import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Integer> listaInteger =  List.of(1,2,3,4,5);
        List<String> listaString =  List.of("a","b","c","d");

        //Clase sin genericos para impremir de tipos necisitamos dos metodos
        ClaseSinGenerica claseSinGenerica = new ClaseSinGenerica();

        System.out.println("Lista de elementos sin clase generico: " );
        claseSinGenerica.listarConInteger(listaInteger);
        claseSinGenerica.listarConString(listaString);

        //Colase con genericos para impremir de tipos necisitamos unico metodo que coge el T
        ClaseConGenericos claseConGenerico = new ClaseConGenericos();

        System.out.println("Lista de elementos con clase generico: " );
        claseConGenerico.imprimir(listaInteger);
        claseConGenerico.imprimir(listaString);


        System.out.println("Lista de elementos util clase generico: " );
        ClaseUtil.imprimirClase(listaInteger);
        ClaseUtil.imprimirClase(listaString);






    }
}
