/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduccion;

import java.util.Scanner;

/**
 *
 * @author LUIS
 */
public class Inputs {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        float flotante;
        double doble;
        
        // NUMERO ENTERO-INPUT        
        System.out.print("Digite un numero entero: ");
        numero = scanner.nextInt();
        System.out.println("Su numero es.. "+numero);
        
        
        // NUMERO FLOTANTE-INPUT        
        System.out.print("Digite un numero flotante: ");
        flotante = scanner.nextFloat();     //algunas pc aceptan puntos/comas, pruebalo
        System.out.println("Su numero es.. "+flotante);
        
        
        // NUMERO DOUBLE-INPUT        
        System.out.print("Digite un numero double: ");
        doble = scanner.nextDouble();     //algunas pc aceptan puntos/comas, pruebalo
        System.out.println("Su numero es.. "+doble);
    }
}
