package Tema1.Ejercicios;

public class Ejercicio16 {
    public static void main(String[] args) {

        //Escriba un programa para calcular el área y el
        // volumen de
        // un cilindro. Para ello declare una constante
        //que guarde el valor de Pi. Declare, también,
        // variables para el diámetro y la altura del cilindro.
        // Suponga
        //para el ejemplo que el cilindro tiene un
        // diámetro de 15,5cm y una altura de 42,4cm

        final double PI = 3.14;
        double diametro = 15.5 , altura = 42.4;
        double area = 2 * PI * diametro * altura;
        double volumen = PI * Math.pow(diametro, 2) * altura;
        System.out.println("Volumen del cilindro:: " + volumen);
        System.out.println("Área lateral del cilindro:: " + area);

    }
}
