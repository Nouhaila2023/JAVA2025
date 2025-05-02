package Tema7_1.corsoGenericosColecciones.genericos.GenericosDelimitados;

public class MultipleBound {

    public static <T extends Number & Comparable<T>> T max(T a, T b, T c)  {
        T max = a;
        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;
        return max;

    }
}
