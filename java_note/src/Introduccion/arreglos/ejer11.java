package Introduccion.arreglos;

import java.util.Scanner;

public class ejer11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] a = new int[10];
        boolean creciente = true;
        int numero, sitio_num=0, j=0;
        
        do {            
            for (int i = 0; i < (a.length/2); i++) {       
                System.out.print("Ingrese numero "+(i+1)+": ");
                a[i] = s.nextInt();
            }
            
//            COMPROBAR SI EL ARREGLO ESTA ORDENDA-CRECIENTE
            for (int i = 0; i < ((a.length/2)-1); i++) {
                if (a[i] < a[i+1]) {
                    creciente = true;
                }
                if (a[i] > a[i+1]) {
                    creciente = false;
                    break;
                }
            }
            
            if (creciente == false) {
                System.out.println("No ordenado-creciente, intente nuevamente");
            }
            
        } while (creciente == false);
        
        System.out.print("\nIngrese numero: ");
        numero = s.nextInt();
        
        while (a[j] < numero && j < 5) {            
            sitio_num++;
            j++;
        }
        
//        MOVEMOS UNA POSICION EN EL ARREGLO A LOS ELEMENTOS QUE VAN DETRAS DE NUMERO
        for (int i = ((a.length/2)-1); i >= sitio_num ; i--) {
            a[i+1] = a[i];
        }
        
        a[sitio_num] = numero;
        
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
        s.close();
        
    }
}
