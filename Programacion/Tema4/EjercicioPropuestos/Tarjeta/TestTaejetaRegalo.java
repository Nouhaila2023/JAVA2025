package Tema4.EjercicioPropuestos.Tarjeta;

import java.util.Scanner;

public class TestTaejetaRegalo {
    public static void main(String[] args) {

        TarjetaRegalo T1 = new TarjetaRegalo(10);
        TarjetaRegalo T2 = new TarjetaRegalo(11);

        System.out.println(T1);
        System.out.println(T2);
        System.out.println("-------------------------");
        T1.fusionarTarjeta(T2);
        System.out.println(T1);
        System.out.println(T2);





    }
}
