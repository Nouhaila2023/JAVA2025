package Tema7_3.flujoEntradaCaracter;

import java.io.*;

public class EjemploCopiarFichero {
    public static void main(String[] args) {


        //Copiar el archivo en otro

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {

            br = new BufferedReader(new FileReader("practica/prueva.txt"));

            bw = new BufferedWriter(new FileWriter("practica/prueva2.txt"));

            String linea ;

            while ((linea = br.readLine()) != null) {
                //Para Leer el archivo
                bw.write(linea);
                //Para copiar el archivo
                bw.newLine();
            }

            br.close();
            bw.close();



        } catch (IOException e) {
            System.out.println("error");
            throw new RuntimeException(e);
        }


    }
}
