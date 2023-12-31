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
public class metodoBurbuja {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ingrese cantidad de numeros: ");
        int n = s.nextInt();
        
        int[] list = new int[n];
        
        for (int i = 0; i < list.length; i++) {
            System.out.print("Ingrese numero: ");
            list[i] = s.nextInt();
        }
        
        for (int i = 0; i < list.length-1; i++) {       // sirve para identificar cuantas vueltas debe dar,iteraciones
            for (int j = 0; j < list.length-i-1; j++) { // sirve para ordenar el arreglo, junto al condicional
                if (list[j] > list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("");
        for (int i = list.length-1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }
}
