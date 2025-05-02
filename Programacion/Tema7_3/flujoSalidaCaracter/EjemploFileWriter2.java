package Tema7_3.flujoSalidaCaracter;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.UUID;

public class EjemploFileWriter2 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista.add(UUID.randomUUID().toString());
        }

        try {
            PrintWriter pw = new PrintWriter(new PrintWriter("practica/prueva3.txt"));
            lista.forEach(pw::println);
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
