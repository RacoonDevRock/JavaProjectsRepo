package structure_data.Arrays;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("De que tamaño sera el arreglo? ");
        int tamanio = s.nextInt();

        int[] array = new int[tamanio];

        for (int i = 0; i < tamanio; i++) {
            System.out.print("Dato n°" + (i + 1) + ": ");
            array[i] = s.nextInt();
        }

        int countPair = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countPair++;
            }
        }

        int[] arreglo = new int[countPair];

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                arreglo[count] = array[i];
                count++;
            }
        }

        System.out.print("\nNumeros positivo del arreglo: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

        s.close();
    }
}
