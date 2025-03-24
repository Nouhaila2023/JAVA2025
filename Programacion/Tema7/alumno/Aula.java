package Tema7.alumno;

import java.util.ArrayList;

public class Aula {

    /**
     * Atributos
     */
    private ArrayList<Alumno> alumnos;
    private String nombre;
    private String ubicacion;



    /**
     * Constructor
     */
    public Aula(String nombre, String ubicacio) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.alumnos = new ArrayList<>();
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

    public void listarTodo(){
        for (Alumno alumno :alumnos){
            System.out.println(alumno);
        }
    }

    /**
     * Getter Setter
     */

    public ArrayList<Alumno> getAlumnos() {
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
