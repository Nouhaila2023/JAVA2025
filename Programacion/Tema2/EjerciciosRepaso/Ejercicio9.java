package Tema2.EjerciciosRepaso;

/*Realiza un programa que pinte los 50 primeros términos de esta serie: (5n + 2) / n */

public class Ejercicio9 {
    public static void main(String[] args) {

        //con for

        System.out.println( "\n" + "++++++++++++++++++ con for +++++++++++++++++" + "\n");
        double n = 1;


        for (double i = 1; i <= 50; i++) {
            System.out.println(((5 * i) + 2) / i);
        }


            //con switch
        System.out.println( "\n" + "++++++++++++++++ con switch ++++++++++++++++" + "\n");

        for (double j = 1; j <= 50; j++) {

            double resultado = (((5 * j) + 2) / j);
                switch ((int) ((double) j / 10)) {
                    case 0:
                        System.out.println(resultado);
                        break;
                    case 1:
                        System.out.println(resultado);
                        break;
                    case 2:
                        System.out.println(resultado);
                        break;
                    case 3:
                        System.out.println(resultado);
                        break;
                    case 4:
                        System.out.println(resultado);
                        break;
                    default:
                        System.out.println("Término ");
                }

        }


    }
}
