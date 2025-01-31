package Tema4.Practica.AcademiaDeMagia;

public class Prueba {

    //Propiedades
    private String descripcion;
    private int nivelDificultad;
    private int recompensa;

    //Constructor
    public Prueba(String descripcion, int nivelDificultad, int recompensa) {
        this.descripcion = descripcion;
        this.nivelDificultad = nivelDificultad;
        this.recompensa = recompensa;
    }

    //Getter and Setter
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Prueba{");
        sb.append("descripcion='").append(descripcion).append('\'');
        sb.append(", nivelDificultad=").append(nivelDificultad);
        sb.append(", recompensa=").append(recompensa);
        sb.append('}');
        return sb.toString();
    }

    /**
     * resolver(Hechizo hechizo): Comprueba si el hechizo puede superar la prueba basándose en su potencia.
     */

    public boolean resolver(Hechizo hechizo){
        //Miramos si la potencia del hechizo puede pasar el nivel del dificultado
        if (hechizo.getPotencia() > getNivelDificultad()){
            return true;
        }
        return false;
    }

}
