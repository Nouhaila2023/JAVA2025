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
        citas.sort(Comparator.comparing(Cita::getPacienta).reversed());
        pintarElementos(citas);

    }


    /**
     * Listar citas Por Apallidos
     */

    public void listarCitasPorApellido(){
        citas.sort(Comparator.comparing(Cita::getPacienta).reversed());
        pintarElementos(citas);
    }

    /**
     * Listar Cita Por Fecha Y Apallidos
     */

    public void listarCitaFA(){
        citas.sort(new Comparator<Cita>() {
            @Override
            public int compare(Cita o1, Cita o2) {
                if (o2.getFecha().compareTo(o1.getPacienta().getApellidos()) == 0) {


                    return o1.getPacienta().getApellidos().compareTo(o2.getPacienta().getApellidos());


                } else {


                    return o2.getFecha().compareTo(o1.getFecha());


                }
            }
        });
        pintarElementos(citas);
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
