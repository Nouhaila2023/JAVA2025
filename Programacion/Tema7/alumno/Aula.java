package Tema7.alumno;

import java.util.ArrayList;

public class Aula {

    /**
     * Atributos
     */
    protected ArrayList<Alumno> alumnos;
    protected String nombre;
    protected String ubicacion;
    protected String ambas;


    /**
     * Constructor
     * @param nombre
     * @param ubicacion
     * @param ambas
     */
    public Aula(String nombre, String ubicacion, String ambas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.ambas = ambas;
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

    public String getAmbas() {
        return ambas;
    }

    public void setAmbas(String ambas) {
        this.ambas = ambas;
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
        sb.append(", ambas='").append(ambas).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
