package Tema4.OpenWebinars.IntroduccionPOO;

public class App {

    public static void main(String[] args) {

        Coche coche1 = new Coche("Seat", "Lion" , 2003 , 0, 0 );
        coche1.arrancar();

        var coche2 = new Coche("Fod", "Ibiza" , 2003 , 0 , 0);
        coche2.arrancar();

        Coche coche3 = new Coche("A" , "A" , 2067 , 0 ,23);
        coche3.arrancar();
    }
}
