package arreglos;

import java.util.Scanner;

public class ejer13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] a = new int[10];
        int conteoPar = 0, conteoImpar = 0;
        
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese numero("+(i+1)+"): ");
            a[i] = s.nextInt();
            if (a[i] % 2 == 0) {
                conteoPar++;
            } else {
                conteoImpar++;
            }
        }
        
        int[] par = new int[conteoPar];
        int[] impar = new int[conteoImpar];
        
        conteoPar = 0;
        conteoImpar = 0;
        
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) {
                par[conteoPar] = a[i];
                conteoPar++;
            } else if (a[i] % 2 != 0) {
               impar[conteoImpar] = a[i];
               conteoImpar++; 
            }
        }
        
        System.out.println("\nTABLA PARES");
        for (int i = 0; i < par.length; i++) {
            System.out.println(par[i]);
        }
        
        System.out.println("\nTABLA IMPARES");
        for (int i = 0; i < impar.length; i++) {
            System.out.println(impar[i]);
        }
        
        s.close();
        
    }
}
