package Tema3.ClasesStringStringBuffer.StringStringBuffer;

public class Ejercicio13 {

    /*
     * . Encontrar la palabra de mayor longitud de este texto: “No se me ocurre
     * ninguna frase larga”.
     */

    public static void main(String[] args) {

        String texto = "No se me ocurre ninguna frase larga";
        System.out.println("Texto --> " + texto);

        String partes[] = texto.split(" ");
        String guardad = "";

        for (int i = 0; i < partes.length; i++) {

            if (partes[i].length() > guardad.length()) {
                guardad = partes[i];

            }

        }
        System.out.println("El mayor longitud de este texto --> " + guardad);

    }
}
