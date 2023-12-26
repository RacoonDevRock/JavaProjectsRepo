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

        // NUMERO ENTERO-INPUT        
        System.out.print("Digite un numero entero: ");
        numero = scanner.nextInt();
        System.out.println("Su numero es.. " + numero);
        
        
        float flotante;

        // NUMERO FLOTANTE-INPUT        
        System.out.print("Digite un numero flotante: ");
        flotante = scanner.nextFloat();     //algunas pc aceptan puntos/comas, pruebalo
        System.out.println("Su numero es.. " + flotante);
        
        
        double doble;

        // NUMERO DOUBLE-INPUT        
        System.out.print("Digite un numero double: ");
        doble = scanner.nextDouble();     //algunas pc aceptan puntos/comas, pruebalo
        System.out.println("Su numero es.. " + doble);
        
        
        // Agrega este scanner.nextLine() para consumir el carácter de nueva línea pendiente
        scanner.nextLine();
        
        String cadena;
        
        // CADENA STRING TEXTO        
        System.out.print("Digite una cadena: ");
        /* cadena = scanner.next();    // con esto sirve almacenar cadenas sin embargo al detectar un espacio el resto ya no lo almacena por ello*/
        cadena = scanner.nextLine();     // Este identifica la cadena entera
        System.out.println("La cadena es: " + cadena);
        
        
        char letra;
//        LETRA CHAR
        System.out.print("Digite una letra: ");
        letra = scanner.next().charAt(0);   // Esto ayuda a identificar a capturar una letra en incluso por posicion como '0' el primero
        System.out.println("La letra es: " + letra);
        
    }
}
