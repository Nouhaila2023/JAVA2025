package Tema2.Prueva;

public class EjercicioClase1 {
    public static void main(String[] args) {

        //Dacos de dos numeros y dime cuantos multiplos de 5 hay entre estas numeros

        int numero1 = 120;
        int numero2 = 327;
        int contador = 0;
        int temporal;

        if (numero1 > numero2){
            temporal = numero1;
            numero1 = numero2;
            numero2 = temporal;
        }


        for (int i = numero1; i <= numero2 ; i++) {
            if (i % 5 ==0 ){
                System.out.println(i);
                contador++;
            }
        }
        System.out.println("Ha entrado: " + contador);

    }
}
