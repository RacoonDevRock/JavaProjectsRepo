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
public class ejer21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int numero;
        boolean negativo = false;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrse un numero: ");
            numero = s.nextInt();
            
            if (numero < 0) {
                negativo = true;
            }
            
        }
        
        if (negativo == true) {
            System.out.println("Se ha introducido un negativo a la lista");
        } else {
            System.out.println("No se ha introducido un negativo a la lista");
        }
        
    }
}
