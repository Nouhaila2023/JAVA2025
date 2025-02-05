package Tema5.Practica.StringBuffer;

public class StringBuffer1 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hola");

        // Agregar texto (append)
        sb.append(" Mundo");
        System.out.println(sb);  // "Hola Mundo"

        // Insertar en una posición específica
        sb.insert(5, "Querido ");
        System.out.println(sb);  // "Hola Querido Mundo"

        // Reemplazar una parte de la cadena
        sb.replace(5, 12, "Amigo");
        System.out.println(sb);  // "Hola Amigo Mundo"

        // Eliminar una parte de la cadena
        sb.delete(5, 11);
        System.out.println(sb);  // "Hola Mundo"

        // Invertir la cadena
        sb.reverse();
        System.out.println(sb);  // "odnuM aloH"

    }
}
