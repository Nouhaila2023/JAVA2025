package Tema4.Practica1.AcademiaDeMagia;

public class Pruba {
    private String descripcion;
    private int nivelDificultad = 10;
    private int recompensa;

    /*Constructor*/
    public Pruba(String descripcion, int nivelDificultad, int recompensa) {
        this.descripcion = descripcion;
        this.nivelDificultad = nivelDificultad;
        this.recompensa = recompensa;
    }

    /*Getter and Setter*/

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
        //Nivel de dificultad del reto (1-10)
        if (nivelDificultad < 1 || nivelDificultad > 10){
            System.out.println("El nivel tiene que estar dentro de 1 y 10");
        }
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    /*toString*/
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pruba{");
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
        return hechizo.getPotencia() >= nivelDificultad;
    }
}
