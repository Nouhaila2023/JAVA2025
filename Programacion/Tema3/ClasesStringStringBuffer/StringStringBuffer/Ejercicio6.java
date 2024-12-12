package Tema3.ClasesStringStringBuffer.StringStringBuffer;

public class Ejercicio6 {

    // . Crea un método que determine si una cadena es un palíndromo, o sea, se lee
    // igual en los dos sentidos.




            public static void main(String[] args) {
                String cadena = "anilina hola"; // Ejemplo de cadena
                boolean esPalindromo = esPalindromo(cadena);
                System.out.println("¿Es '" + cadena + "' un palíndromo? " + esPalindromo);
            }

            public static boolean esPalindromo(String cadena) {
                // Convertir a minúsculas y eliminar espacios para que no afecte
                cadena = cadena.toLowerCase().replaceAll("\\s+", "");

                int inicio = 0;
                int fin = cadena.length() - 1;

                while (inicio < fin) {
                    // Comparar caracteres de los extremos
                    if (cadena.charAt(inicio) != cadena.charAt(fin)) {
                        return false; // No es un palíndromo
                    }
                    inicio++;
                    fin--;
                }
                return true; // Es un palíndromo
            }
        }






