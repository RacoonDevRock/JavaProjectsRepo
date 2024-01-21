package Introduccion.arreglos;

import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("INGRESE 5 NUMEROS");
        
        int[] numeros = new int[5];
        
        for (int i = 0; i < numeros.length; i++) {       
            System.out.print("Ingrese el numero: ");
            numeros[i] = s.nextInt();
        }
        
        System.out.println("\nORDEN ORIGINAL");
        for (int numero : numeros) {
            System.out.println("Numero: "+numero);
        }
        
////        PRIMERA FORMA
        System.out.println("\nORDEN INVERSO");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Numero: "+numeros[i]);
        }
        

////        SEGUNDA FORMA
        int inicio = 0;
        int fin = numeros.length - 1;

        while (inicio < fin) {
            int temp = numeros[inicio];
            numeros[inicio] = numeros[fin];
            numeros[fin] = temp;
            inicio++;
            fin--;
        }
        System.out.println("\nORDEN INVERSO");
        for (float numero : numeros) {
            System.out.println("Numero: "+numero);
        }

        
////        TERCERA FORMA
        for (int i = 0; i < numeros.length/2; i++) {
            int a = numeros[i];
            numeros[i] = numeros[numeros.length - i - 1];
            numeros[numeros.length - i - 1] = a;
        }
        System.out.println("\nORDEN INVERSO");
        for (float numero : numeros) {
            System.out.println("Numero: "+numero);
        }

        
////        CUARTA FORMA
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[numeros.length-i-1]);
        }

        s.close();
        
    }
}
