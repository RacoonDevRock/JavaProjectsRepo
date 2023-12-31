/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author LUIS
 */
public class ejer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tabla = new int[10];

        // Leer 8 números enteros
        System.out.println("Ingrese 8 numeros enteros:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            tabla[i] = scanner.nextInt();
        }

        // Mostrar la tabla antes de la inserción
        System.out.println("\nTabla antes de la insercion:");
        for (int num : tabla) {
            System.out.print(num + " ");
        }

        // Pedir número y posición para insertar
        System.out.print("\n\nIngrese un numero para insertar: ");
        int numeroInsertar = scanner.nextInt();

        System.out.print("Ingrese la posicion donde desea insertarlo (entre 1 y 10): ");
        int posicion = scanner.nextInt();

        // Verificar si la posición es válida
        if (posicion < 1 || posicion > 10) {
            System.out.println("Posicion invalida. Debe ser entre 1 y 10.");
        } else {
            // Desplazar los elementos hacia la derecha para hacer espacio para el nuevo número
            for (int i = 8; i >= posicion - 1; i--) {
                tabla[i + 1] = tabla[i];
            }

            // Insertar el número en la posición indicada
            tabla[posicion - 1] = numeroInsertar;

            // Mostrar la tabla después de la inserción
            System.out.println("\nTabla despues de la insercion:");
            for (int num : tabla) {
                System.out.print(num + " ");
            }
        }
    }
}
