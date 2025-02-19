package Tema5.Practica3;

public class Test {
    public static void main(String[] args) {

        EquipoMOBA moba1 = new EquipoMOBA("moba1", 1, 12);
        EquipoMOBA moba2 = new EquipoMOBA("moba2", 1, 22);
        EquipoMOBA moba3 = new EquipoMOBA("moba3", 2, 10);

        EquipoFPS fps1 = new EquipoFPS("fps1", 1, 31);
        EquipoFPS fps2 = new EquipoFPS("fps2", 1, 16);
        EquipoFPS fps3 = new EquipoFPS("fps3", 2, 9);

        TorneoMOBA torneoMOBA = new TorneoMOBA("Campeonato MOBA");
        TorneoFPS torneoFPS = new TorneoFPS("Campeonato FPS");

        torneoMOBA.imprimirEquipos(moba1);
        torneoMOBA.imprimirEquipos(moba2);
        torneoMOBA.imprimirEquipos(moba3);

        torneoFPS.imprimirEquipos(fps1);
        torneoFPS.imprimirEquipos(fps2);
        torneoFPS.imprimirEquipos(fps3);

        System.out.println("Equipos del torneo MOBA");
        torneoMOBA.imprimirEquipos();

        System.out.println("Equipos del torneo FPS");
        torneoFPS.imprimirEquipos();

        System.out.println("Ganador del torneo MOBA");
        System.out.println(torneoMOBA.jugarTorneo());

        System.out.println("Ganador del torneo FPS");
        System.out.println(torneoFPS.jugarTorneo());


    }
}
