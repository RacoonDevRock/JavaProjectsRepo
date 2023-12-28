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
public class ejer4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero, contador = 1;
        
//        DO-WHILE
        do {
            System.out.print("Ingrese un numero: ");
            numero = s.nextInt();
            
            contador++;
        } while (numero > 0);
        System.out.println("Se han ingresado "+contador+" numero(s)");


//        WHILE
        while (true) {
            System.out.print("Ingrese un numero: ");
            numero = s.nextInt();

            if (numero < 0) {
                break; // Sale del bucle si se ingresa un número negativo
            }

            contador++;
        }

        System.out.println("Se han introducido " + contador + " numero(s).");
    }
}
