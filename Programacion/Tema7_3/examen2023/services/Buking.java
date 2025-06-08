package Tema7_3.examen2023.services;

import Tema7_3.examen2023.models.Hotel;
import Tema7_3.examen2023.models.HotelPlaya;
import Tema7_3.examen2023.models.HotelRural;
import Tema7_3.examen2023.models.Reserva;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class Buking {

    /**
     * Atributos
     */
    private List<Hotel> hoteles;
    private Set<Reserva> reservas;

    /*************Metodos****************/

    /**
     * añader Hotel
     */
    public void addHotel(Hotel hotel){
        hoteles.add(hotel);
    }

    /**
     * Eliminar hotel
     */
    public void deleteHotel(Long id){
        hoteles.removeIf(h -> h.getId().equals(id));
    }

    /**
     * Añadir reserva
     */
    public void addReserva(LocalDate fechaEntrada, LocalDate fechaSalida
                           ,Integer cantidadHabitacion, Integer numPersonasPorHabitacion, String dni,
                           String nacinalidad, Hotel hotel){
        Reserva reserva = new Reserva(fechaEntrada, fechaSalida, cantidadHabitacion,
                numPersonasPorHabitacion, dni, nacinalidad, hotel);

        reservas.add(reserva);
    }
    public void addReserva(Reserva reserva){
        this.reservas.add(reserva);
    }

    /**
     * deleteReserva
     */
    public void deleteReserva(Long id){
        reservas.removeIf(r -> r.getId() == id);
    }

    /**
     * hotel con id indicado
     */
    public Hotel findHotebyId(Long id){
        return hoteles.stream()
                .filter( h -> h.getId().equals(id))
                .findAny()
                .orElse(null);
    }

    /**
     * todos los hoteles de una provincia
     */
    public List<Hotel> findHotelByProvincia(String provincia){
        return hoteles.stream()
                .filter( h -> h.getPrvincia().equals(provincia))
                .toList();
    }


    /**
     * devolvera los hoteles con menos de 20 habitaciones
     * oredenados de mayor a menor por el precio de la habitaciones
     */
    public List<Hotel> getHotelsPequenas(){
        return hoteles.stream()
                .filter( h -> h.getNumHabitaciones() <= 20)
                .sorted(Comparator.comparing(Hotel::getNumHabitaciones).reversed())
                .toList();
    }

    public List<Hotel> getHotelsCaros(){
        return hoteles.stream()
                .sorted(Comparator.comparing(Hotel::getPrecioNoche).reversed())
                .limit(2)
                .toList();
    }



    public  HashMap<String, List<Hotel>> getHotelesLocallidad(){
         HashMap<String, List<Hotel>> hotelesLocallidad = (HashMap<String, List<Hotel>>) hoteles.stream()
                .collect(Collectors.groupingBy(Hotel::getLocalidad));

        hotelesLocallidad.forEach((k,v) -> {
             v.sort(Comparator.comparing(Hotel::getPrecioNoche).reversed());
         });

        return hotelesLocallidad;
    }



    public Set<Hotel> getHotelesPlaya(){
        return hoteles.stream()
                .filter(h -> h instanceof HotelPlaya)
                .collect(Collectors.toSet());
    }

    /**
     * devuelve todos los hoteles de tipo rural
     */

    public Set<Hotel> getHotelesRural(){
        return hoteles.stream()
                .filter(h -> h instanceof HotelRural)
                .collect(Collectors.toSet());
    }

    /**
     * reserva von el id indicado
     */
    public Reserva findReservaById(Long id){
        return reservas.stream()
                .filter(r -> r.getId().equals(id))
                .findAny()
                .orElse(null);
    }

    /**
     * todos las reservas con ese DNI
     */

    public List<Reserva> findReservaByDNI(String dni){
        return reservas.stream()
                .filter( r -> r.getDni().equals(dni))
                .toList();
    }

    /**
     * agrupa la reserva por pais
     * y cuente cuantos hay
     */

    public HashMap<String, Long> getReservasPais(){
       /* HashMap<String, Long> reservasPais = (HashMap<String, Long>) reservas.stream()
                .collect(Collectors.groupingBy(Reserva::getNacionalidad));

        reservasPais.forEach((k,v) -> {
            Long.bitCount(v);
        });


        return reservasPais;*/

        return (HashMap<String, Long>) reservas.stream()
                .collect(Collectors.groupingBy(Reserva::getNacionalidad,
                        Collectors.counting()));

    }


    /**
     * devuelve la reserva conmas de 2 habitaciones
     */
    public  List<Reserva> getReservasGrendes(){
        return reservas.stream()
                .filter( r -> r.getCantidadHabitaciones() > 2)
                .toList();
    }

    /**
     * devuelve las reservas ordenadas por fechaEntrada
     */
    public List<Reserva> getReservaOrdenada(){
        return reservas.stream()
                .sorted(Comparator.comparing(Reserva::getFechaEntrada))
                .collect(Collectors.toList());
    }

    /**
     * devuelve el coste de una reserva multiplicado
     * el numero de habitaciones por el precio
     * de la habitacion (precioHotel en la clase Hotel)
     * por el numero de dias de la reserva
     */

    public double getImporteReserva(Long idReserva){
        Reserva reserva = findReservaById(idReserva);

        Integer numDias = Period.between(reserva.getFechaEntrada(), reserva.getFechaSalida())
                .getDays();

        return reserva.getCantidadHabitaciones()*reserva.getHotel().getPrecioNoche()*numDias;

    }

    /**
     * devuelve todas las reservas de ese hotel cuya
     * fecha de entrada sea igual o anterior a la de hoy y la fecha de
     * salida sea posterior o igual a la de hoy
     */
    public  List<Reserva> getReservasActivas(Long idHotel){
        return (List<Reserva>) reservas.stream()
                .filter(r -> r.getId().equals(idHotel))
                .filter( r -> r.getFechaEntrada().equals(LocalDate.now()) ||
                                r.getFechaEntrada().isBefore(LocalDate.now()))
                .filter(r -> r.getFechaSalida().equals(LocalDate.now()) ||
                                r.getFechaSalida().isAfter(LocalDate.now()))
                .toList();
    }






































    /**
     * Constructor
     */
    public Buking() {
        this.hoteles = new ArrayList<>();
        this.reservas = new HashSet<>();
    }

    /**
     * Getter
     */
    public List<Hotel> getHoteles() {
        return hoteles;
    }

    public Set<Reserva> getReservas() {
        return reservas;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Buking{");
        sb.append("hoteles=").append(hoteles);
        sb.append(", reservas=").append(reservas);
        sb.append('}');
        return sb.toString();
    }
}
