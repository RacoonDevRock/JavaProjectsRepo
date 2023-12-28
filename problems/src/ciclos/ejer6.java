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
public class ejer6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int numero = 0, conteo = 0;
        
        do {            
            System.out.print("Ingrese numero: ");
            numero = s.nextInt();
            
            conteo += numero;
            
        } while (numero != 0);
        
        System.out.println("La suma de los numero es: "+conteo);
        
    }
}
