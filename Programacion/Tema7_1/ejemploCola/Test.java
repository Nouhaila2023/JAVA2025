package Tema7_1.ejemploCola;

public class Test {
    public static void main(String[] args) {


        //Cola de procesos


        Cola<Proceso> procesos = new Cola<>();


        procesos.insertar(new Proceso(12, "htop", "/usr/bin/htop", 3));


        procesos.insertar(new Proceso(13, "firefox", "/usr/local/firefox/bin/firefox", 2));


        procesos.insertar(new Proceso(14, "intellij", "/usr/local/intellij/bin/ij", 3));


        System.out.println(procesos.mostrarElemento());


        Pila<Proceso> pila = new Pila<>();

        pila.push(new Proceso(12, "htop", "/usr/bin/htop", 3));


        pila.push(new Proceso(13, "firefox", "/usr/local/firefox/bin/firefox", 2));


        pila.push(new Proceso(14, "intellij", "/usr/local/intellij/bin/ij", 3));








    }

}
