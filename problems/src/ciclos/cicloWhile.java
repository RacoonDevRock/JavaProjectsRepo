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
    }
}
