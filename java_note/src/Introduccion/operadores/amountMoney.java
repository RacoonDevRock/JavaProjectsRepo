package Introduccion.operadores;

import java.util.Scanner;

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

        s.close();
        
    }
}
