package tema7_2.stremas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EjemploRecoleccionAvanzada {
    public static void main(String[] args) {

        ArrayList<Pedido> pedidos = new ArrayList<>(
                List.of(new Pedido(100.0, LocalDate.now()),
                        new Pedido(120.0, LocalDate.now().minusDays(2)),
                        new Pedido(190.0, LocalDate.now().minusDays(2)),
                        new Pedido(275.0, LocalDate.now()),
                        new Pedido(1000.0, LocalDate.now().minusDays(3)))
        );

        Map<LocalDate, List<Pedido>> pedidosPorFecha = pedidos.stream()
                .collect(Collectors.groupingBy(Pedido::getFecha));


        pedidosPorFecha.forEach((k,v) -> {
            System.out.println(k);
            System.out.println(v);
        });

        System.out.println("++++++++++++++++++++++++++");

        Map<LocalDate, Long> pedidosPorFechaNumero = pedidos.stream()
                .collect(Collectors.groupingBy(Pedido::getFecha, Collectors.counting()));
        //Collectors.counting() para contar cuntos veses por la fecha
        pedidosPorFechaNumero.forEach((k,v) -> {
            System.out.println(k);
            System.out.println(v);
        });




    }
}
