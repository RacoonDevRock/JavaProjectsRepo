package structure_data.Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("De que tamaño sera el arreglo? ");
        int tamanio = s.nextInt();

        int[] array = new int[tamanio];
        // int[] array = { 3, 1, 7, 2, 98,32 };

        for (int i = 0; i < tamanio; i++) {
            System.out.print("Dato n°" + (i + 1) + ": ");
            array[i] = s.nextInt();
        }

        for (int i = 0; i < array.length / 2; i++) {
            // creamos una variable temporal, la cual almacenara el valor de la primera posicion del arreglo
            int aux = array[i]; 

            // luego el primer valor tomara el valor del arreglo en la posicion, (array.length - i - 1)
            array[i] = array[array.length - i - 1]; 

            // por ultimo el valor de la posición (array.length - i - 1) toma el valor de la variable temporal
            array[array.length - i - 1] = aux;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        s.close();
    }
}
