package Tema7.EjercicioProgrogramacion.Ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;

public class CitaConsulta {

    /**
     * Atributos
     */
    private ArrayList<Cita> citas;


    /**
     * Constructor
     */
    public CitaConsulta() {
        this.citas = new ArrayList<>();
    }

    /**
     * Getter
     */
    public ArrayList<Cita> getCitas() {
        return citas;
    }

    /**
     * addCitas
     */

    public void addCitas(Cita c){
        if (!citas.contains(c)){
            citas.add(c);
        }
    }

    /**
     * removeCita
     */
    public void removeCitas(Cita c){
        citas.remove(c);
    }

    /**
     * Listar Citas Por Nombre
     */

    public void listarCitasPorNombre(){


    }


    /**
     * Listar citas Por Apallidos
     */

    public void listarCitasPorApellido(){

    }

    /**
     * Listar Cita Por Fecha Y Apallidos
     */

    public void listarCitaFA(){

    }


    /**
     * toString
     */

    public String pintarElementos(ArrayList<Cita> cita) {
        final StringBuffer sb = new StringBuffer("CitaConsulta{");
        sb.append("citas=").append(citas);
        sb.append('}');
        return sb.toString();
    }
}
