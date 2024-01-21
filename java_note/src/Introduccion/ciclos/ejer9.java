package Introduccion.ciclos;

import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
////        WHILE
        int contador = 100;
        while(contador >= 0) {
            System.out.println(contador);
            contador -= 7;
        }

//      FOR
        for (int i = 100; i >= 0; i -= 7) {
            System.out.println(i);
        }

        s.close();
        
    }
}
