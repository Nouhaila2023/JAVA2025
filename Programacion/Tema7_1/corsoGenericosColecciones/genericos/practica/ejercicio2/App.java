package Tema7_1.corsoGenericosColecciones.genericos.practica.ejercicio2;

public class App {
    public static void main(String[] args) {

        Vector <String> v = new Vector<>();
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("E");

        System.out.println(v.size());

        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + ",");
        }

        v.remove(2);

        System.out.println(v.size());
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i)+ ",");
        }

    }
}
