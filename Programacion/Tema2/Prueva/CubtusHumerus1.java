package Tema2.Prueva;

public class CubtusHumerus1 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }


    public static void main(String[] args) {

        //Dos romanos asediando una ciudad
        //Cada uno tira un dado de 20 caras
        //Gana que saca el dado mayosy o el si algun saca el dado 9
        //juega una partida y dime quien ha ganado



        int TCubitus;
        int THumerus;

        TCubitus = numero_aleatorio(1,20);
        THumerus = numero_aleatorio(1,20);

        System.out.println("La tirada del Cubitus: " + TCubitus);
        System.out.println("La tirada del Humerus: " + THumerus);

        if ((TCubitus == 9) || (TCubitus > THumerus) ) {
            System.out.println("Gana el Cubitus ");
        } else if (TCubitus == THumerus) {
            System.out.println("Empate");
        } else {
            System.out.println("Gana el Humerus ");
        }


        //juegan 10 partidas

        int contadorH = 0;
        int contadorG = 0;

        for (int i = 1; i <= 10 ; i++) {

            TCubitus = numero_aleatorio(1,20);
            THumerus = numero_aleatorio(1,20);

            System.out.println("La tirada del Cubitus: " + TCubitus);
            System.out.println("La tirada del Humerus: " + THumerus);

            if ((TCubitus == 9) || (TCubitus > THumerus) ) {
                System.out.println("Gana el Cubitus ");
                contadorG++;
            } else if (TCubitus == THumerus) {
                System.out.println("Empate");
            } else {
                System.out.println("Gana el Humerus ");
                contadorH++;
            }


        }

        System.out.println("-------------------------------------------------------------");

        if (contadorH > contadorG){
            System.out.println("El mas ganado el Humerus ");
        }else {
            System.out.println("El mas ganado el Cubitus");
        }




    }

}
