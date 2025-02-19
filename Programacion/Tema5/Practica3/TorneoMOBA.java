package Tema5.Practica3;

public class TorneoMOBA extends Torneo{

    //constructor
    public TorneoMOBA(String nombre) {
        super(nombre);
    }

    @Override
    public void imprimirEquipos(Equipo equipo) {
        if (equipo instanceof EquipoMOBA){
            equipos.add(equipo);
            System.out.println("Equipo " + equipo.getNombre() + " es de MOBA ");
        }else {
            System.out.println("Equipo " + equipo.getNombre() + " no es de MOBA");
        }
        super.imprimirEquipos();
    }
}
