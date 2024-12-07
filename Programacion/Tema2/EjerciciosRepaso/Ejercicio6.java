package Tema2.EjerciciosRepaso;

public class Ejercicio6 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        /*Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la forma:
        suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de suspensos, el número
        de suficientes, el número de bienes, etc.*/

        int nota = 0;

        for (int i = 0; i < 20; i++) {
            nota = numero_aleatorio(1,20);
            if (nota < 5){
                System.out.println("Suspenso: " + nota);
            } else if (nota == 5 || nota == 6 ) {
                System.out.println("Suficiente: " + nota);
            } else if (nota > 6 && nota <=8) {
                System.out.println("Bien: " + nota);
            }else if(nota == 9 || nota == 10){
                System.out.println("Notable: " + nota);
            }
        }

    }
}
