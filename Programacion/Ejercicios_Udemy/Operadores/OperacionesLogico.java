package Ejercicios_Udemy.Operadores;

public class OperacionesLogico {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1412e3;
        boolean m = false;

        //&& = and (wa)
        boolean b1 = i == j && k > l && m == true;
        System.out.println("b1: " + b1);

        //|| = or (aw)
        boolean b2 = i == j || k > l;
        System.out.println("b2: " + b2);

        boolean b3 = i == j && (k > l || m == false);
        System.out.println("b3: " + b3);

        boolean b4 = i == j && k > l || m == false;
        System.out.println("b4: " + b4);

        boolean b5 = i == j || k < l && m == true;
        System.out.println("b5: " + b5);

        boolean b6 = true || true && false;
        System.out.println("b6: " + b6);

    }
}
