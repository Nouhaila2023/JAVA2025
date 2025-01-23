package Tema5.Practica.Rectangulo;

public class EjemploClonacion {
    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(1.1 ,1.2);
        Rectangulo r2 = new Rectangulo(r1);//Usamos el constructor copia

        if (r1 == r2){
            System.out.println("Sun iguales con el (=)");
        }else {
            System.out.println("Sun diferentes con el (=)");
        }

        if (r1.equals(r2)){
            System.out.println("Sun iguales con el (.equals)");
        }else{
            System.out.println("Sun diferentes con el (.equals)");
        }

        Rectangulo r3 = r2;//Intentar no hacerlo
        // r3 y r2 apuntan al mismo objeto en la memoria
        //Si cambia r3 se cambia r2

        // r3.setAncho(2.3);
        if (r3 == r2){
            System.out.println("Iquales");
        }else {
            System.out.println("Diferentes");
        }

        r1 =  null;//Liberar un objeto -> el recolector de basura liberia la memoris

        Object o = new Object();
        System.out.println(o.toString());

        ////////////////////////////////////////

        Rectangulo r4 = new Rectangulo(10,8);
        r4.decrementAlto()
                .incrementarAlto()
                .incrementarAlto();
        System.out.println(r4);




    }
}
