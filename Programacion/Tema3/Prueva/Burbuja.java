package Tema3.Prueva;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Burbuja {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arreglo[], nElementos, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Dime la cantidad del alementos del areglo"));

        arreglo = new int[nElementos];

        for (int i = 0; i < nElementos; i++) {
            System.out.println((i + 1) + " Digito un numero: ");
            arreglo[i] = sc.nextInt();
        }

        for (int i = 0; i < nElementos - 1; i++) {
            for (int j = 0; j < nElementos - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {// Si numero Actual > numero Sigente
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        System.out.println("\nArreglo ordenado");
        for (int i = nElementos - 1; i < 0; i--) {
            System.out.println(arreglo[i] + " - ");
        }

    }

}
