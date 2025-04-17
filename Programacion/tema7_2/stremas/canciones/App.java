package tema7_2.stremas.canciones;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<Cancion> canciones = List.of(
                new Cancion("Blinding Lights", new Artista("The Weeknd", "Canadá"), 2024, 200, 90.5, Genero.POP),
                new Cancion("Levitating", new Artista("Dua Lipa", "Reino Unido"), 2024, 203, 88.7, Genero.POP),
                new Cancion("Lost Souls", new Artista("Foo Fighters", "EE. UU."), 2024, 210, 91.0, Genero.ROCK),
                new Cancion("Rise Again", new Artista("Sam Smith", "Reino Unido"), 2025, 220, 92.5, Genero.POP),
                new Cancion("Phoenix Rising", new Artista("Paramore", "EE. UU."), 2025, 180, 89.7, Genero.ROCK),
                new Cancion("The Final Frontier", new Artista("Ghost", "Suecia"), 2025, 215, 92.1, Genero.METAL),
                new Cancion("Shining Star", new Artista("Doja Cat", "EE. UU."), 2025, 185, 88.7, Genero.HIPHOP),
                new Cancion("Crimson Skies", new Artista("Foo Fighters", "EE. UU."), 2025, 225, 93.3, Genero.ROCK),
                new Cancion("Kiss Me More", new Artista("Doja Cat", "EE. UU."), 2024, 205, 87.1, Genero.POP)
        );


        //Mustrar las canciones de 2025

        canciones.stream()
                .filter( a -> a.getAnoLanzamiento() == 2025)
                .forEach(System.out::println);

        System.out.println("--------------------------------------------------");

        //Mustrar Las cansiones de Doja Cat

        canciones.stream()
                .filter(c -> c.getArtista().getNombre().equals("Doja Cat"))
                .forEach(System.out::println);

        System.out.println("--------------------------------------------------");

        //Mustrar las canciones ordenadas de mayor a menor por popularidad

        canciones.stream()
                .sorted(Comparator.comparing(Cancion::getPopularidad).reversed())
                .forEach(System.out::println);


        System.out.println("--------------------------------------------------");

        //4. Calcula la duración total de todas las canciones en minutos

        Integer duracionEnSegundo = canciones.stream().mapToInt(Cancion::getDuracionSegs).sum();

        System.out.println(duracionEnSegundo/60);

        Integer duracionSegs = canciones.stream()
                .collect(Collectors.summingInt(Cancion::getDuracionSegs));
        System.out.println(duracionSegs / 60);

        System.out.println("--------------------------------------------------");

        //5. Agrupa las canciones por país de origen y cuántas canciones por país.

        Map<String, Long> agruparPorPais = canciones.stream()
                        .collect(Collectors.groupingBy(c -> c.getArtista().getPais(),
                                Collectors.counting()));

        agruparPorPais.forEach((pais, count) -> System.out.println(pais + ": " + count));


        System.out.println("--------------------------------------------------");

        //6. Muestra las canciones agrupadas por género, cuántas por cada uno.

        Map<Genero , Long> agroparPorGenero = canciones.stream()
                        .collect(Collectors.groupingBy(Cancion::getGenero, Collectors.counting()));

        agroparPorGenero.forEach((genero, count) -> System.out.println(genero + ": " + count));


        System.out.println("--------------------------------------------------");

        //7. Comprueba si hay alguna canción con más del 95% de popularidad, y 90%

        canciones.stream()
                        .filter( c -> c.getDuracionSegs() >= 90.0)
                                .findAny()
                                        .orElseThrow();




        System.out.println("--------------------------------------------------");

        //8. Muestra las tres canciones de más duración

        canciones.stream()
                .sorted(Comparator.comparing(Cancion::getPopularidad).reversed())
                .limit(3)
                .forEach(System.out::println);


        System.out.println("--------------------------------------------------");



        System.out.println("--------------------------------------------------");



    }
}
