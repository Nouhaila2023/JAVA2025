package Tema4.OpenWebinars.DiseñoClases;

import java.util.Arrays;
import java.util.Objects;

public class Rectangulo {

    private final int coord_X = 0;
    private final int coord_Y = 1;

    private double[] c1, c2, c3, c4;

    //Constructor vasio
    public Rectangulo() {
        c1 = new double[2];
        c2 = new double[2];
        c3 = new double[2];
        c4 = new double[2];
    }

    public Rectangulo(double[] c1, double[] c2, double[] c3, double[] c4) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangulo that = (Rectangulo) o;
        return coord_X == that.coord_X && coord_Y == that.coord_Y && Objects.deepEquals(c1, that.c1) && Objects.deepEquals(c2, that.c2) && Objects.deepEquals(c3, that.c3) && Objects.deepEquals(c4, that.c4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coord_X, coord_Y, Arrays.hashCode(c1), Arrays.hashCode(c2), Arrays.hashCode(c3), Arrays.hashCode(c4));
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rectangulo{");
        sb.append("c1=");
        if (c1 == null) sb.append("null");
        else {
            sb.append('[');
            for (int i = 0; i < c1.length; ++i)
                sb.append(i == 0 ? "" : ", ").append(c1[i]);
            sb.append(']');
        }
        sb.append(", c2=");
        if (c2 == null) sb.append("null");
        else {
            sb.append('[');
            for (int i = 0; i < c2.length; ++i)
                sb.append(i == 0 ? "" : ", ").append(c2[i]);
            sb.append(']');
        }
        sb.append(", c3=");
        if (c3 == null) sb.append("null");
        else {
            sb.append('[');
            for (int i = 0; i < c3.length; ++i)
                sb.append(i == 0 ? "" : ", ").append(c3[i]);
            sb.append(']');
        }
        sb.append(", c4=");
        if (c4 == null) sb.append("null");
        else {
            sb.append('[');
            for (int i = 0; i < c4.length; ++i)
                sb.append(i == 0 ? "" : ", ").append(c4[i]);
            sb.append(']');
        }
        sb.append('}');
        return sb.toString();
    }


    public double base(){
        return Math.abs(c3[coord_X] - c4[coord_X]);
    }

    public double altura(){
        return Math.abs(c3[coord_Y] - c2[coord_Y]);
    }

   /* public double debujar(char c){
       int base = (int) Math.round(base());
       int altura = (int) Math.round(altura());

       String pintar = " " + c;
        System.out.println(pintar.repeat(base));

        if (altura > 2){
            for (int i = 0; i < altura - 2; i++) {
                if(base > 2) {

               }
            }
        }
    }*/

}
