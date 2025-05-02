/*package Tema7_3.crearPDF;

import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.File;

public class PDF {

    public class CrearPDF {
        public static <PdfWriter, PdfDocument, Document> void main(String[] args) {
            try {
                // Ruta donde guardar el PDF
                String carpeta = "pdfs";
                File directorio = new File(carpeta);
                if (!directorio.exists()) {
                    directorio.mkdirs(); // Crear carpeta si no existe
                }

                String destino = carpeta + "/archivo_generado.pdf";

                // Crear PDF
                PdfWriter writer = new PdfWriter(destino);
                PdfDocument pdf = new PdfDocument(writer);
                Document document = new Document(pdf);

                document.add(new Paragraph("Hola mundo desde un PDF en IntelliJ!"));
                document.close();

                System.out.println("PDF creado exitosamente en: " + destino);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
*/