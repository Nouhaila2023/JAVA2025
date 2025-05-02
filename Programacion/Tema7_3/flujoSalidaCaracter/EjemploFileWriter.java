package Tema7_3.flujoSalidaCaracter;

import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileWriter {
    public static void main(String[] args) {

        FileWriter fw = null;
        try {
            fw = new FileWriter("practica/prueva2.txt");
            fw.write("Hola mundo\nA Ver");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
