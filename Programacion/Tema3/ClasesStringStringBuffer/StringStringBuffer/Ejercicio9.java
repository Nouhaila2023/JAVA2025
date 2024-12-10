package Tema3.ClasesStringStringBuffer;

public class Ejercicio9 {


    /**
     * Metodo para juntar cadenas de texto con StringBuilder
     * @return String
     */
    public static String combinarCadenas(){

        // Creamos el objeto StringBuilder
        StringBuilder cadena = new StringBuilder();

        // Añadir las cadenas
        cadena.append("Hola ");
        cadena.append("me llamo ");
        cadena.append("Nouhaila El Haloui ");

        return cadena.toString();
    }

    /**
     * Crear una cadena de texto formada por tres cadenas
     * “una”, “dos” y “tres” usando StringBuilder
     * @param args
     */

    public static void main(String[] args) {

        /*StringBuilder sb = new StringBuilder();

        sb.append("una, ");
        sb.append("dos, ");
        sb.append("tres");

        System.out.println(sb);*/

        String cadena = combinarCadenas();
        System.out.println(cadena);


    }
}
