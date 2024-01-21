/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduccion.ciclos;

import java.util.Scanner;

/**
 *
 * @author LUIS
 */
public class cicloFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int number = s.nextInt();
        
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }

        s.close();
        
    }
}
