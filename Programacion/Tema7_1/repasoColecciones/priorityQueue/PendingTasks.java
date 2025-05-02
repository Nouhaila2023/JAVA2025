package Tema7_1.repasoColecciones.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PendingTasks {
    private PriorityQueue<Task> tasks;

    public PendingTasks() {
        tasks = new PriorityQueue<>(Comparator.comparing(Task::getPriority));
    }

    //añadir
    public boolean addTas(Task t){
        return tasks.offer(t);
    }

    //Sacar
    public Task viewHigherPeriorityTask(){
        return tasks.peek();
    }

    /**
     * remove
     * @return
     */
    public Task pollHigher(){
        return tasks.poll();
    }

    public void show(){
        //no le pone organisazo
        for (Task t : tasks){
            System.out.println(t);
        }
    }





}
