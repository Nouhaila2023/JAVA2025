package Tema4.OpenWebinars.IntroduccionPOO;

public class TestCoche {

    public static void main(String[] args) {

        Coche coche1 = new Coche("Seat", "Lion" , 2003 , 0, 0 );
        coche1.arrancar();

        var coche2 = new Coche("Fod", "Ibiza" , 2003 , 0 , 0);
        coche2.arrancar();

        System.out.println("----------------------------");
        Coche coche3 = new Coche("A" , "A" , 2067 , 0 ,23);
        coche3.arrancar();

        System.out.println("----------------------------");
        Coche coche4 = new Coche("Seat" , "Ibiza");
        coche4.arrancar();
        coche4.repostar(20);
        coche4.arrancar();
        coche4.viajar(100);



    }
}
