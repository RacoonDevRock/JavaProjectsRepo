/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author LUIS
 */
public class suma3Notas {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //Almacenamos las 3 notas ingresadas
        System.out.println("Enter three notes...");
        System.out.print("Enter the first note: ");
        float note1 = s.nextFloat();
        
        System.out.print("Enter the second note: ");
        float note2 = s.nextFloat();
        
        System.out.print("Enter the first note: ");
        float note3 = s.nextFloat();
        
        //Calculo de suma sobre las 3 notas
        float suma = note1 + note2 + note3;
        
        System.out.println("La suma de todas las notas es: " + suma);
        
    }
    
}
