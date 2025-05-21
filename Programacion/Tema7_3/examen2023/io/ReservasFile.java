package Tema7_3.examen2023.io;

import Tema7_3.examen2023.models.HotelPlaya;
import Tema7_3.examen2023.models.HotelRural;
import Tema7_3.examen2023.models.Reserva;
import Tema7_3.examen2023.services.Buking;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReservasFile {

    public static Buking loadCSV() {

        //OBJETO SERVICIO SOPORTE QUE DEVOLVERMOS CON TODA LA INFO CARGADA
        Buking buking = new Buking();

        try {
            Files.lines(Paths.get("examen/hoteles.csv"))
                        .forEach(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                            Integer cali = Integer.parseInt(tokens.get(7));
                        if (cali == 1){
                            HotelPlaya hotelPlaya = new HotelPlaya(
                                    tokens.get(0),
                                    tokens.get(1),
                                    tokens.get(2),
                                    tokens.get(3),
                                    Integer.valueOf(tokens.get(4)),
                                    Double.valueOf(tokens.get(5)),
                                    cali,
                                    Boolean.parseBoolean(tokens.get(8))
                            );
                            buking.addHotel(hotelPlaya);
                        } else if (cali == 0) {
                            HotelRural hotelRural = new HotelRural(
                                    tokens.get(0),
                                    tokens.get(1),
                                    tokens.get(2),
                                    tokens.get(3),
                                    Integer.valueOf(tokens.get(4)),
                                    Double.valueOf(tokens.get(5)),
                                    cali,
                                    Boolean.parseBoolean(tokens.get(8))
                            );
                            buking.addHotel(hotelRural);
                        }

                        });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Files.lines(Paths.get("examen/reservas.csv"))
                    .forEach(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        Reserva reserva = new Reserva(
                                LocalDate.parse(tokens.get(0)),
                                LocalDate.parse(tokens.get(1)),
                                Integer.valueOf(tokens.get(2)),
                                Integer.valueOf(tokens.get(3)),
                                tokens.get(4),
                                tokens.get(5),
                                buking.findHotebyId(Long.valueOf(tokens.get(6)))
                        );
                        buking.addReserva(reserva);
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return buking;
    }

    public static void saveCSV(Buking buking){

        try {
                    Files.write(Paths.get("examen/reservas.csv"),
                    buking.getReservas().stream()
                            //Long id, LocalDate fechaEntrada, LocalDate fechaSalida, Integer cantidadHabitaciones,
                            //Integer numPersonasPorHabitacion, String dni, String nacionalidad, Hotel hotel
                            .map( r -> {
                                StringBuffer sb = new StringBuffer();
                                sb.append(r.getId()).append(",");
                                sb.append(r.getFechaEntrada()).append(",");
                                sb.append(r.getFechaSalida()).append(",");
                                sb.append(r.getCantidadHabitaciones()).append(",");
                                sb.append(r.getNumPersonasPorHabitacion()).append(",");
                                sb.append(r.getDni()).append(",");
                                sb.append(r.getNacionalidad()).append(",");
                                sb.append(r.getHotel()).append(",");
                                return sb.toString();
                            })
                            .toList());


            Files.write(Paths.get("examen/hoteles.csv"),
                    buking.getHoteles().stream()
                            //String nombre, String direccion, String localidad, String prvincia,
                            //Integer numHabitaciones, Double precioNoche, int calificacion, boolean calefaccin
                            .map(h -> {
                                StringBuffer sb = new StringBuffer();
                                sb.append(h.getNombre()).append(",");
                                sb.append(h.getDireccion()).append(",");
                                sb.append(h.getLocalidad()).append(",");
                                sb.append(h.getPrvincia()).append(",");
                                sb.append(h.getNumHabitaciones()).append(",");
                                sb.append(h.getPrecioNoche()).append(",");
                                sb.append(h.getCalificacion()).append(",");

                                if (h.getCalificacion() == 1) {
                                    sb.append(((HotelPlaya) h).isAireAcondecionado());
                                } else if (h.getCalificacion() == 0) {
                                    sb.append(((HotelRural) h).isCalefaccion());
                                }
                                return sb.toString();
                            })
                            .toList());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}











