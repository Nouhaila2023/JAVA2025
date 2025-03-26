package Tema7.corsoGenericosColecciones.genericos.metodosGenericos;

import java.util.List;

public class ClaseUtil {

    public static <T> void imprimirClase(List<T> lista) {
        for (T t : lista) {
            System.out.println(t);
        }
    }

}
