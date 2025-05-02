package Tema7_1.corsoGenericosColecciones.ordenacion;

import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        int[] a = new int[10];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }
}
