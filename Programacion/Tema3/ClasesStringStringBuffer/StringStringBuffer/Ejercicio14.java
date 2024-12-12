package Tema3.ClasesStringStringBuffer.StringStringBuffer;

public class Ejercicio14 {

    /**
     *  Cifrado César. Crea un algoritmo de encriptación que se le pase una frase y una clave (numérica). Lo
     * que hará será sumar en ASCII esa clave a cada letra de la frase. Prueba a realizar una función para
     * desencriptar.
     * @param text
     * @param clave
     * @return
     */
    public static String cifradoCesar(String text, int clave) {
        StringBuffer sb = new StringBuffer();
        char car;
        for(int i=0; i < text.length(); i++) {
            car = text.charAt(i);
            sb.append((char) (car + clave));
        }
        return sb.toString();
    }

    public static String descifradoCesar(String text, int clave) {
        StringBuffer sb = new StringBuffer();
        char car;
        for(int i=0; i < text.length(); i++) {
            car = text.charAt(i);
            sb.append((char) (car - clave));
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String texto = "Esto es un mensaje secreto";
        //Hvw...
        //E + 3 -> char + int = int
        System.out.println(cifradoCesar(texto, 5));
        String mensajeCifrado = cifradoCesar(texto, 5);
        System.out.println(descifradoCesar(mensajeCifrado, 5));
    }
}