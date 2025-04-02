package Tema7.repasoColecciones.priorityQueue;

public class App {
    public static void main(String[] args) {

        PendingTasks pt = new PendingTasks();

        pt.addTas(new Task(1,"Estudiar Programacion"));
        pt.addTas(new Task(2,"Estudiar MysQl"));
        pt.addTas(new Task(3,"Estudiar Sistema Informatica"));
        System.out.println("Pentar tarias");
        pt.show();

        System.out.println("Eliminar tarias:");
        while (true){
            Task t = pt.viewHigherPeriorityTask();

            if(t==null){
                break;}
            System.out.println(t);

        }


    }
}
