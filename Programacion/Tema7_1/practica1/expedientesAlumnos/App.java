package Tema7_1.practica1.expedientesAlumnos;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Y123456", "alumno1", "apellido1", LocalDate.of(1991, 1, 1),
                "Calle N2", "Vera", "alumno1@gmail.com", "123456789" );
        Estudiante e2 = new Estudiante("Y123457", "alumno2", "apellido2", LocalDate.of(1992, 1, 1),
                "Calle N2", "Vera", "alumno2@gmail.com", "223456789" );
        Estudiante e3 = new Estudiante("Y123458", "alumno3", "apellido3", LocalDate.of(1993, 1, 1),
                "Calle N2", "Vera", "alumno3@gmail.com", "323456789" );
        Estudiante e4 = new Estudiante("Y123459", "alumno4", "apellido4", LocalDate.of(1994, 1, 1),
                "Calle N2", "Vera", "alumno5@gmail.com", "423456789" );


        NotasCurso n1 = new NotasCurso(EtapaEducativa.FP_Superior, "Ciclo1", 2, 2000);
        n1.addNotas("Programación", 8.5);
        n1.addNotas("Base de Datos", 7.0);
        n1.addNotas("Sistemas Operativos", 9.0);

        NotasCurso n2 = new NotasCurso(EtapaEducativa.FP_Superior, "Ciclo2", 1, 2001);
        n2.addNotas("Programación", 7.0);
        n2.addNotas("Base de Datos", 7.0);
        n2.addNotas("Sistemas Operativos", 5.0);


        Expediente ex1 = new Expediente(e1,true);
        ex1.addNotas(n1);
        Expediente ex2 = new Expediente(e2,false);
        ex2.addNotas(n2);


        CentroEducativo centro = new CentroEducativo("Centro1", "Madrid",
                "Calle Mayor", "98765432", "centro1@gmail.com");

        centro.addExpediente(ex1);
        ///System.out.println(centro.buscarExpediente("Y123456"));
           centro.buscarExpediente("Y123456");

        centro.buscarExpediente("Y123410");




    }
}
