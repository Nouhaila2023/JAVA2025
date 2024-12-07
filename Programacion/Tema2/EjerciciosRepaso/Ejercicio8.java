package Tema2.EjerciciosRepaso;

/*. Realiza un programa que pinte los 20 primeros términos de esta serie: 1, -2, 3, -4, 5, -6, …*/

public class Ejercicio8 {

    public static void main(String[] args) {

        for (int i = 1; i <= 20 ; i++) {

            if (i % 2 == 0){
                System.out.println(i*(-1));
            }else{
                System.out.println(i);
            }

        }

    }

}
