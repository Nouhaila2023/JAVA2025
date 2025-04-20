package tema7_2.practica2.sensoresPlantacion;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Registro {
    /**
     * Atributos
     */

    private LocalDateTime fechaHora;
    private Double temperatura;
    private Double humedad;


    /**
     * Constructor
     */

    public Registro(LocalDateTime fechaHora, Double temperatura, Double humedad) {
        this.fechaHora = fechaHora;
        this.temperatura = temperatura;
        this.humedad = humedad;
    }

    /**
     * Getter Setter
     */
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public Registro setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
        return this;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public Registro setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
        return this;
    }

    public Double getHumedad() {
        return humedad;
    }

    public Registro setHumedad(Double humedad) {
        this.humedad = humedad;
        return this;
    }

    /**
     * toStirng
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Registro{");
        sb.append("fechaHora=").append(fechaHora);
        sb.append(", temperatura=").append(temperatura);
        sb.append(", humedad=").append(humedad);
        sb.append('}');
        return sb.toString();
    }
}
