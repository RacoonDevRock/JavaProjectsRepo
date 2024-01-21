package Introduccion.arreglos;

import java.util.Scanner;

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

        s.close();
        
    }
}
