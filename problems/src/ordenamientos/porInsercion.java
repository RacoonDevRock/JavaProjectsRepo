/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamientos;

import java.util.Scanner;

/**
 *
 * @author LUIS
 */
import java.util.Scanner;
public class porInsercion  {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ingrese cantidad de numeros: ");
        int n = s.nextInt(); // Lee la cantidad de números a ingresar
        
        int[] list = new int[n]; // Crea un arreglo de tamaño 'n' para almacenar los números
        
        for (int i = 0; i < list.length; i++) {
            System.out.print("Ingrese numero: ");
            list[i] = s.nextInt(); // Lee y almacena los números en el arreglo
        }
        
        // ORDENAMIENTO POR INSERCIÓN
        for (int i = 0; i < list.length; i++) { // Bucle principal para iterar a través del arreglo
            int posicion = i; // Almacena la posición actual
            int temp = list[i]; // Almacena el valor actual en 'temp'
            
            // Desplaza los elementos mayores que 'temp' a la derecha
            while ((posicion > 0) && (list[posicion - 1] > temp)) { 
                list[posicion] = list[posicion - 1]; // Desplaza los elementos hacia la derecha
                posicion--; // Mueve la posición hacia la izquierda
            }
            
            list[posicion] = temp; // Inserta 'temp' en la posición correcta
        }
        
        // Imprime el arreglo ordenado de manera ascendente
        System.out.println("\nArreglo ordenado de manera ascendente:");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        
        // Imprime el arreglo ordenado de manera descendente
        System.out.println("\nArreglo ordenado de manera descendente:");
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }
}

