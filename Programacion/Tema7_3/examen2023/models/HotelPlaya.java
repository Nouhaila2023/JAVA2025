package Tema7_3.examen2023.models;

public class HotelPlaya extends Hotel{

    /**
     * Atributos
     */
    private boolean aireAcondecionado;

    /**
     * Con
     * @param aireAcondecionado
     * @param id
     * @param nombre
     * @param direccion
     * @param localidad
     * @param prvincia
     * @param numHabitaciones
     * @param precioNoche
     * @param calificacion
     */
    public HotelPlaya(String nombre, String direccion, String localidad, String prvincia,
                      Integer numHabitaciones, Double precioNoche, int calificacion, boolean aireAcondecionado) {
        super(nombre, direccion, localidad, prvincia, numHabitaciones, precioNoche, calificacion);
        this.aireAcondecionado = aireAcondecionado;
    }

    /**
     * Getter and Setter
     */
    public boolean isAireAcondecionado() {
        return aireAcondecionado;
    }

    public HotelPlaya setAireAcondecionado(boolean aireAcondecionado) {
        this.aireAcondecionado = aireAcondecionado;
        return this;
    }

    /**
     * toSting
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HotelPlaya{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", localidad='").append(localidad).append('\'');
        sb.append(", prvincia='").append(prvincia).append('\'');
        sb.append(", numHabitaciones=").append(numHabitaciones);
        sb.append(", precioNoche=").append(precioNoche);
        sb.append(", calificacion=").append(calificacion);
        sb.append(", aireAcondecionado=").append(aireAcondecionado);
        sb.append('}');
        return sb.toString();
    }
}
