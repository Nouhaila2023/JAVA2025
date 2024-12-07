package Tema1.Ejercicios;
import java.time.Month;
import java.util.Random;

public class Ejercicio17 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        //Escriba expresiones que almacenen en variables lo siguiente:

        //a. Crear un número entero positivo aleatorio entre 1 y 49.

        for (int i = 1; i <= 1; i++) {

            int numero = numero_aleatorio(1,49);

            System.out.println("a. " + numero);
        }

        //b. Generar un número aleatorio positivo par.

        int numero = numero_aleatorio(0,100);
        if (numero % 2 != 0){
            numero++;
        }
        System.out.println("b. " + numero);

        //c. Generar un número real aleatorio entre 1 y 10.

        for (int i = 1; i <= 1; i++) {

            int numero_c = numero_aleatorio(1,10);

            System.out.println("c. " + numero_c);
        }

        /*Otra manera*/
        double c = (int) (Math.random() * 10 +1);
        System.out.println("CC: " + c);


        //d. Crear un número entero negativo entre -50 y -150.


        for (int i = 1; i <= 1; i++) {

            int numero_d = numero_aleatorio(-50,-150);

            System.out.println("d. " + numero_d);
        }

        //e. Crear un número entero entre -100 y 100.

        for (int i = 1; i <= 1; i++) {

            int numero_e = numero_aleatorio(-100,100);

            System.out.println("e. " + numero_e);
        }

        //f. Generar un número aleatorio que sea uno de los siguientes: 5, 7, 33, 125 o 77

        //int numero_f1 = numero_aleatorio(5,125);
        /**if (numero_f1 == 5 || numero_f1 == 125 || numero_f1 == 33 || numero_f1 == 7 || numero_f1 == 77) {
            System.out.println("ff. " + numero_f1);
        }**/

            int[] numero_f = {5, 7, 33, 125, 77};

            Random random = new Random();

            // Generar un índice aleatorio dentro del rango de 0 a 4 (el tamaño del array - 1)
            int indiceAleatorio = random.nextInt(numero_f.length);

            // Seleccionar el número correspondiente
            int numeros = numero_f[indiceAleatorio];

            // Imprimir el número generado
            System.out.println("f. " + numeros);


            //g. Crea un generador aleatorio de uno de los meses del año


            String[] mesesDELano = {"Enero", "febrero", "marso", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "novombre", "desembre"};

            String mesAleatorio = mesesDELano[random.nextInt(mesesDELano.length)];

            System.out.println(mesAleatorio);


            //Otra menera con Month.of sale los mesas en Ingles
            int mese = (int) (Math.random() * (12 -1 +1) +1);

            System.out.println(Month.of(mese));


    }
}
