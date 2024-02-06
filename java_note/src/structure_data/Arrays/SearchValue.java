package structure_data.Arrays;

import java.util.Scanner;

public class SearchValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("De que tamaño sera el arreglo? ");
        int tamanio = s.nextInt();
        int[] array = new int[tamanio];

        for (int i = 0; i < tamanio; i++) {
            System.out.print("Posicion n°" + i + ": ");
            array[i] = s.nextInt();
        }

        System.out.println("Posicion entre 0 y " + (array.length - 1));

        System.out.print("Posicion que desea? ");
        int n = s.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (i == n) {
                System.out.println(array[i]);
            }
        }

        s.close();
    }
}
