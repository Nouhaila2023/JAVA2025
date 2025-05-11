package Tema7_3.practica3Fincas.service;

import Tema7_3.practica3Fincas.model.Finca;
import Tema7_3.practica3Fincas.model.Lectura;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class DAOLectura {

    /**
     * Atributos
     */
    private Set<Lectura> lecturas;
    private DAOFinca daoFinca;


    /**
     * Constructor -> llamando al metodo cargarDatos()
     */
    public DAOLectura() {
        this.lecturas = new HashSet<>();
        this.daoFinca = new DAOFinca();
        cargarDatos();
    }

    /**
     * Getter and Setter
     * @return
     */
    public Set<Lectura> getLecturas() {
        return lecturas;
    }

    public DAOFinca getDaoFinca() {
        return daoFinca;
    }

    public DAOLectura setDaoFinca(DAOFinca daoFinca) {
        this.daoFinca = daoFinca;
        return this;
    }

    /**
     * cargarDatos(): leerá el fichero lecturas.csv y para cada línea que encuentre creará un objeto
     * Lectura y lo añadirá a las lecturas. Para crear la lectura habrá que buscar su finca
     * correspondiente DAOFinca.findById
     */
    public void cargarDatos(){
        try {
            lecturas = Files.lines(Paths.get("practica3/Lecturas.csv"))
                    .map( linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        Finca finca = daoFinca.findById(Integer.parseInt(tokens.get(4)));
                        Lectura lectura = new Lectura(
                                Integer.parseInt(tokens.get(0)),
                                Double.parseDouble(tokens.get(1)),
                                Double.parseDouble(tokens.get(2)),
                                LocalDateTime.parse(tokens.get(3)),
                                finca
                        );
                        return lectura;
                    }).collect(Collectors.toSet());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * grabarDatos(): tomará la colección de lecturas y las grabará en el fichero de texto lecturas.csv.
     */
    public  void grabarDatos(){

        try {
            List<String> grabarDatosLista = lecturas.stream()
                    .map(Lectura::toString)
                    .collect(Collectors.toList());

            Files.write(Paths.get("practica3/Lecturas.csv"), grabarDatosLista);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * addLectura(Lectura l): añade una Lectura a lecturas.
     */
    public void addLectura(Lectura lectura){
        lecturas.add(lectura);
    }

    /**
     * deleteLectura(Lectura l): elimina una Lectura de lecturas.
     */
    public void deleteLectura(Lectura lectura){
        lecturas.remove(lectura);
    }

    /**
     * HashMap<int, List<Lectura>> getLecturasPorFinca(): devuelve todas las lecturas agrupadas por
     * finca (por su id)
     */

    public HashMap<Integer, List<Lectura>> getLecturasPorFinca(){
        return lecturas.stream()
                .collect(Collectors.groupingBy( l -> l.getFinca().getId(),
                        HashMap::new,
                        Collectors.toList()
                ));
    }

    /**
     * Double getTempMaximaFinca(int id): devuelve la temperatura máxima de todas las lecturas de
     * una finca.
     */

    public Double getTempMaximaFinca(int id){
        return lecturas.stream()
                .filter( f -> f.getId() == id)
                .map(Lectura::getTemperatura)
                .max(Double::compareTo)
                .orElse(null);
    }


    /**
     * Double getTempMinimaFinca(int id): devuelve la temperatura mínima de todas las lecturas de
     * una finca.
     */

    public Double getTempMinimaFinca(int id){
        return lecturas.stream()
                .filter( f -> f.getId() == id)
                .map(Lectura::getTemperatura)
                .min(Double::compareTo)
                .orElse(null);
    }


    /**
     * List<Double> getHumedadPorFinca(int id): para una finca devuelve una lista de los valores de
     * humedad ordenados por fecha.
     */

    public List<Double> getHumedadPorFinca(int id){
        return lecturas.stream()
                .filter( l -> l.getId() == id)
                .sorted(Comparator.comparing(Lectura::getMomento))
                .map(Lectura::getHumedad)
                .collect(Collectors.toList());
    }


    /**
     * List<Double> getTemperaturaPorFinca(int id): para una finca devuelve una lista de los valores
     * de temperatura ordenados por fecha.
     */

    public List<Double> getTemperaturaPorFinca(int id){
        return lecturas.stream()
                .filter( l -> l.getId() == id)
                .sorted(Comparator.comparing(Lectura::getMomento))
                .map(Lectura::getTemperatura)
                .collect(Collectors.toList());
    }

    /**
     * List<Double> getTempDiaPorFinca(int id, LocalDate dia): muestra todas las temperaturas de
     * una finca en un día concreto ordenado por fecha (hora).
     */

    public List<Double> getTempDiaPorFinca(int id, LocalDate dia){
        return lecturas.stream()
                .filter( l -> l.getId() == id)
                .filter(l -> l.getMomento().toLocalDate().isEqual(dia))
                .sorted(Comparator.comparing(Lectura::getMomento))
                .map(Lectura::getTemperatura)
                .collect(Collectors.toList());
    }



















}
