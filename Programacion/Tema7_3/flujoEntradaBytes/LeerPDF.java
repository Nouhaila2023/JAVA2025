package Tema7_3.flujoEntradaBytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerPDF {
    public static void main(String[] args) {

        int c;

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("practica/pruevaPDF.pdf");

            int totalBytes = 0;
            while ((c = fis.read()) != -1){
                totalBytes++;
            }
            System.out.println("Total de bytes: " + totalBytes);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
