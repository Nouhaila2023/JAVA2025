package Tema7_3.practica3Fincas.service;

import Tema7_3.practica3Fincas.model.Finca;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class DAOFinca {

    /**
     * Atributos
     */
    private ArrayList<Finca> listaFincas;

    /**
     * Constructor -> llamara a nu metodo cargarDatos
     */
    public DAOFinca() {
        this.listaFincas = new ArrayList<>();
        cargarDatos();
    }

    /**
     * getter
     */
    public ArrayList<Finca> getListaFincas() {
        return listaFincas;
    }

    /**
     * cargarDatos -> llera el fechero fincas.csv y para cada linea
     * creara un objeto Finca y lo añadira a fincas
     */

    public void cargarDatos() {
        try {
            listaFincas = Files.lines(Paths.get("practica3/Fincas.csv"))
                    .skip(1) // saltar la cabecera si existe
                    .map(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        Finca finca = new Finca(
                                Integer.parseInt(tokens.get(0)),
                                tokens.get(1),
                                Double.parseDouble(tokens.get(2)),
                                Double.parseDouble(tokens.get(3)),
                                Double.parseDouble(tokens.get(4)),
                                tokens.get(5),
                                tokens.get(6)
                        );
                        return finca;
                    })
                    //.toList();
                    .collect(Collectors.toCollection(ArrayList::new));
        } catch (IOException e) {
            throw new RuntimeException("Error al leer el archivo Finca.csv", e);
        }
    }

    /**
     * findById(int id): buscan en fincas y devuelve aquella que tenga el id indicado
     */


    public Finca findById(int id){
        for (Finca finca : listaFincas) {
            if (finca.getId() == id) {
                return finca;
            }
        }
        return null;
    }

    /**
     * addFinca(Finca f): añade una Finca a fincas
     */

    public void addFinca(Finca finca){
        listaFincas.add(finca);
    }

    /**
     * deleteFinca(Finca f): elimina una Finca de fincas.
     */

    public void deleteFinca(Finca finca){
        listaFincas.remove(finca);
    }

    /**
     * Finca findByName(String nombre): buscar eficiente las fincas con ese nombre
     */

    /*public Finca findByName(String nombre){
        for (Finca finca : listaFincas) {
            if (finca.getNombre().equals(nombre)) {
                return finca;
            }
        }
        return null;
    }*/

    public List<Finca> findByName(String nombre) {
        return listaFincas.stream()
                .filter(f -> f.getNombre().equalsIgnoreCase(nombre))
                .collect(Collectors.toList());
    }

    /**
     *List<Finca> getFincasPorSuperficie(): devuelve todas las fincas ordenadas de menor a mayor
     * superficie.
     */

    public List<Finca> getFincasPorSuperficie() {
        return listaFincas.stream()
                .sorted(Comparator.comparingDouble(Finca::getSuperficie))
                .collect(Collectors.toList());
    }

    /**
     * List<Finca> getMasGrandes(): devuelve las tres fincas más grandes.
     */

    public List<Finca> getMasGrandes() {
        return listaFincas.stream()
                .sorted(Comparator.comparingDouble(Finca::getSuperficie).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    /**
     * HashMap<String, List<Finca>> getFincasPorCiudad(): muestra las fincas agrupadas por ciudad.
     */

    public HashMap<String, List<Finca>> getFincasPorCiudad(){
         return listaFincas.stream()
                .collect(Collectors.groupingBy(Finca::getLocalidad,
                        HashMap::new,
                        Collectors.toList()));

    }


    /**
     * List<String> getFincasMedio(): devuelve el nombre de todas las fincas entre 50 y 150 metros
     * cuadrados.
     */

    public List<String> getFincasMedio(){
        return listaFincas.stream()
                .filter(f -> f.getSuperficie() >= 50 && f.getSuperficie() <= 150)
                .map(Finca::getNombre)
                .collect(Collectors.toList());

    }




}

