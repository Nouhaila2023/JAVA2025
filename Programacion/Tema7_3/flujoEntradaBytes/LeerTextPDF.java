package Tema7_3.flujoEntradaBytes;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class LeerTextPDF {

    public static void main(String[] args) {

        try {
            //Abrir el pdf
            PDDocument document = PDDocument.load(new File("practica/pruevaPDF.pdf"));

            //Pentar el texto
            PDFTextStripper stripper = new PDFTextStripper();
            String texto = stripper.getText(document);
            System.out.println(texto);

            document.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
