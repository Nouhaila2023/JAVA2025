package Tema1.Ejercicio1.EstructurasSecuenciales;

/*Ejercicio 12
Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados por una distancia
d. El que está detrás viaja a una velocidad mayor. Se pide hacer un algoritmo para ingresar
la distancia entre los dos vehículos (km) y sus respectivas velocidades (km/h) y con esto
determinar y mostrar en que tiempo (minutos) alcanzará el vehículo más rápido al otro. */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        double v1 ,v2 ,d;
        double velocidade;
        int tiempo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor del vector1: ");
        v1 = sc.nextDouble();
        System.out.println("Ingrese el valor del vector2: ");
        v2 = sc.nextDouble();
        System.out.println("Ingrese el distancidad: ");
        d = sc.nextDouble();

        velocidade = d/(v2-v1);

        tiempo = (int) (d/velocidade);
        System.out.println("El tiempo con min: " + tiempo*60 + "min");













    }
}
