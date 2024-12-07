package Tema3.Prueva;

public class Ejercicio4 {

    public static void main(String[] args) {

        /*crea un array de los dias de simana, y muestra aquellos cuya
        longitud tengas mas de 5 caracteres*/

        String dias[] = {"Lunes" , "Martes" , "Miércoles" , "Jueves" , "Vierenes" + "Sabado" , "Domengo"};

        for (int i = 0; i < dias.length; i++) {
            if (dias[5].length() > 5){
                System.out.println(dias[5]);
            }
        }


    }
}
