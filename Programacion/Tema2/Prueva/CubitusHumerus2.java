package Tema2.Prueva;

public class CubitusHumerus2 {

    public static int numero_aleatorio(int min , int max){

        return (int)(Math.random()*(max-min+1) +min);

    }

    public static void main(String[] args) {

        //Nuestros dos romanos favoritos juegan a los dados
        //Cada uno tira dos dados
        //Gana aquel de los dos cuya suma de sus dados sea mayor, o
        //aquel cuyos dos dados sean iguales
        //Juega 20 rondas y dime quién gana


       int tiradaH1, tiradaH2 , tiradaC1 ,tiradaC2;
       int sumaC , sumaH;
       int contadorH = 0 , contadorC = 0;


        for (int i = 1; i <= 20 ; i++) {

            tiradaC1 = numero_aleatorio(1,20);
            tiradaC2 = numero_aleatorio(1,20);
            tiradaH1 = numero_aleatorio(1,20);
            tiradaH2 = numero_aleatorio(1,20);

            sumaH = tiradaH1 + tiradaH2;
            sumaC = tiradaC1 + tiradaC2;

            if (tiradaC1 == tiradaC2 && tiradaH1 == tiradaH2){
                System.out.println("Empate");
            } else if (tiradaC1 == tiradaC2) {
                System.out.println("Gana Cubitos");
                contadorC++;
            }else if (tiradaH1 == tiradaH2)  {
                System.out.println("Gana Humerus");
                contadorH++;
            }

            if (sumaC > sumaH){
                System.out.println(i + ". Ha ganado el Cubitu --> " + sumaC + " > " + sumaH);
                contadorC++;
            } else if (sumaC == sumaH) {
                System.out.println(i + ". Empate --> " + sumaC + " = " + sumaH);
            }else {
                System.out.println(i + ". Ha ganado el Humerus --> " + sumaH + " > " + sumaC);
                contadorH++;
            }

            System.out.println("------------------------------------------");

        }


        if (contadorC > contadorH){
            System.out.println("* En 20 tirada ha ganado Cubitus --> " + contadorC + " > " + contadorH + " *");
        } else if (contadorC == contadorH) {
            System.out.println("* Empate --> " + contadorC + " = " + contadorH + " *");
        }else {
            System.out.println("* En 20 tirada ha ganado Humerus --> " + contadorH + " > " + contadorC + " *");
        }


    }
}
