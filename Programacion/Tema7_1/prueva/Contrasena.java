package Tema7_1.prueva;
import java.security.SecureRandom;
public class Contrasena {

        // Método para generar una contraseña segura
        public static String generarContraseña() {
            // Definir los caracteres permitidos en la contraseña
            String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
            SecureRandom random = new SecureRandom();
            StringBuilder contrasena = new StringBuilder();

            // Generar la contraseña de la longitud solicitada
            for (int i = 0; i < 8; i++) {
                int indice = random.nextInt(caracteres.length());
                contrasena.append(caracteres.charAt(indice));
            }

            return contrasena.toString();
        }

        public static void main(String[] args) {
            // Generar una contraseña de 12 caracteres
            String contrasenaSegura = generarContraseña();
            System.out.println("Contraseña generada: " + contrasenaSegura);
        }


}
