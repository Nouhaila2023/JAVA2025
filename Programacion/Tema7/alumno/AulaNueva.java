package Tema7.alumno;

import java.util.HashSet;

public class AulaNueva extends Aula{

    /**
     * Atribiutos
     */

    private HashSet<Alumno> alumnos;

    /**
     * Constructor
     *
     * @param nombre
     * @param ubicacion
     * @param ambas
     */
    public AulaNueva(String nombre, String ubicacion, String ambas) {
        super(nombre, ubicacion, ambas);
        this.alumnos = new HashSet<>();
    }


}
