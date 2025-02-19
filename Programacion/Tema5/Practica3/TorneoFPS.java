package Tema5.Practica3;

public class TorneoFPS extends Torneo {


    public TorneoFPS(String nombre) {
        super(nombre);
    }

    @Override
    public void imprimirEquipos(Equipo equipo) {
        if (equipo instanceof EquipoFPS){
            equipos.add(equipo);
            System.out.println("Equipo " + equipo.getNombre() + " es de MOBA ");
        }else {
            System.out.println("Equipo " + equipo.getNombre() + " no es de MOBA ");

        }
    }
}




