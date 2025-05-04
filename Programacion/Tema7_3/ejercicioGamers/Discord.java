package Tema7_3.ejercicioGamers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Discord {

    private HashSet<Gamer> jugadores;

    public Discord() {
        //Cargar el jugarod desde el fichero gamers.txt
        jugadores = new HashSet<>(loadGamers());
    }

    private List<Gamer> loadGamers() {
        try {
            List<Gamer> gamers = Files.lines(Paths.get("Tema7_3/ejercicioGamers/gamers.txt"))
                    .map(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        //tokens[0] -> Bnei
                        //tokens[1] -> jjavier@gmail.com
                        //tokens[2] -> AoEIV
                        //tokens[3] -> MALILLO
                        return new Gamer(tokens.get(0), tokens.get(1), tokens.get(2),
                                Nivel.valueOf(tokens.get(3)));
                    }) //Stream<Gamer>
                    .toList();

            return gamers;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
                // Coge el primer gamer que coincida con el filtro
                .findFirst()
                .orElse(null);
    }


    public void saveGamers() {

        try {
            Files.write((Paths.get("gamers.txt")),
                    jugadores.stream()
                            .map(Gamer::toString)
                            .toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }














}
