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
public class ejer1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("INGRESE 5 NUMEROS");
        
        float[] numeros = new float[5];
        
        for (int i = 0; i < numeros.length; i++) {       
            System.out.print("Ingrese el numero: ");
            numeros[i] = s.nextFloat();
        }
        
        System.out.println("");
        
        for (float numero : numeros) {
            System.out.println("Numero: "+numero);
        }
    }
}
