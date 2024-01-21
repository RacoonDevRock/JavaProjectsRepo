package Introduccion.ciclos;

import java.util.Scanner;

public class cicloWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        
        System.out.print("Ingrese un numero tope: ");
        int number = s.nextInt();
        
        while (i <= number) {            
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        s.close();
        
    }
}
