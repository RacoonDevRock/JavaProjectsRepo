package arreglos;

import java.util.Scanner;

public class arreglos {
    public static void main(String[] args) {
        int nElementos;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ingrese cantidad elementos del arreglo: ");
        nElementos = s.nextInt();
        
        char[] letras = new char[nElementos];
        
        for (int i = 0; i < nElementos; i++) {
            System.out.print(" Ingrese un caracter: ");
            letras[i] = s.next().charAt(0);
        }
        System.out.println("\nLos caracteres del arreglo son: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(letras[i]);
        }

        s.close();
        
    }
}
