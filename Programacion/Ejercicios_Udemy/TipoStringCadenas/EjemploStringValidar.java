package Ejercicios_Udemy.TipoStringCadenas;

public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso1 = null;
        String curso2 = "";

        System.out.println("curso2 es vasio: \n" + curso2);

        boolean esNulo = curso1 == null;

        System.out.println("esNulo: " + esNulo);

        if(esNulo){
            curso1 = "Programacion Java";
            curso2 = "";
        }



        System.out.println(curso1.toUpperCase());

        System.out.println("Bienvenido al curso ".concat(curso1));

        boolean esVacio = curso1.length() == 0;
        System.out.println("esVacio: " + esVacio);
        if (curso1.length() > 0){

            System.out.println(curso1.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso1));

        }

        //Otra forma com isEmpty

        boolean esVacio2 = curso1.isEmpty();
        System.out.println("esVacio2: " + esVacio2);

        if(curso1.isEmpty()){
            System.out.println(curso1.toUpperCase());
            System.out.println("Bienvenido al curso " .concat(curso1));
        }




    }
}
