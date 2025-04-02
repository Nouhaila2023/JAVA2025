package Tema7.repasoColecciones.priorityQueue;

public class Task {

    private Integer priority;
    private String descripcion;

    public Task(Integer priority, String descripcion) {
        this.priority = priority;
        this.descripcion = descripcion;
    }


    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Task{");
        sb.append("priority=").append(priority);
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
