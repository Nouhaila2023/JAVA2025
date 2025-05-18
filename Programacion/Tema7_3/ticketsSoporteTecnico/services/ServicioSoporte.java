package Tema7_3.ticketsSoporteTecnico.services;

import Tema7_3.ticketsSoporteTecnico.enumerado.Especialidad;
import Tema7_3.ticketsSoporteTecnico.enumerado.Estado;
import Tema7_3.ticketsSoporteTecnico.models.Tecnico;
import Tema7_3.ticketsSoporteTecnico.models.TicketSoporte;
import Tema7_3.ticketsSoporteTecnico.models.Usuario;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ServicioSoporte {

    /**
     * Atributos
     */
    private List<TicketSoporte> ticketsSoportes;
    private Set<Usuario> usuarios;
    private Set<Tecnico> tecnicos;


    /**
     * Constructor
     */
    public ServicioSoporte() {
        this.ticketsSoportes = new ArrayList<>();
        this.usuarios = new HashSet<>();
        this.tecnicos = new HashSet<>();
    }

    /******************Metodos***********************/

    /**
     * Añadir usuario
     * @param usuario
     */
    public void addUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    /**
     * Eliminar Usuario
     * @param usuario
     */
    public void deleteUsuario(Usuario usuario) {
        this.usuarios.remove(usuario);
    }

    /**
     * Añadir tecnico
     * @param tecnico
     */
    public void addTecnico(Tecnico tecnico) {
        this.tecnicos.add(tecnico);
    }

    /**
     * Eliminar tecnico
     * @param tecnico
     */
    public void deleteTecnico(Tecnico tecnico) {
        this.tecnicos.remove(tecnico);
    }

    /**
     *
     * addTicketSoporte(fechaCreacion, fechaFinalizacion, prioridad, comentarios, usuario, tecnico). Para
     * sacar el id del ticket deberías sacar el máximo de los ids que ya hay y sumarle uno.
     * @param fechaCreacion
     * @param fechaFinalizacion
     * @param prioridad
     * @param comentario
     * @param usuario
     * @param tecnico
     */

    public void addTicketSoporte(LocalDate fechaCreacion, LocalDate fechaFinalizacion, int prioridad, String comentario, Usuario usuario, Tecnico tecnico) {

        int id = ticketsSoportes.stream()
                .mapToInt(TicketSoporte::getId)
                .max()
                .orElse(0) + 1;

        TicketSoporte ticketSoporte = new TicketSoporte(id, fechaCreacion, fechaFinalizacion, Estado.ABIERTO,
                prioridad, usuario, tecnico, comentario);

        ticketsSoportes.add(ticketSoporte);
    }


    /**
     * deleteTicketSoporte(int id): elimina un Ticket de la lista correspondiente.
     * @param id
     */

    public void deleteTicketSoporte(int id){

        ticketsSoportes.removeIf(t -> t.getId() == id);

    }

    /**
     * Tecnico findTecnicoById(int id): técnico con el id indicado.
     * @param id
     * @return
     */

    public Tecnico findTecnicoById(int id) {
        return tecnicos.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
    }

    /**
     * Usuario findUsuarioById(int id): usuario con el id indicado.
     * @param id
     * @return
     */

    public Usuario findUsuarioById(int id) {
        return usuarios.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElse(null);
    }

    /**
     * List<Tecnico> getTecnicosByEspecialidad(Especialidad esp): lista de técnicos de una especialidad.
     * @param esp
     * @return
     */
    public List<Tecnico> getTecnicosByEspecialidad(Especialidad esp){
        return tecnicos.stream()
                .filter(e -> e.getEspecialidad() == esp)
                .collect(Collectors.toList());
    }


    /**
     * Map<Especialidad, List<Tecnico>> getTecnicosGroupByEspecialidad(): mapa con especialidad y
     * para cada una la lista de técnicos de esa especialidad ordenados por valoración.
     * @return
     */

    public Map<Especialidad, List<Tecnico>> getTecnicosGroupByEspecialidad(){
        return tecnicos.stream()
                .collect(Collectors.groupingBy(
                        Tecnico::getEspecialidad,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                lista -> {
                                    lista.sort(Comparator.comparingInt(Tecnico::getValoracion).reversed());
                                    return lista;
                                }
                        )
                ));
    }

    /**
     *  TicketSoporte findTicketById(int id): ticket de soporte con el id indicado
     * @param id
     * @return
     */

    public TicketSoporte findTicketSoporteById(int id) {
        return ticketsSoportes.stream()
                .filter( p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    /**
     * List<TicketSoporte> getTicketsAbiertos(): lista con todos los tickets abiertos ordenados por fecha
     * de creacion descendente.
     * @return
     */

    public List<TicketSoporte> getTicketsAbiertos(){
        return ticketsSoportes.stream()
                .filter( p -> p.getEstado() == Estado.ABIERTO)
                .sorted(Comparator.comparing(TicketSoporte::getFechaCreacion).reversed()).toList();
    }

    /**
     * List<TicketSoporte> getTicketsCerrados(): lista con todos los tickets resueltos ordenados por fecha
     * de finalización descendente.
     */

    public List<TicketSoporte> getTicketsCerrados(){
        return ticketsSoportes.stream()
                .filter( p -> p.getEstado() == Estado.RESUELTO)
                .sorted(Comparator.comparing(TicketSoporte::getFechaFinalizacion).reversed())
                .toList();
    }

    /**
     * List<TicketSoporte> getTicketsEnProcesoTecnicoInformatico(): devuelve todos los tickets
     * ENPROCESO que tienen asignado un técnico de la especialidad de informática.
     return ticketsSoportes.stream()
     .filter(p -> p.getEstado() == Estado.ENPROCESO)
     .filter(p -> p.getTecnicoAsignado() != null &&
     p.getTecnicoAsignado().getEspecialidad() == Especialidad.INFORMATICA)
     .toList();
     */

    List<TicketSoporte> getTicketsEnProcesoTecnicoInformatico(){
        return ticketsSoportes.stream()
                .filter( p -> p.getEstado() == Estado.ENPROCESO)
                .filter(p -> p.getAsignado().getEspecialidad() == Especialidad.INFORMATICA)
                .toList();
    }


    /**
     * Integer getTotalTicketsResueltos(Integer prioridad):
     * devuelve el total de tickets resueltos de una
     * determinada prioridad.
     */

    public Integer getTotalTicketsResueltos(Integer prioridad){
        return ticketsSoportes.stream()
                .filter(p -> p.getEstado() == Estado.RESUELTO)
                .filter( p -> p.getPrioridad() == prioridad)
                .mapToInt(p -> 1)
                .sum();
                //.count

    }

    /**
     * Set<TicketSoporte> findTicketsByEstadoAndPrioridad(Estado estado, Integer prioridad): conjunto
     * con los tickets con el estado y la prioridad indicados, ordenados por fecha de creación ascendente
     */

    public Set<TicketSoporte> findTicketsByEstadoAndPrioridad(Estado estado, Integer prioridad){
        return ticketsSoportes.stream()
                .filter( p -> p.getEstado() == estado)
                .filter( p -> p.getPrioridad() == prioridad)
                .sorted(Comparator.comparing(TicketSoporte::getFechaCreacion))
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }


    /**
     * Map<Especialidad, List<Tecnico>> findTecnicosInTickets(): muestra todos los técnicos que han
     * trabajado en algún ticket, agrupados por especialidad.
     */

    public Map<Especialidad, List<Tecnico>> findTecnicosInTickets(){
        return tecnicos.stream()
                .collect(Collectors.groupingBy(Tecnico::getEspecialidad));
    }

    /**
     *Set<Tecnico> findTecnicosRapidos(): muestra una lista de los técnicos que han solucionado tickets
     * en menos de 5 días.
     */
    /*public Set<Tecnico> findTecnicosRapidos(){
        return ticketsSoportes.stream()
                .filter( f -> f.getFechaCreacion() < LocalDate.MIN(5))

    }*/











    /**
     * Getter
     */
    public List<TicketSoporte> getTicketsSoportes() {
        return ticketsSoportes;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public Set<Tecnico> getTecnicos() {
        return tecnicos;
    }

    /**
     * toStirng
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ServicioSoporte{");
        sb.append("ticketsSoportes=").append(ticketsSoportes);
        sb.append(", usuarios=").append(usuarios);
        sb.append(", tecnicos=").append(tecnicos);
        sb.append('}');
        return sb.toString();
    }
}
