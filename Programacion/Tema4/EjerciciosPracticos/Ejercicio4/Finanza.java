package Tema4.EjerciciosPracticos.Ejercicio4;

public class Finanza {

    /**
     * Realiza una clase Finanzas que convierta dólares a euros y viceversa. Como propiedad se almacena únicamente el
     * cambio dólar-euro, no se almacena una cantidad sino el tipo de cambio. Codifica los métodos
     * dolaresToEuros(double dolares) y eurosToDolares(double euros). Prueba que dicha clase funciona
     * correctamente haciendo conversiones entre euros y dólares. La clase debe tener:
     * - Un constructor Finanzas() por defecto el cual establecerá el cambio dólar-euro en 1.36.
     * - Un constructor Finanzas(double), el cual permitirá configurar el cambio dólar-euro.
     * - Getters y setters
     * Prueba la clase en otra clase TestFinanzas.
     */


    private double cambioDolarEuro;


    public Finanza() {
        cambioDolarEuro = 1.36;
    }

    public double getCambioDolarEuro() {
        return cambioDolarEuro;
    }

    public void setCambioDolarEuro(double cambioDolarEuro) {
        this.cambioDolarEuro = cambioDolarEuro;
    }

    public double dolaresToEuros(double dolares){
        return dolares * cambioDolarEuro;
    }

    public double eurosToDolares(double eures){
        return eures / cambioDolarEuro;
    }



}
