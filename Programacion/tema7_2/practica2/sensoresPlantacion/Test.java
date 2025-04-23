package tema7_2.practica2.sensoresPlantacion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Test {

    public static double numero_aleatorio(double min, double max){
        return Math.random() * (max - min) + min; // تصحيح هنا
    }

    public static void main(String[] args) {
        List<Registro> registros = new ArrayList<>();
        LocalDateTime fechaHora = LocalDateTime.now();

        for (int i = 0; i < 100; i++) {
            double humedad = numero_aleatorio(0.3, 0.9);  //  0.3 y 0.9
            double temperatura = numero_aleatorio(-10, 40); //  -10 y 40

            registros.add(new Registro(fechaHora, temperatura, humedad));

            fechaHora = fechaHora.plusMinutes(1);
        }

        registros.forEach(System.out::println);


        /**
         * 1. Filtrar los registros de temperatura que sean mayores a 25 grados, la humedad sea menor a 70 y la
         * fecha sea anterior a la fecha actual, y mostrarlos.
         */
        System.out.println("*************************************************************************");
        registros.stream()
                .filter(p -> p.getTemperatura() > 25)
                .filter(p -> p.getHumedad() < 0.7)
                .filter(p -> p.getFechaHora().isBefore(LocalDateTime.now()))
                .forEach(System.out::println);


        /**
         *  2. Encontrar el registro con la temperatura más alta y mostrar el registro comple
         */
        System.out.println("*************************************************************************");
        registros.stream()
                .max(Comparator.comparing(Registro::getTemperatura))
                .ifPresent(System.out::println);


        /*3. Obtener una lista con las fechas/horas de todas las tomas de datos.*/

        System.out.println("*************************************************************************");

        List<LocalDateTime> fechas = registros.stream()
                .map(Registro::getFechaHora)
                .toList();

        fechas.forEach(System.out::println);


        /*4. Incrementar en 5 unidades la humedad de todos los registros y mostrar las temperaturas,
                humedades y fechas/horas actualizadas.*/

         System.out.println("*************************************************************************");

         registros.forEach(h -> h.setHumedad(h.getHumedad()+5));

         registros.forEach(System.out::println);


        /*5. Encontrar el registro con la temperatura más baja que tenga una humedad mayor a 80 y mostrar la
        temperatura, humedad y fecha.*/

        System.out.println("*************************************************************************");

        registros.stream()
                .filter( h -> h.getHumedad() > 0.8)
                .min(Comparator.comparing(Registro::getTemperatura))
                .ifPresent(s -> System.out.println(
                        "Fecha: " + s.getFechaHora() +
                                "Temperatura: " + s.getTemperatura() +
                                "Humedad: " + s.getHumedad()
                ));


        /* 6. Verificar si algún registro tiene una temperatura mayor a 30 grados, humedad mayor a 90 y la fecha
        es de hoy. Mostrar un mensaje indicando si hay algún registro que cumple esta condición o no.*/

        System.out.println("*************************************************************************");

        boolean hayRegistro = registros.stream()
                .filter( t -> t.getTemperatura() > 30)
                .filter(h -> h.getHumedad() > 0.9)
                .anyMatch( f -> f.getFechaHora().equals(LocalDateTime.now()));

        if (hayRegistro) {
            System.out.println("Hay al menos un registro que cumple con las condiciones.");
        }else {
            System.out.println("No hay ningún registro que cumpla con las condiciones.");
        }


        /*7. Muestra 10 registros saltándote los 5 primeros.
         */

        System.out.println("*************************************************************************");

        registros.stream()
                .skip(5)
                .limit(10)
                .forEach(System.out::println);


        /*
        8. Muestra los registros ordenados por fecha (sorted(Comparator))
         */

        System.out.println("*************************************************************************");

        registros.stream()
                .sorted(Comparator.comparing(Registro::getFechaHora))
                .forEach(System.out::println);


        registros.stream()
                .sorted(Comparator.comparing(Registro::getFechaHora).reversed())
                .forEach(System.out::println);


        /*
        9. Cuenta los registros que tengan temperatura mayor a 35 grados (count()).
         */

        System.out.println("*************************************************************************");

         Long tem = registros.stream()
                .filter( t -> t.getTemperatura() > 35)
                .count();

        System.out.println(tem);

        /*
        10. Calcular la temperatura promedio de todos los registros (transformarlo en Stream<Double> y
        llamar a average()).*/

        System.out.println("*************************************************************************");

        registros.stream()
                .mapToDouble(Registro::getTemperatura)
                .average()
                .orElseThrow();

    }
}
