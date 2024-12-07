package Tema1.Ejercicio1.EstructurasAlternativas;

/*Ejercicio 7
    La política de cobro de una compañía telefónica es: cuando se realiza una llamada, el cobro
    es por el tiempo que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro,
    los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos, y a partir del
    décimo minuto, 50 céntimos.
    Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de
    mañana, 15 %, y en turno de tarde, 10 %. Realice un algoritmo para determinar cuánto debe
    pagar por cada concepto una persona que realiza una llamada*/

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Ejercico7 {
    public static void main(String[] args) {

        double tiempo;
        double pago = 0;
        boolean turnaMañana ;
        boolean turnoTarde;

        Scanner sc = new Scanner(System.in);
        LocalDate fechaActual = LocalDate.now();
        DayOfWeek diaSemana = fechaActual.getDayOfWeek();

        System.out.println("Ingrese el valor de la llamada: ");
        tiempo = sc.nextDouble();

        System.out.println("Turno de Mañana");
        turnaMañana = sc.nextBoolean();


        //El número del día de la semana (1=Lunes, 7=Domingo)
        int numeroDia = diaSemana.getValue();
        numeroDia = sc.nextInt();

        if (turnaMañana == true){
            if (numeroDia == 7){
                if (tiempo <= 5){
                    pago = tiempo * 1 * 0.03 * 0.15;
                    System.out.println(pago);
                } else if (tiempo <= 3) {
                    pago = tiempo * 0.80 * 0.03 * 0.15;
                    System.out.println(pago);
                }else if (tiempo <= 2) {
                    pago = tiempo * 0.70 * 0.03 * 0.15;
                    System.out.println(pago);
                }else if (tiempo <= 1) {
                    pago = tiempo * 0.50 * 0.03 * 0.15;
                    System.out.println(pago);
                }
            }
            if (numeroDia <=6){
                if (tiempo <= 5){
                    pago = tiempo * 1 * 0.03 * 0.10;
                    System.out.println(pago);
                } else if (tiempo >=5 && tiempo <7) {
                    pago = tiempo * 0.80 * 0.03 * 0.10;
                    System.out.println(pago);
                }else if (tiempo >= 7 && tiempo <9) {
                    pago = tiempo * 0.70 * 0.03 * 0.10;
                    System.out.println(pago);
                }else if (tiempo >= 10) {
                    pago = tiempo * 0.50 * 0.03 * 0.10;
                    System.out.println(pago);
                }
            }

        }

        System.out.println("Turno de Tarde");
        turnoTarde = sc.nextBoolean();

        if (turnoTarde == true){
            if (numeroDia == 7){
                if (tiempo <= 5){
                    pago = tiempo * 1 * 0.10;
                    System.out.println(pago);
                } else if (tiempo >=5 && tiempo <7) {
                    pago = tiempo * 0.80 * 0.10;
                    System.out.println(pago);
                }else if (tiempo >= 7 && tiempo <9) {
                    pago = tiempo * 0.70 * 0.10;
                    System.out.println(pago);
                }else if (tiempo >= 10) {
                    pago = tiempo * 0.50 * 0.10;
                    System.out.println(pago);
                }
            }
            if (numeroDia <=6){
                if (tiempo <= 5){
                    pago = tiempo * 1 * 0.10;
                    System.out.println(pago);
                } else if (tiempo >=5 && tiempo <7) {
                    pago = tiempo * 0.80 * 0.10;
                    System.out.println(pago);
                }else if (tiempo >= 7 && tiempo <9) {
                    pago = tiempo * 0.70 * 0.10;
                    System.out.println(pago);
                }else if (tiempo >= 10) {
                    pago = tiempo * 0.50 * 0.10;
                    System.out.println(pago);
                }
            }

        }



        sc.close();

    }
}
