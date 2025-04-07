package Tema7.practica1.gestionBiblioteca;

public class App {
    public static void main(String[] args) {

    Biblioteca biblioteca = new Biblioteca("La Luna", "Calle Madrid", "612345678", "luna@gmail.com");

    for (int i = 0; i < 20; i++) {
        Libro libro = new Libro("ISBN" + i, "Titulo" + i, "Autor" + 1,"Genero" + i, 2010 + i);
        biblioteca.addLibro(libro);
    }

    for (int i = 0; i < 4; i++) {
        Usuario usuario = new Usuario()
                .setNombre("Usuario" + i)
                .setApellido("Apellido" + i)
                .setEmail("email" + i)
                .setDireccion("Direccion" + i)
                .setTelefono("Telefono" + i)
                .setEmail("usuario" + i+ "@gmail.com");
        biblioteca.addUsuario(usuario);
    }

        biblioteca.prestarLibro("DNI1", "ISBN1");
        biblioteca.prestarLibro("DNI1", "ISBN2");

        biblioteca.prestarLibro("DNI2", "ISBN3");
        biblioteca.prestarLibro("DNI2", "ISBN4");

        biblioteca.prestarLibro("DNI3", "ISBN5");
        biblioteca.prestarLibro("DNI3", "ISBN6");

        biblioteca.prestarLibro("DNI4", "ISBN7");
        biblioteca.prestarLibro("DNI4", "ISBN8");

        System.out.println("*-- Préstamos del usuario DNI1 --*");
        biblioteca.buscarPrestamosUsuario("DNI1");

        System.out.println("*-- Libros disponibles --*");
        biblioteca.listarLibrosDisponible();

    }
}
