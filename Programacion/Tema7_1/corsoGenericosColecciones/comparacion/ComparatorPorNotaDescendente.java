package Tema7_1.corsoGenericosColecciones.comparacion;

import java.util.Comparator;

public class ComparatorPorNotaDescendente implements Comparator<Alumno> {

    /**
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Alumno o1, Alumno o2) {
        return Integer.compare(o1.getEdad(), o2.getEdad());
    }


}
