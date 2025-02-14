package Tema5.EjercicioPOO.Ejercicio6;

import java.util.List;

public class agenda {

    private List<Contacto> listaContactos;

    //Constructor
    public agenda(List<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public boolean existeContacto(Contacto c){
        for(Contacto contacto: listaContactos){
            if(contacto.equals(c)){
                System.out.println("si existe esta contacto");
                return true;
            }else {
                System.out.println("no existe esta contacto");
            }
        }
        return false;
    }

    public void addContacto(Contacto c){
        listaContactos.add(c);
    }





}
