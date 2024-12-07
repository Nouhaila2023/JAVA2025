package Ejercicios_Udemy.Variables;

public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean derologico1 = false;
        boolean derologico2 = Boolean.TRUE;

        System.out.println(derologico1);
        System.out.println(derologico2);

        double d = 35678.34e-3;
        System.out.println("d: " + d);

        float f = 1.22345e2f;
        System.out.println("f: " + f);

        derologico1 = d < f;
        System.out.println("derologica1_1 " + derologico1);

        boolean esIgual = (3 - 2 == 1);
        System.out.println("esIgual: " + esIgual);


    }

}
