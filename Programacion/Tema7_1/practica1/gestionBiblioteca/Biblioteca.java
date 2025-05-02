package Tema7_1.practica1.gestionBiblioteca;

import java.time.LocalDate;
import java.util.*;

public class Biblioteca {
    /**
     * Atributos
     */
    private HashMap<String, Libro> catalogo; //Almacenar libro por ISBN
    private HashMap<String, Usuario> usuarios;//Almacena usuarios por DNI
    private TreeMap<Usuario, HashSet<Prestamo>> prestamos;//Asocia cada usuario con un conjunto de perstamos
    private String nombreBiblioteca;
    private String direccion;
    private String telefono;
    private String email;

    /**
     * Metodos
     */

    /**
     * Constructor
     */
    public Biblioteca(String nombreBiblioteca, String direccion, String telefono, String email) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        catalogo = new HashMap<>();
        usuarios = new HashMap<>();
        prestamos = new TreeMap<>(Comparator.comparing(Usuario::getDNI));
    }

    /**
     * addLibro: para añadir libre al cataligo.
     * @param libro
     */
    public void addLibro(Libro libro) {
        if (!catalogo.containsKey(libro.getISBN())){
            catalogo.put(libro.getISBN() , libro);
        }
    }

    /**
     * addUsuario: para registrar un nuevo usuario
     */
    public void addUsuario(Usuario usuario) {
        if (!usuarios.containsKey(usuario.getDNI())){
            usuarios.put(usuario.getDNI() , usuario);
        }
    }

    /**
     * esLibroDisponible: se debe recorrer todos los prestamos de todos
     * los isiarioa (values), y ver si de algun prestamo activo coincide el libro
     */
    private boolean esLibroDisponible(String isbn) {

        Libro libro = catalogo.get(isbn);
        if (libro == null){
            return false;
        }

        for (Prestamo prestamo : prestamos.get(libro)) {
            if (prestamo.estaActivo() && prestamo.getLibro().getISBN().equals(isbn)){
                return true;
            }
        }

        return false;
    }

    /**
     * prestarLibro(String dni, String isbn), que crea un nuevo préstamo si el libro está
     * disponible.
     */

    public void prestarLibro(String dni, String isbn) {
        if (!catalogo.containsKey(isbn)){
            System.out.println("No esta desponible el libro");
            return;
        }
        if (!usuarios.containsKey(dni)){
            System.out.println("No esta desponible el usuario");
            return;
        }

        if(!esLibroDisponible(isbn)){
            System.out.println("El libro no se puede esta presado");
            return;
        }

        Libro libro = catalogo.get(isbn);
        Usuario usuario = usuarios.get(dni);

        Prestamo prestamo = new Prestamo(usuario, libro, LocalDate.now());

        if (!prestamos.containsKey(usuario)){
            HashSet<Prestamo> nuevo = new HashSet<>();
            nuevo.add(prestamo);
            prestamos.put(usuario, nuevo);
        }else {
            HashSet<Prestamo> nuevo = prestamos.get(usuario);
            nuevo.add(prestamo);
        }

    }

    /**
     * devolverLibro(String dni, String isbn), que marca el libro como devuelto si existe
     * un préstamo activo
     */

    public void devolverLibro(String isbn, String dni) {

        if (!catalogo.containsKey(isbn)){
            System.out.println("No esta desponible el libro");
            return;
        }
        if (!usuarios.containsKey(dni)){
            System.out.println("No esta desponible el usuario");
            return;
        }

        Usuario usuario = usuarios.get(dni);
        Libro libro = catalogo.get(isbn);

        for (Prestamo p : prestamos.get(usuario)){
            if (p.getLibro().equals(libro) && p.estaActivo()){
                p.devolverLibro();
                System.out.println("Devolver libro");
                return;
            }
        }

        System.out.println("No se encontrodo");
    }



    /**
     * buscarPrestamosUsuario: que devuelve todos los libros
     * que ha pedido prestados un usuario
     */

    public void buscarPrestamosUsuario(String dni){

        if (!catalogo.containsKey(dni)){
            System.out.println("No encuntra este usuario");
            return;
        }

        if (!prestamos.containsKey(usuarios.get(dni))){
            System.out.println("El usuario no tiene prestamos:");
            return;
        }

        System.out.println("Prestamos del usuario:");
        for (Prestamo p : prestamos.get(usuarios.get(dni))){
            System.out.println(p);
        }

    }

    /**
     * listarLibrosDisponibles(), que muestra todos los libros no prestados.
     */
    public void listarLibrosDisponible(){

        for (Libro l : catalogo.values()){
            if (esLibroDisponible(l.getISBN())){
                System.out.println(l);
            }
        }

    }


    /**
     * Getter Setter
     */

    public HashMap<String, Libro> getCatalogo() {
        return catalogo;
    }

    public HashMap<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public TreeMap<Usuario, HashSet<Prestamo>> getPrestamos() {
        return prestamos;
    }


    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }

    public Biblioteca setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public Biblioteca setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public String getTelefono() {
        return telefono;
    }

    public Biblioteca setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Biblioteca setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Biblioteca{");
        sb.append("catalogo=").append(catalogo);
        sb.append(", usuarios=").append(usuarios);
        sb.append(", prestamos=").append(prestamos);
        sb.append(", nombreBiblioteca='").append(nombreBiblioteca).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }


    /**
     * equals con numbre de biblioteca
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca that = (Biblioteca) o;
        return Objects.equals(nombreBiblioteca, that.nombreBiblioteca);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombreBiblioteca);
    }
}
