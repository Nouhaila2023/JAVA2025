package Tema1.Ejercicios;

public class Ejercicio18 {
    public static void main(String[] args) {

        int a = 10 , b = 3 , c = 1 ,d ,e;
        float x ,y;
        d = a + b++;

        // no puedo comparar un boolean con un entero
        // ni asignarle el resulta de una opcion logica a un entero
        // c = a<b && c;

        e = ++a-b;
        y = (float)a / b;
        System.out.println("x= " + (x=a/b));
        System.out.println("d= " + d);
        System.out.println("e= " + e);
        System.out.println("y= " + y);



    }
}
