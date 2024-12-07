package Tema2.Prueva;

public class EjemploEndicador {
    public static void main(String[] args) {

        //Si tiremos un dado 20 veses y queremos saber si ha salido algun 6

        boolean haSalido6 = false; //No ha pasado
        int tirada;

        for (int i = 0; i < 20; i++) {

            tirada = (int) (Math.random() * 6) + 1;
            if (tirada == 6){
                haSalido6 = true;
            }
            System.out.println(tirada);
        }

        System.out.println("Ha salido el 6: " + haSalido6);




    }
}
