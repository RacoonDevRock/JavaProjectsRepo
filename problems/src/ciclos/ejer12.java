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
public class ejer12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int contador = 1, numero, factorial = 1;
        
        System.out.print("Ingrese el numero: ");
        numero = s.nextInt();
        
        while (contador < numero) {            
            contador++;
            factorial *= contador;
        }
        
        System.out.println("Su factorial es: "+factorial);
        
    }
}
