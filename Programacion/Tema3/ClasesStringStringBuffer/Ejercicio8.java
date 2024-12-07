package Tema3.ClasesStringStringBuffer;

public class Ejercicio8 {

    /**
     * . Divide la cadena “http://www.iesjaroso.es/noticias” en “http”, “www.iesjaroso.es”, “noticias
     * @param args
     */

    public static void main(String[] args) {

        String cadena = "http://www.iesjaroso.es/noticias";

        System.out.println(cadena);

        StringBuffer sb = new StringBuffer(cadena);
        cadena = sb.toString();

        System.out.println(cadena.substring(0,4));
        System.out.println(cadena.substring(7,23));
        System.out.println(cadena.substring(24,32));


        


    }
}
