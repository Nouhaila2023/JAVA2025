package Tema7.corsoGenericosColecciones.recordsEnums.records.asociacionesHerenciaConRecords.asociaciones;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("empresa1",new Empleado[]{
            new Empleado("empresa2", "e2", LocalDate.of(2000, 4, 4)),
            new Empleado("empresa3", "e3", LocalDate.of(2000, 4, 4)),
        } );

        System.out.println(empresa);

    }
}
