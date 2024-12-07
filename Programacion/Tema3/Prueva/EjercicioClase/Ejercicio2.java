package Tema3.Prueva.EjercicioClase;

public class Ejercicio2 {
    /**
     * 2. Simulación sensores de movimiento
     * Un edificio tiene una matriz de sensores de movimiento simulando una sala.
     * Tendría una matriz de 5x5, total 25 sensores. Si tiene un 0 una casilla
     * es que no hay movimiento, si tiene 1, es que sí hay movimiento
     * - Genera aleatoriamente el estado de los sensores de la sala
     * - Calcula cuántos sensores están activados
     * - Identifica si hay una región de movimiento contínuo, es decir al menos un bloque 2x2 con
     * todos los sensores activados.
     * @param
     */

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {


        int matriz[][] = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = numero_aleatorio(0,1);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == 1){
                    contador++;
                }
            }
            System.out.println();
        }

        int contadorBloque = 0;
        for (int i = 0; i < matriz.length-1; i++) {
            for (int j = 0; j < matriz.length-1; j++) {

                if (matriz[i][j] == 1 && matriz[i][j+1] == 1 && matriz[i+1][j] == 1 && matriz[i+1][j+1] == 1 ) {
                    contadorBloque++;
                }

            }
        }


        System.out.println("Hay " + contador + " movimiento.");

        if (contadorBloque == 0){
            System.out.println("No hay bloque");
        }
        else {
            System.out.println("hay " + contadorBloque + " bloque");
        }



    }
}
