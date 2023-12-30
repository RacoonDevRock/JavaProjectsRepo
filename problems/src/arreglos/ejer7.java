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
public class ejer7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arra = new int[10];
        boolean creciente = false, decreciente = false;
        
        for (int i = 0; i < arra.length; i++) {
            System.out.print("Ingrese numero: ");
            arra[i] = s.nextInt();
        }
        
        for (int i = 0; i < arra.length-1; i++) {
            if (arra[i] < arra[i+1]) {
                creciente = true;
            }
            if (arra[i] > arra[i+1]) {
                decreciente = true;
            }
        }
        
        if (creciente == true && decreciente == false) {
            System.out.println("La serie es CRECIENTE");
        } else if (creciente == false && decreciente == true) {
            System.out.println("La serie es DECRECIENTE");
        } else if (creciente == true && decreciente == true) {
            System.out.println("La serie esta DESORDENADA");
        } else if (creciente == false && decreciente == false) {
            System.out.println("Los numeros de la serie son IGUALES");
        }
        
    }
}
