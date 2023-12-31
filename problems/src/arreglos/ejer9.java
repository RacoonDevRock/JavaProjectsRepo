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
public class ejer9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a[] = new int[10];
        int n;
        
        System.out.println("INGRESE 10 NUMEROS");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese numero: ");
            a[i] = s.nextInt();
        }
        
        System.out.println("Ingrese N posiciones a desplazar: ");
        n = s.nextInt();
        
        System.out.println("\nTABLA SUBE POSICION +"+n);
        for (int j = 0; j < n; j++) {
            int ultimo = a[a.length - 1];   // almacena ultimo valor en una variable temporal ultimo
        
            for (int i = a.length - 1; i > 0; i--) {    // aqui el valor de i es 9 ya que el ultimo valor, 
                                                        // de posicion 9 ya esta siendo almacenada en 'ultimo'
                a[i] = a[i - 1];
            }

            a[0] = ultimo;  // pone la variable temporal de valor ultimo en el arreglo como primero
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
