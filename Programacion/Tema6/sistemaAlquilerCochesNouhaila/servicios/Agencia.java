package Tema6.sistemaAlquilerCochesNouhaila.servicios;

import Tema6.sistemaAlquilerCochesNouhaila.entidades.Cliente;
import Tema6.sistemaAlquilerCochesNouhaila.entidades.Coche;
import Tema6.sistemaAlquilerCochesNouhaila.entidades.exception.NoHayCochesDisponibles;
import Tema6.sistemaAlquilerCochesNouhaila.entidades.enums.TipoCoche;

import java.time.LocalDate;
import java.util.ArrayList;

public class Agencia {
    /**
     * Atributos
     */
    private ArrayList<Coche> coches;
    private ArrayList<Alquiler> alquilers;

    /**
     * Constructor
     */
    public Agencia() {
        this.coches = new ArrayList<>();
        this.alquilers = new ArrayList<>();
    }

    /**
     * addCoche
     */
    public void addCoche(Coche coche){
        if (!coches.contains(coche)){
            coches.add(coche);
        }
    }

    /**
     * removeCoche
     */
    public void removeCoche(Coche coche){
        if (coches.contains(coche)){
            coches.remove(coche);
        }
    }

    /**
     * Listar Coches Desponibles
     */
    public void listarCochesDesponibles(){
        for (Coche coche : coches){
            if (coche.isDisponible()){
                System.out.println("Los Coches Despunibles En Este Momento Son:");
                System.out.println(coche);
            }
        }
    }

    /**
     * Buscar Coche Dispunible
     */
    public void buscarCochesDisponibles(TipoCoche coche){
        if (TipoCoche.SUV.equals(coche) || TipoCoche.SEDAN.equals(coche) ||
                TipoCoche.DEPORTIVO.equals(coche) || TipoCoche.FURGONETA.equals(coche)){
            System.out.println("El tipo " + TipoCoche.SUV + " Es Dispomible");
        } else {
            throw new NoHayCochesDisponibles("No hay Coches Dispunible");
        }
    }

    /**
     * RealizarAlquiler
     */
    public boolean relalizarAlquiler(Cliente cliente, TipoCoche tipoCoche, LocalDate fechaI, LocalDate fechf){

        for (Alquiler alquile : alquilers){
            //Comprueba que existe un coche disponible de tipo solicitado
            buscarCochesDisponibles(tipoCoche);

            /**si hay el tipo que quieres
             * creamos un objeto Alquiler para ese coche
             * actualizar --> disponible = false + añadirla a metodo alquilado
             */

            for (Coche c : coches){
                c.setDisponible(false);
                Alquiler alquiler = new Alquiler(cliente, fechaI, fechf ,coches);

            }
            return true;
        }

        return false;
    }

    /**
     * ListarAlquileresActuales
     */
    public void listarAlquileresActuales(){

        for (Alquiler alquiler : alquilers){
            LocalDate hoy = LocalDate.now();
            if (alquiler.getFechaFin().isAfter(hoy)){
                System.out.println("Correcto");
            }
            else {
                System.out.println("La fecha final no es mayur que la fecha de hoy");
            }

        }
    }

    /**
     * Mostrar ingreso
     */
    public void mostrarIngreso(){
        double total = 0;
        for (Coche coche : coches){
            total += coche.getPrecioBase();
        }

    }



    /**
     * Getter
     */
    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public ArrayList<Alquiler> getAlquilers() {
        return alquilers;
    }
}
