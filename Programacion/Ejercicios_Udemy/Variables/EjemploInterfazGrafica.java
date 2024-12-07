package Ejercicios_Udemy.Variables;

import javax.swing.*;

public class EjemploInterfazGrafica {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo con System.exit(0)");

        // Botón para salir
        JButton salirBoton = new JButton("Nouhaila");
        salirBoton.addActionListener(e -> {
            System.out.println("Saliendo del programa...");
            System.exit(0);  // Finaliza el programa al hacer clic en el botón
        });

        frame.add(salirBoton);
        frame.setSize(200, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
