package Tema5.Practica3;

import java.util.ArrayList;

public abstract class Torneo {

    //atributos
    protected String nombre;
    protected ArrayList<Equipo> equipos;//lista de quipos inscritos

    //Constructor
    public Torneo(String nombre) {
        this.nombre = nombre;
        equipos = new ArrayList<>();
    }

    //Getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Añader un equipo al torneo
    public void inscribirEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    /**
     * Método public Equipo jugarTorneo() que simule el torneo y
     * devuelva el equipo ganador (el que tenga más puntos al calcular
     * calcularPuntos()).
     */

    public Equipo jugarTorneo() {
        //verificamos si no hay equipos
        //si es vasio
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos");
            return null;
        }

        //Ponemos que el premer equipo es el ganador
        Equipo ganador= equipos.get(0);
        //Guardamos el pontos en maxPontos y calcular
        int maxPuntos = ganador.calcularPuntos();

        for (Equipo equipo : equipos) {
            //calcular los puntos de cada equipo
            int puntos = equipo.calcularPuntos();
            System.out.println("Los puntos de la equipo" + equipo.getNombre() +  "es: " + puntos);
            if (puntos > maxPuntos) {
                maxPuntos = puntos;
            }
        }
        System.out.println("El ganador es " + ganador.getNombre() + "// puntos: " + maxPuntos);

        return ganador;
    }


    /**
     *Método public void imprimirEquipos() que lista los equipos
     * inscritos y sus puntos calculados.
     *
     */

    public void  imprimirEquipos(){
        System.out.println("Los equipos de la torneo: " + equipos.size());
        for (Equipo equipo : equipos) {
            int calcular = equipo.calcularPuntos();
            System.out.println("El ganador es " + equipo.getNombre() + "// puntos: " + calcular);

        }
    }


    public abstract void imprimirEquipos(Equipo equipo);
}
