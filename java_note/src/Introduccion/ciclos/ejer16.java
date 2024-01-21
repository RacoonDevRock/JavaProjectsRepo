package Introduccion.ciclos;

import java.util.Scanner;

public class ejer16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int numero=0, resultado;
        
        do {            
            System.out.print("Ingrese numero (0-10): ");
            numero = s.nextInt();
        } while ((numero < 0) || (numero > 10));
        
        System.out.println("LA TABLA DE MULTIPLCAR DE DICHO NUMERO 1-12");
        
        for (int i = 1; i <= 12; i++) {
            resultado = i * numero;
            System.out.println(i+" * "+numero+" = "+resultado);
        }

        s.close();
        
    }
}
