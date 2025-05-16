package Tema7_3.EjercicioClaseFicheroStreams.io;

import Tema7_3.EjercicioClaseFicheroStreams.enumes.Departamento;
import Tema7_3.EjercicioClaseFicheroStreams.enumes.Estado;
import Tema7_3.EjercicioClaseFicheroStreams.enumes.Tipo;
import Tema7_3.EjercicioClaseFicheroStreams.models.Localizacion;
import Tema7_3.EjercicioClaseFicheroStreams.models.Material;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class FileUtils {

    public static Set<Localizacion> leerLocalizaciones() {
        Set<Localizacion> localizaciones = new HashSet<>();

        try {
            localizaciones = Files.lines(Paths.get("LocalMate/local.csv"))
                    .map(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        Localizacion l = new Localizacion(
                                UUID.fromString(tokens.get(0)),
                                tokens.get(1),
                                tokens.get(2)
                        );
                        return l;
                    }).collect(Collectors.toSet());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return localizaciones;
    }

    public static Set<Material> leerMateriales() {
        Set<Material> materials = new HashSet<>();

        /*try {
            Set<Localizacion> localizaciones = leerLocalizaciones();

            materials = Files.lines(Paths.get("LocalMate/material.csv"))
                    .map(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        int idLocal = Integer.parseInt(tokens.get(6));


                        Localizacion loc = localizaciones.stream()
                                .filter(l -> l.getId() == idLocal)
                                .findFirst()
                                .orElse(null);

                        Material l = new Material(
                                UUID.fromString(tokens.get(0)),
                                tokens.get(1),
                                tokens.get(2),
                                Estado.valueOf(tokens.get(3)),
                                Tipo.valueOf(tokens.get(4)),
                                Departamento.valueOf(tokens.get(5)),
                                loc
                        );
                        return l;
                    }).collect(Collectors.toSet());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        return materials;
    }









}
