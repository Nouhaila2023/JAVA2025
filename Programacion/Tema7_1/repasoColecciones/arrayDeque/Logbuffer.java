package Tema7_1.repasoColecciones.arrayDeque;

import java.util.ArrayDeque;

/**
 * bamos guardando mensajes de log en el buffer
 * Cuando superamos la capacidad, borramos el premero log que se inserto
 * asi siempre tenemos un buffer del tamaño elegido con los utilizar log
 */
public class Logbuffer {
    /**
     *Atributos
     */

    private ArrayDeque<String> logs;
    private Integer capasidad;

    public Logbuffer(Integer capasidad) {
        this.capasidad = capasidad;
        this.logs = new ArrayDeque<>(capasidad);
    }



    public Integer getCapasidad(){
        return this.capasidad;
    }

    public Integer getLongSize(){
        return this.logs.size();
    }

    /**
     * si el tamaño acacidad en menos que la capacidad se añade el log nuevo
     * si el tamaño actual es igual wue la capacidad
     */
    public void addLog(String log){
        if (this.capasidad>this.getLongSize()){
            this.logs.add(log);
        }else {
            this.logs.removeFirst();
            this.logs.add(log);
        }

    }


    public void showLogs(){
        for (String log: logs){
            System.out.println(log);
        }
    }

}
