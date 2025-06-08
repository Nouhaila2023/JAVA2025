package entities;

import java.time.Duration;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;





@Entity
@Table (name = "partidas")
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fechaHora;
    private Duration duracion;

    @ManyToOne
    @JoinColumn(name = "juego_id")
    private Juego juego;

    @ManyToOne
    @JoinColumn(name = "ganador_id")
    private Jugador ganador;

    @ManyToMany
    @JoinTable(
            name = "partida_jugadores",
            joinColumns = @JoinColumn(name = "partida_id"),
            inverseJoinColumns = @JoinColumn(name = "jugador_id")
    )
    private List<Jugador> jugadores = new ArrayList<>();


    public Partida() {
    }

    public Partida(Long id, LocalDateTime fechaHora, Duration duracion, Juego juego, Jugador ganador, List<Jugador> jugadores) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.duracion = duracion;
        this.juego = juego;
        this.ganador = ganador;
        this.jugadores = jugadores;
    }

    public Long getId() {
        return id;
    }

    public Partida setId(Long id) {
        this.id = id;
        return this;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public Partida setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
        return this;
    }

    public Duration getDuracion() {
        return duracion;
    }

    public Partida setDuracion(Duration duracion) {
        this.duracion = duracion;
        return this;
    }

    public Juego getJuego() {
        return juego;
    }

    public Partida setJuego(Juego juego) {
        this.juego = juego;
        return this;
    }

    public Jugador getGanador() {
        return ganador;
    }

    public Partida setGanador(Jugador ganador) {
        this.ganador = ganador;
        return this;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public Partida setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
        return this;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "id=" + id +
                ", fechaHora=" + fechaHora +
                ", duracion=" + duracion +
                ", juego=" + (juego != null ? juego.getId() : null) +
                ", ganador=" + (ganador != null ? ganador.getId() : null) +
                ", jugadores=" + jugadores.stream().map(Jugador::getId).toList() +
                '}';}

}

