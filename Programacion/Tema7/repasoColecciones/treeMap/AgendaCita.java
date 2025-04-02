package Tema7.repasoColecciones.treeMap;

import java.time.LocalDateTime;
import java.util.TreeMap;

public class AgendaCita {

    TreeMap<LocalDateTime, String> citas;

    public AgendaCita() {
        this.citas = new TreeMap<>();//ordena por local date time por defectp
    }

    public boolean addCita(String desc, LocalDateTime fecha){
        if (fecha.isBefore(LocalDateTime.now())){
            return false;
        }

        //no deja añadir la cita
        if (this.citas.containsKey(fecha)){
            return false;
        }
        this.citas.put(fecha,desc);

        return true;
    }


    public void mostrarProximaCita(){
        for (LocalDateTime f : this.citas.keySet()){
            System.out.println(f + " --> " + this.citas.get(f));
        }

    }

    public String deleteCita(LocalDateTime fecha){
        return this.citas.remove(fecha);
    }


}
