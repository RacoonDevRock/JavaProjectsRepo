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
public class ejer2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double numero;
        
        do {  
            System.out.print("Ingrese un numero: ");
            numero = s.nextDouble();
            
            if (numero > 0.0) {
                System.out.println("El numero es POSITIVO");
            } else if (numero < 0.0) {
                System.out.println("El numero es NEGATIVO");
            } else {
                System.out.println("FIN DEL PROGRAMA...");
            }
        } while (numero != 0.0);
        
    }
}
