package Tema4.EjerciciosPracticos.Ejercicio1;


/**
 * 1. Realiza una clase Temperatura, la cual convierta grados Celsius a Farenheit y viceversa. Para ello, crea dos
 * métodos double celsiusToFarenheit(double celsius) y double farenheitToCelsius(double
 * farenheit). La clase Temperatura no tendrá ninguna propiedad, solo esos dos métodos.
 * En la construcción ten en cuenta las siguientes fórmulas:
 * - Farenheit a Celsius C = (F – 32)/1,8
 * - Celsius a Farenheit F = (1,8)C + 32
 */

public class Temperatura {

    public double celsiusFarenheit(double celsius){
        return (celsius*1.8)+32;
    }

    public double farenheitCelsius(double farenheit){
        return (farenheit-32)/1.8;
    }


}
