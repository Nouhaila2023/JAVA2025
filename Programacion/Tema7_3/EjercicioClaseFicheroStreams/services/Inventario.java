package Tema7_3.EjercicioClaseFicheroStreams.services;

import Tema7_3.EjercicioClaseFicheroStreams.enumes.Departamento;
import Tema7_3.EjercicioClaseFicheroStreams.enumes.Estado;
import Tema7_3.EjercicioClaseFicheroStreams.models.Material;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Inventario {

    /**
     * Atrinbutos
     */
    private Set<Material> material;

    /**
     * Construcot
     */
    public Inventario() {
        this.material = new HashSet<>();
    }

    /**
     * Metodo para aladir al inventario un producto en una localizacion
     */
    public void addMaterial(Material material) {
        this.material.add(material);
    }

    /**
     * Metodos de Streams -->
     */

    /**
     * Mostrar todos los materiales agupados por localizacion
     */
    public void materialPorLocalizacion(){
        material.stream()
                .collect(Collectors.groupingBy(Material::getLocalizacion))
                .forEach((localizacion, localizaciones) -> {
                    System.out.println("Localizacion: " + localizacion.getNombre());
                    material.forEach(System.out::println);
                });
    }

    /**
     * Mostar todos los materiales agrupaad por departementos
     */
    public void materialPorDepartmanento(){
        material.stream()
                .collect(Collectors.groupingBy(Material::getDepartamento))
                .forEach((d,m) -> {
                    System.out.println("Departamento: " + d);
                    m.forEach(System.out::println);
                });
    }

    /**
     * Mostrar todos los materiales agrupados por estado
     * mostrando la cantidad que hay de cada una
     */

    public void materialPorEstado(){
        material.stream()
                .collect(Collectors.groupingBy(Material::getEstado, Collectors.counting()))
                .forEach((e,count) -> {
                    System.out.println("Estado: " + e + " count: " + count);

                });
    }

    /**
     * Generar una lista con todos los materiales del departamento de
     * informática que estén para tirar a la basura, mostrando su
     * localización.
     */

    public void materialDepartamentoEstado(){
        List<Material> basuraInformatica = material.stream()
                .filter(m -> m.getDepartamento() == Departamento.INFORMATICA && m.getEstado() == Estado.BASURA)
                .toList();

        basuraInformatica.forEach(m -> {
            System.out.println("Material: " + m.getNombre() + ", Localización: " + m.getLocalizacion().getNombre());
        });

    }










}
