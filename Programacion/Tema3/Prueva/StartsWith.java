package Tema3.Prueva;

public class StartsWith {
    public static void main(String[] args) {

        String nombre;
        String subCadena;
        int tam;

        nombre = "Nouhila El Haloui";
        String ciudad = "Almeria";

        // EL startswith : para sabe si un string comienza con un determinado prefijo
        // kanxofo wax string katabda bdak lharf ola lcalma li 3tina

        System.out.print("Nombre -> ");

        if (nombre.startsWith("N")) {
            System.out.println("Corecto");
        } else {
            System.out.println("Incorecto");
        }

        System.out.print("Ciudad -> ");

        if (ciudad.startsWith("Malaga")) {
            System.out.println("Corecto");
        } else {
            System.out.println("Incorecto");
        }

        System.out.print("Nombre con desplazamiento (toffset) -> ");

        // nafs lhaja git¡r kana3tiwha la pocicion mnin 3atabda
        if (nombre.startsWith("ouh", 1)) {
            System.out.println("Corecto");
        } else {
            System.out.println("Incorecto");
        }

    }
}
