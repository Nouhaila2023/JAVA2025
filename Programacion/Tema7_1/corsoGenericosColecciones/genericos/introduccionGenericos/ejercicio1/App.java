package Tema7_1.corsoGenericosColecciones.genericos.introduccionGenericos.ejercicio1;

public class App {
    public static void main(String[] args) {

        Object[] o = new Object[2];

        o[0] = new A("Hola");
        o[1] = new B(23.3);

        for (Object i : o) {
            System.out.println(i);
        }


    }
}
