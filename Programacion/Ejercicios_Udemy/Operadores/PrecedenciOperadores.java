package Ejercicios_Udemy.Operadores;

public class PrecedenciOperadores {
    public static void main(String[] args) {

        int i = 14 , j = 6 , k = 20;

        double promedio = (i + j + k) / 3d;
        System.out.println("Promedio = " + promedio);

        promedio = i + j + k / 3d * 10;
        System.out.println("Promedio = " + promedio); //Premero de devide despues se multiplicasion y al final la suma

        promedio = --i + j++ + k / 3d * 10;
        System.out.println("Promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);

    }
}
