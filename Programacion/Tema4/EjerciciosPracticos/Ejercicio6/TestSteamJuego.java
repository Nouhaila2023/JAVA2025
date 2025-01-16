package Tema4.EjerciciosPracticos.Ejercicio6;

public class TestSteamJuego {

    public static void main(String[] args) {


        SteamJuego j1 = new SteamJuego("jugador1", "A", 12, 2, 10);
        SteamJuego j2 = new SteamJuego("jugador2", "A", 12, 2, 10);
        SteamJuego j3 = new SteamJuego("jugador3", "A", 12, 2, 10);

        j1.jugadoresDia(2);
        j2.jugadoresDia(3);
        j3.jugadoresDia(4);

        System.out.println(j1.getMediaJugadoresDiarios());
        System.out.println(j2.getMediaJugadoresDiarios());
        System.out.println(j3.getMediaJugadoresDiarios());




    }
}
