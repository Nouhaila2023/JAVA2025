package Tema7.repasoColecciones.treeMap;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {

        AgendaCita ac = new AgendaCita();

        ac.addCita("A",LocalDateTime.of(2025,4,3,12,3) );
        ac.addCita("B",LocalDateTime.of(2025,6,3,12,3) );
        ac.addCita("C",LocalDateTime.of(2025,5,3,10,3) );
        ac.addCita("D",LocalDateTime.of(2025,5,3,12,3) );

        ac.mostrarProximaCita();

    }
}
