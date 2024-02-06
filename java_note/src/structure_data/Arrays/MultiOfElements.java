package structure_data.Arrays;

import java.util.Scanner;

public class MultiOfElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("De que tamaño sera el arreglo? ");
        int tamanio = s.nextInt();

        int[] array = new int[tamanio];

        for (int i = 0; i < tamanio; i++) {
            System.out.print("Dato n°" + (i + 1) + ": ");
            array[i] = s.nextInt();
        }

        int multi = 1;
        for (int i = 0; i < array.length; i++) {
            multi *= array[i];
        }
        System.out.println("\nMultiplicacion: " + multi);

        s.close();
    }   
}
