package Tema7.prueva;

public class EjemploFormatted {
    public static void main(String[] args) {
        /**
         *%s: Placeholders para cadenas de texto (String).
         *
         * %d: Placeholders para números enteros (int, Integer).
         *
         * %f: Placeholders para números decimales (float, double).
         */
        String nombre = "Juan";
        int edad = 25;
        String mensaje = "Mi nombre es %s y tengo %d años".formatted(nombre, edad);
        System.out.println(mensaje);
    }
}
