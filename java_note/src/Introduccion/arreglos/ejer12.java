package Introduccion.arreglos;

import java.util.Scanner;

public class ejer12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] a = new int[10];
        int posicion;
        
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese numero: ");
            a[i] = s.nextInt();
        }
        
        do {            
            System.out.print("\nIngrese una posicion a eliminar (0-9): ");
            posicion = s.nextInt();
        } while (posicion < 0 || posicion > 9);
        
        for (int i = 0; i < a.length; i++) {
            if (posicion == i) {
                a[i] = 0;
            }
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
        s.close();
        
    }
}
