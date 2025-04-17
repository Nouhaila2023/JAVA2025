package tema7_2.stremas;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemplosSorted {
    public static void main(String[] args) {

        Stream.generate(new Random()::nextInt)
                .limit(20)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        Stream.generate(new Random()::nextInt)
                .limit(20)
                .sorted()//Para poner del menor al mayor ascending
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        System.out.println();

        Stream.generate(new Random()::nextInt)
                .limit(10)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println();

        ArrayList<Integer> nums = new ArrayList<>(List.of(1,34,544,2,-10,23,2));
        nums.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);



    }
}
