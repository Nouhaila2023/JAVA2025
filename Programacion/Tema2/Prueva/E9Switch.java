package Tema2.Prueva;

public class E9Switch {

    /*Realiza un programa que pinte los 50 primeros términos de esta serie: (5n + 2) / n */

        public static void main(String[] args) {

            double n = 1;

            for (double i = 1; i <= 50; i++) {

                // Cálculo de la serie
                double resultado = ((5 * i) + 2) / i;

                // División de casos con switch
                switch ((int) i / 10) {  // Dividimos el índice i en grupos de 10
                    case 0:  // Para i de 1 a 9
                        System.out.println("Término " + (int) i + ": " + resultado + " (grupo 1-9)");
                        break;
                    case 1:  // Para i de 10 a 19
                        System.out.println("Término " + (int) i + ": " + resultado + " (grupo 10-19)");
                        break;
                    case 2:  // Para i de 20 a 29
                        System.out.println("Término " + (int) i + ": " + resultado + " (grupo 20-29)");
                        break;
                    case 3:  // Para i de 30 a 39
                        System.out.println("Término " + (int) i + ": " + resultado + " (grupo 30-39)");
                        break;
                    case 4:  // Para i de 40 a 50
                        System.out.println("Término " + (int) i + ": " + resultado + " (grupo 40-50)");
                        break;
                    default:
                        System.out.println("Término " + (int) i + ": " + resultado);
                }
            }
        }




}
