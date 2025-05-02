package Tema7_1.corsoGenericosColecciones.genericos.metodosGenericos;

import java.util.List;

public class ClaseConGenericos <T>{

    public void imprimir(List<T> lista){
        for (T t : lista){
            System.out.println(t);
        }
    }

}
