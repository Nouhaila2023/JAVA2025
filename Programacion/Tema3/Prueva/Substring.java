package Tema3.Prueva;

public class Substring {
    public static void main(String[] args) {

        String texto1 = "Hola, mundo";
        String texto2 = "Hola, Nouhaila";

        System.out.println(texto1.length());
        System.out.println(texto2.length());

        System.out.println(texto1.substring(5));
        System.out.println(texto1.substring(0, 5));
        System.out.println(texto2.substring(5, texto2.length()));

    }
}
