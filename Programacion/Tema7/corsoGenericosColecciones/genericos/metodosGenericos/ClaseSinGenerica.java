package Tema7.corsoGenericosColecciones.genericos.metodosGenericos;

import java.util.List;

public class ClaseSinGenerica {

    public void listarConInteger(List<Integer> lista) {
        for (Integer integer : lista) {
            System.out.println(integer);
        }
    }

    public void listarConString(List<String> lista) {
        for (String string : lista) {
            System.out.println(string);
        }
    }


}
