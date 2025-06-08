package repositories;

import entities.Juego;
import entities.Jugador;
import entities.Partida;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Estadicticas {
    private final JugadorRep jugador;
    private final PartidaRep partida;

    public Estadicticas(JugadorRep jugadorDao, PartidaRep partidaDao) {
        this.jugador = jugadorDao;
        this.partida = partidaDao;
    }


    public Map<Juego, List<Jugador>> jugadoresPorJuego() {
        return JugadorRep
                .findAll().stream()
                .collect(Collectors.groupingBy(Jugador::getJuegoPreferido));
    }

    public Map<Juego, Long> partidasPorJuego() {
        return partida.findAll().stream()
                .collect(Collectors.groupingBy(Partida::getJuego, Collectors.counting()));
    }

    public List<Jugador> jugadoresOrdenadosPorVictorias() {
        return partida.findAll().stream()
                .filter(p -> p.getGanador() != null)
                .collect(Collectors.groupingBy(Partida::getGanador, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<Jugador, Long>comparingByValue().reversed())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }


    public Map<Juego, List<Jugador>> jugadoresPorJuegoOrdenadosPorVictorias() {
        Map<Juego, List<Jugador>> jugadoresPorJuego = jugadoresPorJuego();

        return jugadoresPorJuego;
    }



}
