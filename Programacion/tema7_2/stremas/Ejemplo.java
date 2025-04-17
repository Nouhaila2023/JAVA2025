package tema7_2.stremas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Ejemplo {

    public static void main(String[] args) {

        Stream<Integer> num = Stream.iterate(0, n -> n + 2).limit(20);
        num.forEach(System.out::println);

        List.of(1,2,3,4,5,6,7,8,9).parallelStream()
                .filter( n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("**************************************************");

        ArrayList<String> letra = new ArrayList<>(List.of("a","b","c","d","e"));
        letra.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("**************************************************");


        Stream<Double> numD = Stream.generate(new Random()::nextDouble);

        System.out.println(numD);
        //numD.forEach(System.out::println);

        System.out.println("**************************************************");


        List.of(1,2,3,4,5,6,7,8,9).stream()
                .skip(5)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("**************************************************");


        List.of("Javi","Juan","Marcos","Juli","María")
                .stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }

}

