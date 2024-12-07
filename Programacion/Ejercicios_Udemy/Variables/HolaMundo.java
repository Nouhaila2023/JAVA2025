package Ejercicios_Udemy.Variables;

public class HolaMundo {
    public static void main(String[] args) {

        String saludar = "Hola Mundo desde java";

        System.out.println(saludar);

        //Para poner el fraze en mayuscola
        System.out.println("saludar.to UpperCase() = " + saludar.toUpperCase());

        int num1 = 10;

        boolean valor= true;
        int num2 = 5;

        if (valor) {
            System.out.println("numero = " + num1);
            num2 = 10;
        }

        System.out.println("numero 2 = " + num2);

        //Var puede estar int double ....
        var num3 = "15";

/////////////////////////////////////////////////////////////
        String nombre = "Ale" ;

        if ( num1 > 9){
            nombre = "Nouhaila";
        }
        System.out.println("Mi nombre es: " + nombre );



    }
}
