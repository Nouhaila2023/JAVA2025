package tema7_2.interfacesFuncionales.supplier;

import tema7_2.interfacesFuncionales.Persona;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploSupplier {
    public static void main(String[] args) {

        List<Persona> personas = List.of(new Persona("Javi","javi@gmail.com"),
                new Persona("Andrea","and@gmail.com"),
                new Persona("Isabel", "isa@gmail.com"),
                new Persona("Juan", "juan@gmx.com"));

        //para creear streams de prueba con datos
        //tambien para genear nuevos Sets o Lists

        Set<Double> number = Stream.generate(Math::random)
                .limit(10)
                .peek(System.out::println)
                .collect(Collectors.toSet());

        Set<Double> numbers = Stream.generate(Math::random)
                .limit(10)
                .peek(System.out::println)
                .collect(Collectors.toSet());
    }
}
