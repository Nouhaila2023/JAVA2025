package Tema3.PrimeraEvaluacion;

import java.util.Scanner;

import Tema1.Ejercicio1.EstructurasAlternativas.test;

public class Ejercicio3 {

    /**
     * @param texto
     * @return
     */
    public static String convertirAMorse(String texto[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu texto:");

        for (int i = 0; i < texto.length; i++) {
            texto[i] = sc.nextLine().toLowerCase();
            for (int j = 0; j < texto[i].length(); j++) {
                char caracterMorse = texto[i].charAt(j);
                switch (caracterMorse) {
                    case ' ':
                        System.out.print("#");
                        break;
                    case 'a':
                        System.out.print(".-");
                        break;
                    case 'b':
                        System.out.print("-...");
                        break;
                    case 'c':
                        System.out.print("-.-.");
                        break;
                    case 'd':
                        System.out.print("-..");
                        break;
                    case 'e':
                        System.out.print(".");
                        break;
                    case 'f':
                        System.out.print("..-.");
                        break;
                    case 'G':
                        System.out.print("--.");
                        break;
                    case 'h':
                        System.out.print("....");
                        break;
                    case 'i':
                        System.out.print("..");
                        break;
                    case 'j':
                        System.out.print(".---");
                        break;
                    case 'k':
                        System.out.print("-.-");
                        break;
                    case 'l':
                        System.out.print(".-..");
                        break;
                    case 'm':
                        System.out.print("--");
                        break;
                    case 'n':
                        System.out.print("-.");
                        break;
                    case 'o':
                        System.out.print("---");
                        break;
                    case 'p':
                        System.out.print(".--.");
                        break;
                    case 'q':
                        System.out.print("--.-");
                        break;
                    case 'r':
                        System.out.print(".-.");
                        break;
                    case 's':
                        System.out.print("...");
                        break;
                    case 't':
                        System.out.print("-");
                        break;
                    case 'u':
                        System.out.print("..-");
                        break;
                    case 'v':
                        System.out.print("...-");
                        break;
                    case 'w':
                        System.out.print(".--");
                        break;
                    case 'x':
                        System.out.print("-..-");
                        break;
                    case 'y':
                        System.out.print("-.--");
                        break;
                    case 'z':
                        System.out.print("--..-");
                        break;
                    default:
                        break;
                }
            }
        }

        sc.close();
        return String.join(" ", texto);

    }

    /*
     * Vamos a implementar funciones para usar Morse. En primer lugar, te pongo la
     * equivalencia de las letras a caracteres Morse.
     * Tienes que implementar una función convertirAMorse que reciba como
     * parámetro una cadena de texto en español y devolver un String con la
     * misma cadena, pero traducida a Morse. Los espacios entre palabras ponlos
     * con el carácter “#”. Cada letra Morse la separaremos por un espacio.
     * Pruébala. Ej: “hola mundo”  “…. --- .-.. .-#-- ..- -. -.. ---“
     * Ahora vas a realizar una función que haga lo contrario convertirDeMorse
     * que reciba una cadena con un texto en Morse, las palabras separadas por el
     * carácter “#” y debes pintar el texto original en español. Además, para leer
     * bien cada letra Morse, irá separada por un espacio.
     * Recuerda que puedes usar indexOf pasándole un segundo parámetro que te
     * diga a partir de donde buscar. Intenta hacer el ejercicio al principio solo
     * con
     * una palabra, y cuando lo tengas prueba a hacerlo con más de una palabra.
     * Pista: para la equivalencia construye dos arrays de Strings, uno con las
     * letras
     * y otro con las traducciones a Morse. Al estar en la misma posición, tienes la
     * traducción. Como un diccionario.
     */
    public static void main(String[] args) {

        String texto[] = new String[1];

        String morse = convertirAMorse(texto);

        System.out.println(morse);

    }
}