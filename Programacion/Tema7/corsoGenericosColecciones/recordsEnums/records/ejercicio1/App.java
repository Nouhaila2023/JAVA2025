package Tema7.corsoGenericosColecciones.recordsEnums.records.ejercicio1;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        ListaTarias l = new ListaTarias(3);

        l.agagrigarTarias(new Tarea("tare1 " , "a", LocalDate.of(20023,5,5)));
        l.agagrigarTarias(new Tarea("tare2 " , "b", LocalDate.of(20020,5,5)));
        l.agagrigarTarias(new Tarea("tare3 " , "c", LocalDate.of(20022,5,5)));

        l.mostrarTareas();

        LocalDate date = LocalDate.of(2020,5,5);
        l.mostrarTareasPrFecha(date);
    }
}
