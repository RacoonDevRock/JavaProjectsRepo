package Introduccion.arreglos;

import java.util.Scanner;

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

        s.close();
        
    }
}
