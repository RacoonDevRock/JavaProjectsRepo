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
public class ejer5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int numero, aleatorio, contador = 0;
        
        aleatorio = (int)(Math.random() * 100); // MATH.RANDOM() SOLO PROPORCIONA NUMERO DEL 0 AL 1, POR ELLO SE MULTIPLICA POR 100
        
//        System.out.println(aleatorio);
        
        System.out.println("ADIVINE EL NUMERO (0 - 100)");
        
        do {       
            System.out.print("Ingrese un numero: ");
            numero = s.nextInt();
            
            if (aleatorio > numero) {
                System.out.print("Es mayor, vueleve a intentarlo. ");
            } else if (aleatorio < numero) {
                System.out.print("Es menor, vueleve a intentarlo. ");
            }
            
            contador++;
            
        } while (numero != aleatorio);
        
        System.out.println("ADIVINASTE EL NUMERO");
        System.out.println("El numero de intentos fue: "+contador);
        
    }
}
