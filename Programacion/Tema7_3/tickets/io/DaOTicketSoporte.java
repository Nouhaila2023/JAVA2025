package Tema7_3.tickets.io;

import Tema7_3.tickets.emu.Especialidad;
import Tema7_3.tickets.emu.Estado;
import Tema7_3.tickets.models.Tecnico;
import Tema7_3.tickets.models.TicketSoporte;
import Tema7_3.tickets.models.Usuario;
import Tema7_3.tickets.services.Buking;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.time.LocalDate;
import java.util.Arrays;

import java.util.List;


public class DaOTicketSoporte {
    public static Buking loadCSV() {

        //OBJETO SERVICIO SOPORTE QUE DEVOLVERMOS CON TODA LA INFO CARGADA
        Buking ss = new Buking();

        //1. Cargar usuarios
        //List<Usuario> usuarios;
        try {
            Files.lines(Paths.get("java2025/resources/examen2024/usuarios.csv"))
                    .map(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        Usuario user = new Usuario(
                                Integer.valueOf(tokens.get(0)),
                                tokens.get(1),
                                tokens.get(2),
                                tokens.get(3),
                                tokens.get(4),
                                LocalDate.parse(tokens.get(5))
                        );
                        return user;
                    }) //Stream<Usuario>
                    .forEach(ss::addUsuario);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //ss.setUsuarios(new HashSet<>(usuarios));

        //2. Cargar técnicos
        try {
            Files.lines(Paths.get("java2025/resources/examen2024/tecnico.csv"))
                    .forEach(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        Tecnico tec = new Tecnico(
                                Integer.valueOf(tokens.get(0)),
                                tokens.get(1),
                                tokens.get(2),
                                tokens.get(3),
                                tokens.get(4),
                                Especialidad.valueOf(tokens.get(5)),
                                Integer.valueOf(tokens.get(6))
                        );
                        ss.addTecnico(tec);
                    }) ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //3. Cargar Tickets Soporte
        try {
            Files.lines(Paths.get("java2025/resources/examen2024/tickets.csv"))
                    .forEach(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));

                        Estado estado = Estado.valueOf(tokens.get(3));
                        //Distinguir si hay que poner fecha de finalización o no
                        LocalDate fechaFin = null;
                        if (estado.equals(Estado.RESUELTO)) {
                            fechaFin = LocalDate.parse(tokens.get(2));
                        }

                        TicketSoporte ts = new TicketSoporte(
                                Integer.valueOf(tokens.get(0)),
                                LocalDate.parse(tokens.get(1)),
                                fechaFin,
                                estado,
                                Integer.valueOf(tokens.get(4)),
                                ss.finadUsuario(Integer.valueOf(tokens.get(5))),
                                ss.finadTecnico(Integer.valueOf(tokens.get(6))),
                                tokens.get(7)
                        );

                        ss.addTicketSoporte(ts);
                    }) ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return ss;

    }

    public static void saveCSV(Buking ss) {
        try {

            //Usuarios
            Files.write(Paths.get("java2025/resources/examen2024/usuarios.csv"),
                    ss.getUsuario().stream()
                            .map(g -> { //objeto Usuario -> String (línea)
                                StringBuffer sb = new StringBuffer();
                                sb.append(g.getId()).append(",");
                                sb.append(g.getNombre()).append(",");
                                sb.append(g.getApellido()).append(",");
                                sb.append(g.getEmail()).append(",");
                                sb.append(g.getMovil()).append(",");
                                sb.append(g.getFechaAlta());
                                return sb.toString();
                            })
                            .toList());

            //Técnicos
            Files.write(Paths.get("java2025/resources/examen2024/tecnico.csv"),
                    ss.getTecnico().stream()
                            .map(g -> { //objeto Tecnico -> String (línea)
                                StringBuffer sb = new StringBuffer();
                                sb.append(g.getId()).append(",");
                                sb.append(g.getNombre()).append(",");
                                sb.append(g.getApellido()).append(",");
                                sb.append(g.getEmail()).append(",");
                                sb.append(g.getMovil()).append(",");
                                sb.append(g.getEspecialidad()).append(",");
                                sb.append(g.getValoracion());
                                return sb.toString();
                            })
                            .toList());

            //Tickets
            Files.write(Paths.get("java2025/resources/examen2024/tickets.csv"),
                    ss.getTickets().stream()
                            .map(g -> { //objeto Tecnico -> String (línea)
                                StringBuffer sb = new StringBuffer();
                                sb.append(g.getId()).append(",");
                                sb.append(g.getFechaCreacion()).append(",");
                                if (g.getFechaFinalizacion() != null) {
                                    sb.append(g.getFechaFinalizacion()).append(",");
                                } else{
                                    sb.append(",");
                                }
                                sb.append(g.getEstado()).append(",");
                                sb.append(g.getPrioridad()).append(",");
                                sb.append(g.getSolicitante().getId()).append(",");
                                sb.append(g.getAsignado().getId()).append(",");
                                if (g.getComentation() != null) {
                                    sb.append(g.getComentation());
                                }
                                return sb.toString();
                            })
                            .toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
