package Tema7_3.ejercicioGamers;

import java.util.HashSet;

public class Discord {

    private HashSet<Gamer> jugadores;

    public Discord() {
        jugadores = new HashSet<>();
    }

    public void addGamer(Gamer gamer) {
        jugadores.add(gamer);
    }

    public void removeGamer(Gamer gamer) {
        jugadores.remove(gamer);
    }

    public HashSet<Gamer> getJugadores() {
        return jugadores;
    }

    public void listGamers() {
        jugadores.forEach(System.out::println);
    }

    public Gamer findGamer(String nick) {
        return jugadores.stream()
                .filter(g -> g.getNick().equals(nick))
                .findFirst()
                .orElse(null);
    }









}
