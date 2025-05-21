package Tema7_3.examen2023.models;

public class HotelRural extends Hotel {

    /**
     * Atributos
     */
    private boolean calefaccion;


    /**
     * Con
     * @param calefaccin
     * @param nombre
     * @param direccion
     * @param localidad
     * @param prvincia
     * @param numHabitaciones
     * @param precioNoche
     * @param calificacion
     */
    public HotelRural(String nombre, String direccion, String localidad, String prvincia,
                      Integer numHabitaciones, Double precioNoche, int calificacion, boolean calefaccin) {
        super(nombre, direccion, localidad, prvincia, numHabitaciones, precioNoche, calificacion);
        this.calefaccion = calefaccin;
    }

    /**
     * Gette an Setter
     */
    public boolean isCalefaccion() {
        return calefaccion;
    }

    public HotelRural setCalefaccion(boolean calefaccion) {
        this.calefaccion = calefaccion;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HotelRural{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", localidad='").append(localidad).append('\'');
        sb.append(", prvincia='").append(prvincia).append('\'');
        sb.append(", numHabitaciones=").append(numHabitaciones);
        sb.append(", precioNoche=").append(precioNoche);
        sb.append(", calificacion=").append(calificacion);
        sb.append(", calefaccion=").append(calefaccion);
        sb.append('}');
        return sb.toString();
    }
}
