package Tema7_1.corsoGenericosColecciones.genericos.introduccionGenericos.ejercicio3;

import Tema7_1.corsoGenericosColecciones.genericos.introduccionGenericos.ejercicio1.A;
import Tema7_1.corsoGenericosColecciones.genericos.introduccionGenericos.ejercicio1.B;

public class App {
    public static void main(String[] args) {

        A a = new A("Hola");
        B b = new B(23.3);

        Box<A> aBox = new Box<>(a);
        Box<B> bBox = new Box<>(b);
        Box<?> box = Box.EMPTY;

        Box<?>[] array = new Box[]{aBox, bBox, box};

        Box<Integer> boxInteger = new Box<>(1);
        Box<String> boxString = new Box<>("Hola");
    }
}
