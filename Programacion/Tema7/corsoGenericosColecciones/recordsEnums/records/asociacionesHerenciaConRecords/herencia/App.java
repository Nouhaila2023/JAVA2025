package Tema7.corsoGenericosColecciones.recordsEnums.records.asociacionesHerenciaConRecords.herencia;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Empleado e = new Empleado("mari", "maria", LocalDate.now());
        System.out.println(e.getNombreCompleto());

        Nombrabre n = new Empleado("Juan", "juan", LocalDate.now());
        System.out.println(n.getNombreCompleto());


    }
}
