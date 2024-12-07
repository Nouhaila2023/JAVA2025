package Tema3.Prueva;

public class Ejericico_curso {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        boolean dia[] = new boolean[85];

        int contador = 0;


        for (int i = 0; i < dia.length; i++) {

            if (numero_aleatorio(0,1) == 0){
                dia[i] = true;
                contador++;
            }else {
                dia[i] = false;
            }

       }

        System.out.println("Has faltado " + contador + " días");

        int limet = (20*85)/100;

        if (contador > limet){
            System.out.println("Perdido");
        }else {
            System.out.println("No ha perdido");
        }



    }
}
