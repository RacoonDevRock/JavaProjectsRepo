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
public class ejer1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double resultado = 0, number;
        
        System.out.print("Ingrese un numero: ");
        number = s.nextDouble();
            
        while (number >= 0) {
            resultado = Math.pow(number,2);
            System.out.println(" --> El cuadrado es: "+resultado);
            
            System.out.print("Ingrese un numero: ");
            number = s.nextDouble();
        }
        
    }
}
