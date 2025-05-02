package Tema7_1.alumno;

import java.util.HashSet;

public class AulaNueva{

    /**
     * Atribiutos
     */

    private HashSet<Alumno> alumnos;
    private String nombre;
    private String ubicacion;

    /**
     * Constructor

     */
    public AulaNueva(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.alumnos = new HashSet<>();
    }

    /**
     * addAlumno
     */

    public void addAlumno(Alumno alumno){
        if (!alumnos.contains(alumno)){
            alumnos.add(alumno);

        }
        System.out.println("Esta alumno esta en la lista:)");
    }


    /**
     * removeAlumno
     */
    public void removeAlumno(Alumno alumno){
        alumnos.remove(alumno);
    }


    /**
     * listarTodo
     */

    public void listarTodos() {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    /**
     * Getter Setter
     */

    public HashSet<Alumno> getAlumnos() {
        return alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Aula{");
        sb.append("alumnos=").append(alumnos);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", ubicacion='").append(ubicacion).append('\'');
        sb.append('}');
        return sb.toString();
    }



}
