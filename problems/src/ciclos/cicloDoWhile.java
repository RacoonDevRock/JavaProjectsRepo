/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author LUIS
 */
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
        
    }
}
