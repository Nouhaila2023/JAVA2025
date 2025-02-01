package Tema4.Practica1.AcademiaDeMagia;

import java.util.ArrayList;
import java.util.List;

public class Mago {
    /*Propiedades*/
    private String nombre;
    private int energia;
    private List<Hechizo> hechizos;

    /*Constructor*/

    /**
     * Constructor, parametrizado con nombre y energía. La lista se inicializa en el constructor de la siguiente
     * manera:
     */
    public Mago(String nombre, int energia) {
        this.nombre = nombre;
        this.energia = energia;
        this.hechizos = new ArrayList<>();
    }

    /*Getters and Setters*/

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

    public List<Hechizo> getHechizos() {
        return hechizos;
    }

    public void setHechizos(List<Hechizo> hechizos) {
        this.hechizos = hechizos;
    }

    /*toString*/
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Mago{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", energia=").append(energia);
        sb.append(", hechizos=").append(hechizos);
        sb.append('}');
        return sb.toString();
    }

    /**
     * aprenderHechizo(Hechizo hechizo): Añade un hechizo al repertorio del mago. Se haría así:
     * this.hechizos.add(hechizo);
     */

    /**
     * Añader un hechizo pasado como parametro, a la lista de hechizos que el mago tiene aprendido
     * @param hechizo
     */
    public void aprenderHechizo(Hechizo hechizo){
        this.hechizos.add(hechizo);
    }

    /**
     * lanzarHechizo(String nombreHechizo, Prueba prueba): Consume energía y usa el hechizo si está en la lista. Si
     * el hechizo supera la prueba, devuelve un éxito. Si no, pierde energía adicional.
     * Para ver si el hechizo está en la lista podéis hacer un metodo nuevo de la siguiente manera:
     */

    /**
     * Le método primero buscar que el Mago tenga un hechizo con el mismo nombre
     * que se la pasa com String. si no lo tiene devuelve false y acaba.
     * si el mago si tiene ese Hechizo comprueba (esEfectivo) que puede superar la prueva.
     * si el Hechizo es efectivo suma la recompenso de la prueva a la energia del magp y devuelve true
     * si no devuelve false y aplica una perfida de energia( la dificultad de la prueba
     * @param nombreHechizo
     * @param prueba
     * @return
     */


    public boolean lanzarHechizo(String nombreHechizo, Prueba prueba){

        Hechizo miHechazo = this.buscar(nombreHechizo);

        if (miHechazo == null){
            return false;
        }else {
            //Comprovar si el mago tiene energia para lanzar el hechizo
            if (this.getEnergia() >= miHechazo.getEnergiaNecesaria()){

                if (miHechazo.esEfectivo(prueba)){
                    this.setEnergia(energia + prueba.getRecompensa() );
                    return true;
                }else {
                    this.setEnergia(energia - prueba.getRecompensa());
                    return false;
                }
            }
        }
        return false;
    }

    public Hechizo buscar(String nombreHechizo){

        for (Hechizo hechizo : hechizos){
            if(hechizo.getNombre().equalsIgnoreCase(nombreHechizo)){
                return hechizo;//Hechizo encontrado
            }
        }

        return null;//si no se encuenta, devuelva null
    }



    /*recargarEnergia(int cantidad): Aumenta la energía del mago (sin superar el máximo de 100).*/

    public void recargarEnergia(int cantidad){
        if (this.getEnergia() + cantidad >= 100){
            this.setEnergia(100);
        }else {
            this.energia += cantidad;
        }
    }





}
