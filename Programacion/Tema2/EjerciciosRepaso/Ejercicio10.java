package Tema2.EjerciciosRepaso;

/*Realiza un programa que genere una apuesta de la quiniela de forma aleatoria, son 14 filas donde debe
aparecer 1 X o 2. Intenta que los unos salgan en una columna, las equis en otra y los doses en otra.*/

public class Ejercicio10 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static String Ganador(int ganada){
        switch (ganada){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("  X");
                break;
            case 3:
                System.out.println("    2");
                break;
            default:
                System.out.println("");
        }
        return "";
    }


    public static void main(String[] args) {


        int juego = 0;


        for (int i = 0; i < 14; i++) {

            juego = numero_aleatorio(1,3);

            System.out.println((i+1) + ": " + Ganador(juego));

        }


    }
}
