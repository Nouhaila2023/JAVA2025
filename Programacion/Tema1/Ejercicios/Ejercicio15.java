package Tema1.Ejercicios;

public class Ejercicio15 {
    public static void main(String[] args) {

        //. Escriba un programa que escriba en la pantalla cuánto le dará su banco después de seis meses si pone
        //2000€ en una cuenta a plazo fijo al 2, 75% anual. Recuerde que al pagarle los intereses el banco le
        //retendrá el 18% para hacienda.

        int precio = 2000;
        double plazo_fijo = 2.75;
        double hacienda = 18;
        double interes , retencion , monto_final;

       //Calcular el interes para 6 meses
        plazo_fijo /= 2;

        //Calcular el interes sobre el monto

        interes = precio *(plazo_fijo/100);


        //Calcular el interes despues de la retencia final

        retencion = interes * (hacienda/100);


        //calcular el monto final

        monto_final = interes - retencion;

        System.out.println("El monto fijo es: " + monto_final + "€");

    }
}
