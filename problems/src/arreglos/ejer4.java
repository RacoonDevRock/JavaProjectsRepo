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
public class ejer4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese numero: ");
            numeros[i] = s.nextInt();
        }
        
        for (int i = 0; i < numeros.length/2; i++) {
            System.out.println(numeros[i]);
            System.out.println(numeros[numeros.length-i-1]);
        }
        
        if (numeros.length % 2 != 0) {
            System.out.println(numeros[numeros.length/2]);
        }
    }
}
