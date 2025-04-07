package Tema7.practica1.expedientesAlumnos;

import java.util.HashSet;
import java.util.Objects;

public class Expediente {
    /**
     * Atributos
     */
    private Estudiante estudiante;
    private HashSet<NotasCurso> notas;
    private boolean activo;

    /**
     * Constructor
     */
    public Expediente(Estudiante estudiante, boolean activo) {
        this.estudiante = estudiante;
        this.notas = new HashSet<>();
        this.activo = activo;
    }

    /**
     * addNotas: para añadir todoas las notas de un curso al
     * expediente de un alumno
     */

    public void addNotas(NotasCurso notas) {
        if (estudiante != null) {
            this.notas.add(notas);
        }
    }

    /**
     * mostrar notas: que mostrar todas las notas de este estudiente de un alumno
     */

    public void mostrarNotas(int curso, String etapa) {

        for (NotasCurso nota : notas) {
            if(nota.getEtapaEducativa().equals(etapa) && nota.getCurso() == curso ){
                System.out.println(nota);
            }
        }
    }

    /**
     * Getter Setter
     */
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Expediente setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
        return this;
    }

    public HashSet<NotasCurso> getNotas() {
        return notas;
    }

    public boolean isActivo() {
        return activo;
    }

    public Expediente setActivo(boolean activo) {
        this.activo = activo;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Expediente{");
        sb.append("estudiante=").append(estudiante);
        sb.append(", notas=").append(notas);
        sb.append(", activo=").append(activo);
        sb.append('}');
        return sb.toString();
    }

    /**
     * equals estudiante
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Expediente that = (Expediente) o;
        return Objects.equals(estudiante, that.estudiante);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(estudiante);
    }
}
