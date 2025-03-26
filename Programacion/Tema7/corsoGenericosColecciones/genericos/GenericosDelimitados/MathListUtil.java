package Tema7.corsoGenericosColecciones.genericos.GenericosDelimitados;

import java.util.List;

public class MathListUtil <T extends Number>{

    public double suma(List<T> lista){
        double numero = 0.0;

        for (T num : lista){
            numero += num.doubleValue();
        }

        return numero;
    }
}
