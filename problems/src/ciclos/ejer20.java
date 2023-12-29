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
public class ejer20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n;
        double sueldo, sueldoMaximo = 0;
        
        System.out.print("INgrese cantidad de sueldos a calcular: ");
        n = s.nextInt();
        
        for (int i = 1; i <= n; i++) {
            do {                
                System.out.print("INgres sueldo: $");
                sueldo = s.nextDouble();
            } while (sueldo <= 0);
            
            if (sueldo > sueldoMaximo) {
                sueldoMaximo = sueldo;
            }
            
        }
        
        System.out.println("El sueldo maximo es: "+sueldoMaximo);
        
    }
}
