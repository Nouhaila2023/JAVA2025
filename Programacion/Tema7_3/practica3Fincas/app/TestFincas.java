package Tema7_3.practica3Fincas.app;

import Tema7_3.practica3Fincas.model.Finca;
import Tema7_3.practica3Fincas.service.DAOFinca;
import Tema7_3.practica3Fincas.service.DAOLectura;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class TestFincas {
    public static void main(String[] args) {

        DAOFinca finca = new DAOFinca();
        DAOLectura lectura = new DAOLectura();

        System.out.println("*****************Probar metodos de DAOFinca*******************");

        System.out.println("Finca ordenada por superficie:");
        finca.getFincasPorSuperficie().forEach(System.out::println);

        System.out.println("\nTres fincas mas grandes:");
        finca.getMasGrandes().forEach(System.out::println);

        System.out.println("\nFincas agrupadas por ciudad:");
        Map<String, List<Finca>> fincasPorCiudad = finca.getFincasPorCiudad();
        fincasPorCiudad.forEach((ciudad, fincas) -> {
            System.out.println(ciudad + ":");
            fincas.forEach(System.out::println);
        });

        System.out.println("\nFincas entre 50 y 150 m²:");
        finca.getFincasMedio().forEach(System.out::println);

        System.out.println("*****************Probar metodos de DAOLectura*******************");

        System.out.println("\nLecturas agrupadas por finca:");
        lectura.getLecturasPorFinca().forEach((id, lecturas) -> {
            System.out.println("Finca ID " + id + ":");
            lecturas.forEach(System.out::println);
        });

        System.out.println("\nTemperatura maxima de la finca con ID");
        System.out.println(lectura.getTempMaximaFinca(2));

        System.out.println("\nTemperatura mimina de la finca con ID:");
        System.out.println(lectura.getTempMinimaFinca(3));

        System.out.println("\nHumedades ordenadas de finca ID 1:");
        lectura.getHumedadPorFinca(1).forEach(System.out::println);

        System.out.println("\nTemperaturas ordenadas de finca ID 1:");
        lectura.getTemperaturaPorFinca(1).forEach(System.out::println);

        System.out.println("\nTemperaturas de finca ID 1 en día 2023-04-10:");
        lectura.getTempDiaPorFinca(1, LocalDate.of(2023, 4, 10)).forEach(System.out::println);

        System.out.println("\nEliminando 5 lecturas:");
        lectura.getLecturas().stream().limit(5).toList().forEach(lectura::deleteLectura);

        System.out.println("\nGuardar Datos");
        lectura.cargarDatos();

    }
}
