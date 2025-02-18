package Tema4.Practica1.BladeOfDarkess;

public class TestJuego {

    /**
     * Crea una aplicación TestJuego, crea un Jugador, equípalo con las armas que desees. Luego crea cuatro monstruos
     * diferentes con niveles y puntos de daño diferentes, y prueba a que combatan contra el jugador. Prueba que
     * algunos monstruos sean fáciles para ver como el jugador sube su experiencia y nivel.
     */

    public static void main(String[] args) {

        Jugador j1 = new Jugador("JugadorA", Jugador.Tipo.Brujo);
        Arma a1 = new Arma("ArmaA",120, true, Arma.tipo.Espada);
        j1.equipar(a1);


        Monstruo m1 = new Monstruo(Monstruo.Tipo.Fantasma, 50 ,"Monstruo1" );
        Monstruo m2 = new Monstruo(Monstruo.Tipo.Demonio, 32, "Monstruo2" );
        Monstruo m3 = new Monstruo(Monstruo.Tipo.Goblin, 92, "Monstruo3" );
        Monstruo m4 = new Monstruo(Monstruo.Tipo.Skall, 12, "Monstruo4");

        j1.golpear(m1);
        j1.golpear(m2);
        j1.golpear(m3);
        j1.golpear(m4);

        System.out.println(j1);
        System.out.println(a1);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);






    }
}
