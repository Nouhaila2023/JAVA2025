package Tema4.Practica.Practica1.AcademiaDeMagia;

import java.util.ArrayList;
import java.util.List;

public class Mago {

    //Propiedades
    private String nombre;
    private int energia;
    private List<Hechizo> hechizo;

    //Constructor
    public Mago(String nombre, int energia) {
        this.nombre = nombre;
        this.energia = energia;
        this.hechizo = new ArrayList<>();
    }

    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public List<Hechizo> getHechizo() {
        return hechizo;
    }

    public void setHechizo(List<Hechizo> hechizo) {
        this.hechizo = hechizo;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Mago{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", energia=").append(energia);
        sb.append(", hechizo=").append(hechizo);
        sb.append('}');
        return sb.toString();
    }

    /**
     * aprenderHechizo(Hechizo hechizo): Añade un hechizo al repertorio del mago. Se haría así:
     * this.hechizos.add(hechizo);
     */
    public void aprendesHechizo(Hechizo hechizo){
        this.hechizo.add(hechizo);
    }

/**
 * lanzarHechizo(String nombreHechizo, Prueba prueba): Consume energía y usa el hechizo si está en la lista. Si
 * el hechizo supera la prueba, devuelve un éxito. Si no, pierde energía adicional.
 */

    /**
     * Le metodo primero buscar que el Mago tenga un hechizo con el mismo nombre
     * que se la pasa com String. si no lo tiene devuelve false y acaba.
     * si el mago si tiene ese Hechizo comprueba (esEfectivo) que puede superar la prueva.
     * si el Hechizo es efectivo suma la recompenso de la prueva a la energia del magp y devuelve true
     * si no devuelve false y aplica una perfida de energia( la dificultad de la prueba
     * @param nombreHechizo
     * @param prueba
     * @return
     */

    public boolean lanzarHechizo(String nombreHechizo, Prueba prueba){

        Hechizo miHechizo = this.buscar(nombreHechizo);

        if (miHechizo == null){
            return false;
        }else {

            if (miHechizo.getEnergiaNecisaria() < this.energia){
                System.out.println("Necisita recargar su energia");
                return false;
            }else {
                if (miHechizo.esEfectivo(prueba)){
                    this.energia += prueba.getRecompensa();
                    return true;
                }else {
                    this.energia -= prueba.getNivelDificultad();
                    //si queda sin energia termina el juego
                    if (this.energia <= 0){
                        System.out.println("Sin energia:) ha terminado.");
                    }
                    return false;
                }
            }
        }
    }

    //Metodo Buscar
    public Hechizo buscar(String nombreHechizo){
        for (Hechizo h : hechizo){
            if (h.getNombre().equalsIgnoreCase(nombreHechizo)){
                return h;
            }
        }
        return null;//Si no se encuentra, devuelve null
    }


/**
 * recargarEnergia(int cantidad): Aumenta la energía del mago (sin superar el máximo de 100)
 */

    public void recargarEnergia(int cantidad){
        int totalCantidad = cantidad + energia;
        energia = Math.max(100, totalCantidad);
    }









}
