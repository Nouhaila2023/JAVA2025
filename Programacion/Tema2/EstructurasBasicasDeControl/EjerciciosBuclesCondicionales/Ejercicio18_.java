package Tema2.EstructurasBasicasDeControl.EjerciciosBuclesCondicionales;

public class Ejercicio18_ {

/*Marcus Cubitus y Julius Humerus, legionarios apasionados por los juegos de dados, aprovechan los días
cada vez más largos del mes de Iunius para probar nuevos juegos.

En este juego, en cada turno un jugador lanza cuatro dados y se anota la suma de los valores impares obtenidos,
mientras que el otro jugador lanza tres dados y se anota la suma de los valores pares obtenidos.
Gana el turno el jugador que obtenga más puntos y gana la partida el jugador que haya ganado más turnos*/

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static int Impars(int sumac) {


        for (int i = 0; i < 4; i++) {

            int numero = numero_aleatorio(1, 6);

            if (numero % 2 != 0) {
                sumac += numero;
                System.out.println("Numero *" + numero + "* Es Impare");

            }

        }
        System.out.println("La suma de los nuero impar: " + sumac);
        return sumac;
    }

    public  static int Par(int sumah){

        for (int i = 0; i < 3 ; i++) {

            int numero = numero_aleatorio(1,6);

            if (numero % 2 == 0){
                sumah += numero;
                System.out.println("Numero *" + numero + "* Es pare");

            }

        }
        System.out.println("La suma de los numeros par: " + sumah);

        return sumah;
    }



    public static void main(String[] args) {


        int sumac = 0, sumah = 0;

        sumac += Impars(sumac);
        sumah += Par(sumah);

        if (sumac > sumah) {
            System.out.println("Gana el jugador C");
        } else if (sumah  > sumac ) {
            System.out.println("Gana el jugador H");
        } else {
            System.out.println("Empate");
        }


    }

}
