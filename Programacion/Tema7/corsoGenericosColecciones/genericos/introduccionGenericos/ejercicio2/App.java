package Tema7.corsoGenericosColecciones.genericos.introduccionGenericos.ejercicio2;

import Tema7.corsoGenericosColecciones.genericos.introduccionGenericos.ejercicio1.A;
import Tema7.corsoGenericosColecciones.genericos.introduccionGenericos.ejercicio1.B;

public class App {
    public static void main(String[] args) {

        A a = new A("Hola");
        B b = new B(23.3);

        Box b1 = new Box(a);
        Box b2 = new Box(b);
        Box b3 = Box.EMPTY;


    }
}
