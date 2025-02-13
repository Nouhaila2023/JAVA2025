package Tema5.EjercicioPOO.Ejercicio6;
import java.util.ArrayList;

public class Agenda {

    //Una agenda de contactos esta formada por una lista de contactos
    private ArrayList<Contacto> contactos;

    //Constructor
    public Agenda(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    //Setter and getter
    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Agenda{");
        sb.append("contactos=").append(contactos);
        sb.append('}');
        return sb.toString();
    }

    //Los metodos de la agenda seran los siguientes

    //--> existeContacto(Contacto c): indica si el contacto pasado existe o no
    public boolean existeContacto(Contacto c) {
        if (contactos.contains(c)) {
            System.out.println("Este contacto existe");
            return true;
        } else
            System.out.println("No existe esta contacto");
        return false;

    }




}
