package Tema6.ejercicioClasePoo_2ev.entidades;

import java.time.LocalDate;

public class NovelaGrafica extends Comic{

    /**
     * Atributos
     */
    private  String resumen;

    /**
     * Constructor
     */
    public NovelaGrafica(String titulo, LocalDate fecha, Integer numPaginas, String resumen) {
        super(titulo, fecha, numPaginas);
        this.resumen = resumen;
    }

    /**
     * Gette Setter
     */
    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NovelaGrafica{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", numPaginas=").append(numPaginas);
        sb.append(", autors=").append(autors);
        sb.append(", resumen='").append(resumen).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
