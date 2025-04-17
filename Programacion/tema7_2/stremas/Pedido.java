package tema7_2.stremas;

import java.time.LocalDate;
import java.util.UUID;

public class Pedido {

    /**
     * Atributos
     */
    private UUID id;
    private Double total;
    private LocalDate fecha;


    /**
     * Constructor
     * @param total
     * @param fecha
     */
    public Pedido(Double total, LocalDate fecha) {
        this.id = UUID.randomUUID();
        this.total = total;
        this.fecha = fecha;
    }

    /**
     * Getter And Setter
     * @return
     */
    public UUID getId() {
        return id;
    }

    public Pedido setId(UUID id) {
        this.id = id;
        return this;
    }

    public Double getTotal() {
        return total;
    }

    public Pedido setTotal(Double total) {
        this.total = total;
        return this;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Pedido setFecha(LocalDate fecha) {
        this.fecha = fecha;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pedido{");
        sb.append("id=").append(id);
        sb.append(", total=").append(total);
        sb.append(", fecha=").append(fecha);
        sb.append('}');
        return sb.toString();
    }
}
