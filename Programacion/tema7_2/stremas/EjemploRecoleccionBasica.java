package tema7_2.stremas;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class EjemploRecoleccionBasica {
    public static void main(String[] args) {

        ArrayList<Double> nums = new ArrayList<>(List.of(1.0,34.0,544.0,2.0,10.0,23.0,2.0));

        Integer suma = nums.stream()
                .collect(Collectors.summingInt(x -> x.intValue()));
        //summingInt devolver todos los numeros a int y sumarla
        System.out.println(suma);


        //IntSummarStatistics: ayuda para sacar los datos de forma rapida
        IntSummaryStatistics stats = nums.stream()
                .collect(Collectors.summarizingInt(Double::intValue));

        System.out.println("Max: " + stats.getMax());
        System.out.println("Min:" + stats.getMin());
        System.out.println("Media: " + stats.getAverage());
        System.out.println("Suma: " + stats.getSum());
        System.out.println("Cuantos elementos: " + stats.getCount());


        ArrayList<Pedido> pedidos = new ArrayList<>(
                List.of(new Pedido(100.0, LocalDate.now()),
                        new Pedido(120.0, LocalDate.now().minusDays(1)),
                        new Pedido(190.0, LocalDate.now().minusDays(2)),
                        new Pedido(275.0, LocalDate.now()),
                        new Pedido(1000.0, LocalDate.now().minusDays(3)))
        );


        DoubleSummaryStatistics dss = pedidos.stream()
                .filter( p -> p.getFecha().isAfter(LocalDate.now().minusDays(1)))
                .collect(Collectors.summarizingDouble(Pedido::getTotal));
        System.out.println(dss.getMax());
        System.out.println(dss.getMin());
        System.out.println(dss.getAverage());
        System.out.println(dss.getSum());
        System.out.println(dss.getCount());


        Set<Pedido> activos = pedidos.stream()
                .filter( p -> p.getFecha().isAfter(LocalDate.now().minusDays(1)))
                .collect(Collectors.toSet());

        activos.forEach(System.out::println);


        System.out.println(activos);


    }
}
