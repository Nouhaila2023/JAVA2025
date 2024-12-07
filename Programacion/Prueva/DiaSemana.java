package Prueva;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiaSemana {
    public static void main(String[] args) {

        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Obtener el día de la semana a partir de la fecha actual
        DayOfWeek diaSemana = fechaActual.getDayOfWeek();

        // Mostrar el nombre del día
        System.out.println("Hoy es: " + diaSemana);

        // También puedes obtener el número del día de la semana (1=Lunes, 7=Domingo)
        int numeroDia = diaSemana.getValue();
        System.out.println("El número del día de la semana es: " + numeroDia);

        // Ejemplo con una fecha específica (año, mes, día)
        LocalDate fechaEspecifica = LocalDate.of(2024, 10, 10);
        DayOfWeek diaEspecifico = fechaEspecifica.getDayOfWeek();
        System.out.println("El 10 de octubre de 2024 será: " + diaEspecifico);
    }
}
