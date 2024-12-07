package Tema2.EstructurasBasicasDeControl.EjerciciosBucles;

public class Ejercicio6 {

    /*Programa que sume los 100 primeros números enteros impares. */


    public static void Impares(){

        int suma = 0;

        for (int i = 1; i <= 200; i++) {
            if (i % 2 != 0){
                System.out.println(i);
                suma += i;
            }
        }
        System.out.println("La suma es: " + suma );
    }

    public static void main(String[] args) {

        Impares();

    }
}
