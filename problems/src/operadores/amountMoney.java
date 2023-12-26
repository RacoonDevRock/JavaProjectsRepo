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
public class amountMoney {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter Guillermo's amount of money: ");
        double guillermoMoney = s.nextDouble();

        double luisMoney = guillermoMoney / 2;
        System.out.println("The amount of luis' money: " + luisMoney);
        
        double juanMoney = (guillermoMoney + luisMoney) / 2;
        System.out.println("The amount of juan' money: " + juanMoney);
        
        double total = guillermoMoney + luisMoney + juanMoney;
        System.out.println("And the total amount for the 3 boys is: " + total);
        
    }
    
}
