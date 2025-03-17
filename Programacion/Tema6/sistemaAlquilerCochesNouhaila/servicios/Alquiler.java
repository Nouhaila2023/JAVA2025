package Tema6.sistemaAlquilerCochesNouhaila.servicios;

import Tema6.sistemaAlquilerCochesNouhaila.entidades.Cliente;
import Tema6.sistemaAlquilerCochesNouhaila.entidades.Coche;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Alquiler {
    /**
     * General numero Aleatorio para el id
     * @param min
     * @param max
     * @return
     */
    public static Long numero_aleatorio(int min , int max){

        return (long) (Math.random()*(max-min+1) +min);

    }
    /**
     * Atributos
     */
    private static Long ID = numero_aleatorio(1,100);
    private Long id = ID;
    private Cliente cliente;
    private Coche coche;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double precioTotal;


    /**
     * Constructor que reciba coche, fechaI ficheF
     */
    public Alquiler(Cliente cliente, LocalDate fechaInicio, LocalDate fechaFin, ArrayList<Coche> coche) {
        this.cliente = cliente;
        this.coche.calcularPrecioAlquiler((int) ChronoUnit.DAYS.between(fechaInicio,fechaFin));
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioTotal = 0.0;
    }

    /**
     *Cancelar Alquiler
     */
    public void cancilarAlquiler(){
        if (coche.isDisponible()){
            coche.setDisponible(true);
            System.out.println("El Coche" + coche + " esta libre.");
        }
    }

    /**
     * General Email:
     * nombre + apellidos + marca + modelo + matricula + fechaI + precioTotal
     */
    public String crearEmail(){
        final StringBuffer sb = new StringBuffer("Email{");
        sb.append("nombre=").append(cliente.getNombre());
        sb.append("apellido=").append(cliente.getApellidos());
        sb.append("marca=").append(coche.getMarca());
        sb.append("nombre=").append(coche.getModelo());
        sb.append("nombre=").append(coche.getMatricula());
        sb.append("fecha de alquiler=").append(fechaInicio);
        sb.append("precio=").append(coche.calcularPrecioAlquiler((int) ChronoUnit.DAYS.between(fechaInicio,fechaFin)));
        return "";
    }



    /**
     * Getter Setter
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    /**
     * toStrng
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Alquiler{");
        sb.append("id=").append(id);
        sb.append(", cliente=").append(cliente);
        sb.append(", coche=").append(coche);
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", fechaFin=").append(fechaFin);
        sb.append(", precioTotal=").append(precioTotal);
        sb.append('}');
        return sb.toString();
    }
}
