package Tema3.PrimeraEvaluacion;

public class Ejercicio2 {

    public static int numero_aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    /**
     * Es un juego de dados muy facil, y consiste en arrojar la suma de 2 dados,
     * y su suma es 7 u 11 ganas la partida. En cambio, si sacas un 2, 3 o 12
     * pierdes.
     * Con cualquier otro numero que saques, debes guardar ese número y tirar los
     * dados
     * repetidamente hasta volver a sacar ese dado (ganas) o sacar el 7 (pierdes).
     * Realiza el juego para dos jugadores simulando las tiradas de forma aleatoria
     * y que jueguen 10 partidas, indica cuántas partidas gana jugador1 y cuántas
     * jugador2.
     * Ahora simula 1000 partidas e indica las partidas que gana cada uno.
     */

    public static void main(String[] args) {

        int dado1, dado2, suma = 0, guardar = 0;

        for (int i = 0; i < 10; i++) {
            suma = 0;
            System.out.println("--------------------");
            for (int j = 0; j < 2; j++) {

                dado1 = numero_aleatorio(1, 6);
                dado2 = numero_aleatorio(1, 6);
                System.out.println("Dado1: " + dado1);
                System.out.println("Dado2: " + dado2);

                suma += (dado1 + dado2);
            }

            System.out.println("La suma: " + suma);

            /**
             * Con cualquier otro numero que saques, debes guardar ese número y tirar los
             * dados
             * repetidamente hasta volver a sacar ese dado (ganas) o sacar el 7 (pierdes).
             */

            if (suma == 7 || suma == 11) {
                System.out.println("Has ganado la partida.");
            } else if (suma == 2 || suma == 3 || suma == 12) {
                System.out.println("Has perdido la partida.");
            } else {
                guardar = suma;

                if (guardar != 7) {
                    System.out.println("Ganas");
                } else {
                    System.out.println("Pierdes");
                }

            }
        }

    }
}
