package Introduccion.ciclos;

import java.util.Scanner;

public class cicloDoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ingrese numero mayor: ");
        int numero = s.nextInt();
        
        do {            
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero--;
        } while (numero >= 1);

        s.close();
        
    }
}
