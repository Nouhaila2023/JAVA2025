package Ejercicios_Udemy.Operadores;

public class OperadoresAsignacion {
    public static void main(String[] args) {

        int i = 5;
        int j = i + 4;
        System.out.println("J=" + j);

        i += 2; // i = i + 2;
        System.out.println("I=" + i);

        i+= 5;
        System.out.println("I=" + i);

        j -= 4;
        System.out.println("J=" + j);

        j *= 3;
        System.out.println("J=" + j);

        String sqlString = "Select * from cliente as c";
        sqlString += " where c.nombre= 'Nouhaila' ";
        sqlString += " and c.activo=1";
        System.out.println("SQLstring: " + sqlString);


    }
}
