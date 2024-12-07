package Tema1.Ejercicio1.EstructurasAlternativas;

        /*Ejercicio 6
        La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual
        se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la venta del
        producto, ésta es de un solo tipo y tamaño, se requiere determinar cuánto recibirá un
        productor por la uva que entrega en un embarque, considerando lo siguiente: si es de tipo
        A,se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de
        tamaño 2. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos
        cuando es de tamaño 2. Realice un algoritmo para determinar la ganancia obtenida.*/

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        double precio = 10.0;
        double precioFinal;

        Scanner sc = new Scanner(System.in);

        // Solicitar el tipo
        System.out.println("Introduzca el tipo de uva (A o B): ");
        char tipo = sc.next().charAt(0);

        // Solicitar el tamaño
        System.out.println("Introduzca el tamaño de la uva (1 o 2): ");
        int tamaño = sc.nextInt();

        if (tipo == 'A' || tipo == 'a' && tamaño == 1 ){
            precioFinal = precio+0.20;
            System.out.println("Si el tipo A y tamaño 1: " + precioFinal );
        } else if (tipo == 'A' || tipo == 'a' && tamaño == 2 ){
                precioFinal = precio+0.30;
                System.out.println("Si el tipo A y tamaño 2: " + precioFinal );
        }

        if (tipo == 'B' || tipo == 'b' && tamaño == 1 ){
            precioFinal = precio-0.30;
            System.out.println("Si el tipo B y tamaño 1: " + precioFinal );
        } else if (tipo == 'B' || tipo == 'b'  && tamaño == 2 ){
            precioFinal = precio-0.50;
            System.out.println("Si el tipo B y tamaño 2: " + precioFinal );
        }

        sc.close();
    }
}
