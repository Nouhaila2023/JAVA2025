package Tema7_3.flujoSalidaCaracter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EjemploPrintWriter {
    public static void main(String[] args) {

        //usamos cuando hay errores
        PrintWriter pw = new PrintWriter(System.err);
        pw.println("Hola Mundo");
        pw.println("Soy Nouhaila");
        //usamos el flush si queremos pintar algo despues antes del cerar
        pw.flush();
        pw.println("Hola Mundo");
        pw.close();

        try {

            pw = new PrintWriter("practica/prueva.txt");
            pw.println("Hola Mundo");
            pw.println("Soy Nouhaila");
            pw.printf("El valor de %s es %.4f", "PI", Math.PI);

            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            throw new RuntimeException(e);
        }


    }
}
