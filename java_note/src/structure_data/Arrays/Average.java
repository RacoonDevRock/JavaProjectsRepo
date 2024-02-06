package structure_data.Arrays;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("De que tamaño sera el arreglo? ");
        int tamanio = s.nextInt();

        double array[] = new double[tamanio];

        for (int i = 0; i < tamanio; i++) {
            System.out.print("Dato n°" + (i + 1) + ": ");
            array[i] = s.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            // System.out.print(array[i]);
            sum += array[i];
        }
        System.out.println("\nSuma: " + (sum / tamanio));

        s.close();
    }
}
