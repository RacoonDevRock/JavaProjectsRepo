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
public class ejer10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("INGRESE 10 NUMEROS...");
        int contador = 0, suma = 0, numero = 0;
                
        while (contador < 10) {   
            System.out.print("Ingrese numero: ");
            numero = s.nextInt();         
            suma += numero;
            contador++;
        }
        
        System.out.println("La suma total es: "+suma);
    }
}
