
package Tema3.StringStringBuffer;

public class Ejercicio8 {

    /*
     * . Divide la cadena “http://www.iesjaroso.es/noticias” en “http”,
     * “www.iesjaroso.es”, “noticias”.
     */

    public static void main(String[] args) {

        String texto = "http://www.iesjaroso.es/noticias";

        char pucicion;
        char caracter = '/';

        for (int i = 0; i < texto.length(); i++) {
            pucicion = texto.charAt(i);

            if (pucicion == caracter) {
                System.out.println(" ");
            }
        }

        System.out.println(texto);

    }
}