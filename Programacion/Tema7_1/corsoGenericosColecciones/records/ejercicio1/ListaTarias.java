package Tema7_1.corsoGenericosColecciones.records.ejercicio1;

import java.time.LocalDate;

public class ListaTarias {
    private Tarea[] listaTarias;
    private int cantidad;

    public ListaTarias(int cantidad) {
        listaTarias = new Tarea[cantidad];
        cantidad = 0;
    }





    public void mostrarTareasPrFecha(LocalDate f) {
        System.out.println("Tareas que vencen el  " + f + ": ");
        for (int i = 0; i < listaTarias.length; i++) {
            if (listaTarias[i].fechaInicio().equals(f)) {
                System.out.println(listaTarias[i]);
            }
        }
    }

    public void agagrigarTarias(Tarea tarea) {
        if (cantidad < listaTarias.length) {
            listaTarias[cantidad] = tarea;
            cantidad++;
        }else {
            System.out.println("La lista de tarias esta llena.");
        }
    }

    public void mostrarTareas() {
        for (int i = 0; i < listaTarias.length; i++) {
            System.out.println(listaTarias[i]);
        }
    }
}
