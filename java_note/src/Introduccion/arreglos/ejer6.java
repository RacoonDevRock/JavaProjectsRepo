package Introduccion.arreglos;

import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a, b, c;
        
        a = new int[12];
        b = new int[12];
        c = new int[a.length + b.length];
        
        System.out.println("TABLA A");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese numero: ");
            a[i] = s.nextInt();
        }
        
        System.out.println("TABLA B");
        for (int i = 0; i < b.length; i++) {
            System.out.print("Ingrese numero: ");
            b[i] = s.nextInt();
        }
        
        System.out.println("TABLA C");
        int j = 0;
        for (int i = 0; i < 12; i+=3) {
            c[j] = a[i];
            c[j+1] = a[i+1];
            c[j+2] = a[i+2];
            j += 3;
            
            c[j] = b[i];
            c[j+1] = b[i+1];
            c[j+2] = b[i+2];
            j += 3;
        }

        for (int i : c) {
            System.out.println(i);
        }

        s.close();
        
    }
}
