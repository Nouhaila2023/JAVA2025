package Tema7_3.tickets.services;

import Tema7_3.tickets.emu.Especialidad;
import Tema7_3.tickets.emu.Estado;
import Tema7_3.tickets.models.Tecnico;
import Tema7_3.tickets.models.TicketSoporte;
import Tema7_3.tickets.models.Usuario;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class ServicioSoporte {
    /**
     * Atributos
     */
    private List<TicketSoporte> ticketSoportes;
    private Set<Usuario> usuario;
    private Set<Tecnico> tecnico;

    /**
     * Metodos
     */

    /**
     * Añadir usuario
     * @param usuario
     */
    public void addUsuario(Usuario usuario) {
        this.usuario.add(usuario);
    }

    /**
     * Eliminar usuario
     * @param id
     * */
    public void deleteUsuario(int id) {
          usuario.removeIf(u -> u.getId() == id);
    }

    /**
     * Eliminar tecnico
     * @param id
     */
    public void deleteTecnico(int id) {
        tecnico.removeIf(t -> t.getId() == id);
    }

    /**
     * Añadir tecnico
     * @param tecnico
     */
    public void addTecnico(Tecnico tecnico) {
        this.tecnico.add(tecnico);
    }

    public void addTicketSoporte(TicketSoporte tiso) {
        ticketSoportes.add(tiso);
    }

    /**
     * Añadir Tecket ->
     * addTicketSoporte(fechaCreacion, fechaFinalizacion, prioridad, comentarios, usuario, tecnico). Para
     * sacar el id del ticket deberías sacar el máximo de los ids que ya hay y sumarle uno.
     * @param fechaCreacion
     * @param fechaFinalizacion
     * @param prioridad
     * @param comentarios
     * @param usuario
     * @param tecnico
     */
    public void addTicketSoporte(LocalDate fechaCreacion, LocalDate fechaFinalizacion, int prioridad,Estado estado, String comentarios, Usuario usuario, Tecnico tecnico){
         int id = ticketSoportes.stream()
                .mapToInt(TicketSoporte::getId)
                .max()
                 .orElse(0);

         TicketSoporte t = new TicketSoporte(id+1, fechaCreacion, fechaFinalizacion, estado, prioridad, usuario, tecnico, comentarios);

         ticketSoportes.add(t);
    }

    /**
     * deleteTicketSoporte(int id): elimina un Ticket de la lista correspondiente.
     * @param id
     */
    public void deleteTicketSoporte(int id) {
        ticketSoportes.removeIf(t -> t.getId() == id);
    }

    /**
     * Tecnico findTecnicoById(int id): técnico con el id indicado.
     * @param id
     * @return
     */
     public Tecnico finadTecnico(int id) {
        return tecnico.stream()
                .filter( t -> t.getId() == id)
                .findAny()
                .orElse(null);
     }

    /**
     * Usuario findUsuarioById(int id): usuario con el id indicado.
     * @param id
     * @return
     */
     public Usuario finadUsuario(int id) {
         return usuario.stream()
                 .filter( u -> u.getId() == id)
                 .findAny()
                 .orElse(null);
     }


    /**
     * List<Tecnico> getTecnicosByEspecialidad(Especialidad esp): lista de técnicos de una especialidad.
     * @param esp
     * @return
     */

    public List<Tecnico> getTecnicosByEspecialidad(Especialidad esp){
        return tecnico.stream()
                .filter( t -> t.getEspecialidad() == esp)
                .toList();
    }

    /**
     * Map<Especialidad, List<Tecnico>> getTecnicosGroupByEspecialidad(): mapa con especialidad y
     * para cada una la lista de técnicos de esa especialidad ordenados por valoración.
     * @return
     */
    public Map<Especialidad, List<Tecnico>> getTecnicosGroupByEspecialidad(){
       return tecnico.stream()
               .collect(Collectors.groupingBy(Tecnico::getEspecialidad,
                       Collectors.collectingAndThen(
                               Collectors.toList(),
                               lista -> {
                                   lista.sort(Comparator.comparingInt(Tecnico::getValoracion));
                                   return lista;
                               }
                       )
               )
       );
    }

    /**
     * TicketSoporte findTicketById(int id): ticket de soporte con el id indicado.
     * @param id
     * @return
     */

    public TicketSoporte findTicketById(int id){
        return ticketSoportes.stream()
                .filter( f -> f.getId() == id)
                .findAny()
                .orElse(null);
    }

    /**
     * List<TicketSoporte> getTicketsAbiertos(): lista con todos los tickets abiertos ordenados por fecha
     * de creacion descendente
     * @return
     */

    public List<TicketSoporte> getTicketsAbiertos(){
       return ticketSoportes.stream()
               .filter( t -> t.getEstado() == Estado.ABIERTO)
               .sorted(Comparator.comparing(TicketSoporte::getFechaCreacion)
               .reversed())
               .toList();
    }

    /**
     * List<TicketSoporte> getTicketsCerrados(): lista con todos los tickets resueltos ordenados por fecha
     * de finalización descendente
     * @return
     */

    public List<TicketSoporte> getTicketsCerrados(){
        return ticketSoportes.stream()
                .filter( t -> t.getEstado() == Estado.RESUELTO)
                .sorted(Comparator.comparing(TicketSoporte::getFechaFinalizacion)
                .reversed())
                .toList();
    }

    /**
     * List<TicketSoporte> getTicketsEnProcesoTecnicoInformatico(): devuelve todos los tickets
     * ENPROCESO que tienen asignado un técnico de la especialidad de informática.
     * @return
     */

    public List<TicketSoporte> getTicketsEnProcesoTecnicoInformatico(){
        return ticketSoportes.stream()
                .filter( t -> t.getEstado() == Estado.RESUELTO)
                .filter( t -> t.getAsignado().getEspecialidad() == Especialidad.FONTANERÍA)
                .toList();
    }

    /**
     * Integer getTotalTicketsResueltos(Integer prioridad): devuelve el total de tickets resueltos de una
     * determinada prioridad.
     * @param prioridad
     * @return
     */

    public Integer getTotalTicketsResueltos(Integer prioridad){
        return (int) ticketSoportes.stream()
                .filter( t -> t.getEstado() == Estado.RESUELTO)
                .filter( t -> t.getPrioridad() == prioridad)
                .count();
    }



    public Set<TicketSoporte> findTicketsByEstadoAndPrioridad(Estado estado, Integer prioridad) {
        return ticketSoportes.stream()
                .filter(ticket -> ticket.getEstado().equals(estado))
                .filter(ticket -> ticket.getPrioridad() == prioridad)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public Map<Especialidad, List<Tecnico>> findTecnicosInTickets() {
        return ticketSoportes.stream()
                .map(TicketSoporte::getAsignado)
                .collect(Collectors.groupingBy(Tecnico::getEspecialidad));
    }

    public Set<Tecnico> findTecnicosRapidos() {
        return ticketSoportes.stream()
                .filter(t ->
                        ChronoUnit.DAYS.between(t.getFechaFinalizacion(),t.getFechaCreacion()) <= 5
                )
                .map(TicketSoporte::getAsignado)
                .collect(Collectors.toSet());
    }

    public Long getTotalTicketsRetardados() {
        return ticketSoportes.stream()
                .filter(t -> t.getEstado() == Estado.RESUELTO)
                .filter(t ->
                        ChronoUnit.DAYS.between(t.getFechaFinalizacion(),t.getFechaCreacion()) > 7
                )
                .count();
    }

    //findUsuarioById
    public Double getMediaResolucionTickets(Integer prioridad) {
        return ticketSoportes.stream()
                .filter(t -> t.getPrioridad() == (prioridad))
                .filter(t -> t.getEstado().equals(Estado.RESUELTO))
                .mapToLong( t ->
                        ChronoUnit.DAYS.between(t.getFechaFinalizacion(),t.getFechaCreacion())
                )
                .average()
                .orElse(0.0);
    }

    public Map<Tecnico, Double> getMediaResolucionTicketsGroupByTecnico() {
        return ticketSoportes.stream()
                .filter(t -> t.getEstado().equals(Estado.RESUELTO))
                .collect(Collectors.groupingBy(TicketSoporte::getAsignado,
                        Collectors.averagingLong(t ->
                                ChronoUnit.DAYS.between(t.getFechaFinalizacion(),t.getFechaCreacion())
                        )
                ));
    }

    public Boolean areAllTicketsFinishedLessThanTenDays() {
        return ticketSoportes.stream()
                .allMatch(t ->
                        ChronoUnit.DAYS.between(t.getFechaFinalizacion(),t.getFechaCreacion()) < 10
                );
    }

    public Optional<TicketSoporte> getFirstTicketSolvedOneDay() {
        return ticketSoportes.stream()
                .filter(t -> t.getEstado().equals(Estado.RESUELTO))
                .filter(t ->
                        ChronoUnit.DAYS.between(t.getFechaFinalizacion(),t.getFechaCreacion()) == 1
                )
                .findFirst();
    }


    /**
     * Construcotr
     */
    public ServicioSoporte() {
        this.ticketSoportes = new ArrayList<>();
        this.usuario = new HashSet<>();
        this.tecnico = new HashSet<>();
    }

    /**
     * Getter
     */
    public List<TicketSoporte> getTickets() {
        return ticketSoportes;
    }

    public Set<Usuario> getUsuario() {
        return usuario;
    }

    public Set<Tecnico> getTecnico() {
        return tecnico;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ServicioSoporte{");
        sb.append("tickets=").append(ticketSoportes);
        sb.append(", usuario=").append(usuario);
        sb.append(", tecnico=").append(tecnico);
        sb.append('}');
        return sb.toString();
    }


}
