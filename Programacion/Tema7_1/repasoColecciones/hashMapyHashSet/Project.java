package Tema7_1.repasoColecciones.hashMapyHashSet;

import java.util.*;

public class Project {
    private UUID id;
    private String nombre;
    private Set<Employee> employeeSet;
    private Map<Employee, Set<Taks>> taskes;

    public Project(UUID id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.employeeSet = new HashSet<>(5);
        this.taskes = new  HashMap<>(5);
    }

    public boolean aad(Employee e){
        if (!this.employeeSet.contains(e)){
            this.employeeSet.add(e);
            this.taskes.put(e,new HashSet<>());
            return true;
        }else {
        return false;}
    }

    public boolean assignTask(Employee e ,Taks t){
        if (!employeeSet.contains(e)){
            return false;
        }
        else {
            taskes.get(e).add(t);
            return true;
        }
    }

    /**
     * Mostrar para cada empleado las dtarias que tiene asignado en el proyecto
     */
    public void showInfoProject(){
        for (Employee e : employeeSet){
            System.out.println(e);
            System.out.println("-------------");
            //Saco las tyaias del empleado e
            /*for ( t : taskes){
                System.out.println(t);
            }*/
            System.out.println("-------------");
        }
    }





    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }

    public Map<Employee, Set<Taks>> getTaskes() {
        return taskes;
    }

    public void setTaskes(Map<Employee, Set<Taks>> taskes) {
        this.taskes = taskes;
    }
}
