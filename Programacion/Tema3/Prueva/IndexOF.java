package Tema3.Prueva;

public class IndexOF {
    public static void main(String[] args) {

        String texto = "Hola mundo";

        // buscamos mundo si hay en el texto
        int index1 = texto.indexOf("mundo");
        System.out.println("index1 -> " + index1);

        // buscamos el o desde la pocicion 5
        int index2 = texto.indexOf("o", 5);
        System.out.println("index2 -> " + index2);

        // buscamos el aaaa si hay en el texto si no devuelve -1
        int index3 = texto.indexOf("aaaa");
        System.out.println("index3 -> " + index3);

    }
}