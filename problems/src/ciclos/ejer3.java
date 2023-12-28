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
public class ejer3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero;
        
        do {  
            System.out.print("Ingrese un numero: ");
            numero = s.nextInt();
            
            if (numero == 0) {
                System.out.println("FIN DEL PROGRAMA...");
            } else if (numero % 2 == 0) {
                System.out.println("El numero es PAR");
            } else if (numero % 2 != 0) {
                System.out.println("El numero es IMPAR");
            }
        } while (numero != 0);
        
    }
}
