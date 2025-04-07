package Tema7.practica1.expedientesAlumnos;

import java.util.*;

public class NotasCurso {
    /**
     * Atrinbutos
     */
    private EtapaEducativa etapaEducativa;
    private String nombreCiclo;
    private Integer curso;
    private HashMap<String,Double> notas;
    private Integer anio;

    /**
     * Constructod
     * @param etapaEducativa
     * @param nombreCiclo
     * @param curso
     * @param anio
     */
    public NotasCurso(EtapaEducativa etapaEducativa, String nombreCiclo, Integer curso,  Integer anio) {
        this.etapaEducativa = etapaEducativa;
        this.nombreCiclo = nombreCiclo;
        setCurso(curso);
        this.notas = new HashMap<>();
        this.anio = anio;
    }

    /**
     * Metodos sobre notas:
     */

    /**
     * addNotas
     */
    public void addNotas(String asignatura, Double nota){
        if (nota <= 10 && nota >= 0){
            notas.put(asignatura, nota);
        }else {
            System.out.println("La nota debe estar entre 10 y 0");
        }
    }

    /**
     * deleteNotas
     */
    public void deleteNotas(String asignatura){
        if (notas.containsKey(asignatura)){
            notas.remove(asignatura);
        }
        System.out.println("No existe la segnatora");
    }

    /**
     * buscar
     */
    public void buscar(String asignatura){
        if (notas.containsKey(asignatura)){
            notas.get(asignatura);
        }
        System.out.println("no se encontro la segnatora");
    }

    /**
     * pintar las notas ordenadas por asignatura
     */
    public void pintar(){
        if (notas.isEmpty()){
            System.out.println("No hay notas registadas");
        }

        TreeMap<String,Double> notasOrdenadas = new TreeMap<>();
        for (Map.Entry<String,Double> entry : notasOrdenadas.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }


    /**
     * Getter Setter
     */
    public EtapaEducativa getEtapaEducativa() {
        return etapaEducativa;
    }

    public NotasCurso setEtapaEducativa(EtapaEducativa etapaEducativa) {
        this.etapaEducativa = etapaEducativa;
        return this;
    }

    public String getNombreCiclo() {
        return nombreCiclo;
    }

    public NotasCurso setNombreCiclo(String nombreCiclo) {
        this.nombreCiclo = nombreCiclo;
        return this;
    }

    public Integer getCurso() {
        return curso;
    }

    public NotasCurso setCurso(Integer curso) {
        if (curso >= 1 && curso <= 4) {
            this.curso = curso;
        } else {
            throw new IllegalArgumentException("El curso debe estar entre 1 y 4.");
        }
        return this;
    }

    public HashMap<String, Double> getNotas() {
        return notas;
    }

    public NotasCurso setNotas(HashMap<String, Double> notas) {
        this.notas = notas;
        return this;
    }

    public Integer getAnio() {
        return anio;
    }

    public NotasCurso setAnio(Integer anio) {
        this.anio = anio;
        return this;
    }

    /**
     * equals con estapa, nombre, curso, año
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NotasCurso that = (NotasCurso) o;
        return etapaEducativa == that.etapaEducativa && Objects.equals(nombreCiclo, that.nombreCiclo) && Objects.equals(curso, that.curso) && Objects.equals(anio, that.anio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(etapaEducativa, nombreCiclo, curso, anio);
    }
}
