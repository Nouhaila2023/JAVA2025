package Prueva;

public class EjemploStringBuilder {
    public static void main(String[] args) {
        String a = "Hola";

        // Crear un StringBuilder con el valor inicial de la cadena 'a'
        StringBuilder sb = new StringBuilder(a);

        // Usar métodos de StringBuilder para modificar la cadena
        sb.append(" Mundo");  // Concatenar " Mundo" al final
        sb.insert(5, "Hermoso ");  // Insertar "Hermoso " en la posición 5

        // Convertir el StringBuilder de vuelta a String
        String resultado = sb.toString();

        System.out.println(resultado);  // Imprime "Hola Hermoso Mundo"
    }
}

