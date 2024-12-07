package Ejercicios_Udemy.Operadores;

import javax.swing.*;

public class EjemploOperadoresAritmatico {
    public static void main(String[] args) {

        //Si hay de el mismo tipo pudemas escribirlo en solo liña
        int i = 5 , j = 4 , suma = i + j;
        System.out.println("suma: " + suma);
        //para cantenear
        System.out.println("i + j: " + i + j);
        //para sumar
        System.out.println("i + j = " + (i+j));


        int multi = i * j;
        System.out.println("multiplicación = " + multi);

        int div1 = i / j;
        System.out.println("div: " + div1);
        float div2 = (float) i /(float) j;
        System.out.println("div2: " + div2);
        double div3 = (double) i /(double) j;
        System.out.println("div3: " + div3);

        //يُستخدم لإيجاد الباقي بعد قسمة عددين
        int resto = i % j;
        System.out.println("resto: " + resto);

        //Pa mostrar el cuadro donde escribimos el numero como el Scanner
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        if (numero % 2 == 0){
            System.out.println("numero par = " + numero);
        }else {
            System.out.println("numero impar = " + numero);
        }




    }
}
