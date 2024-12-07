package Tema3.Prueva;

public class EndsWith {

    public static void main(String[] args) {

        String cadena = "Programacion en Java";

        // igual a startsWith solo impieza del final
        System.out.println(cadena + " --> (con java) " + cadena.endsWith("java"));
        System.out.println(cadena + " --> (con Java) " + cadena.endsWith("Java"));
        System.out.println(cadena + " --> (con JAVA) " + cadena.endsWith("JAVA"));

    }
}