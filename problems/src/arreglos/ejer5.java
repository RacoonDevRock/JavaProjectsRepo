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
public class ejer5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[], b[], c[];
        
        a = new int[10];
        b = new int[10];
        c = new int[20];
        
        System.out.println("TABLA A");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }
        
        System.out.println("\nTABLA B");
        for (int i = 0; i < b.length; i++) {
            System.out.print("Ingrese un numero: ");
            b[i] = s.nextInt();
        }
        
        System.out.println("\nTABLA C");
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            c[j] = a[i];
            System.out.println((i+1)+" de A: "+c[j]);
            j++;
            c[j] = b[i];
            System.out.println((i+1)+" de B: "+c[j]);
            j++;
        }
    }
}
