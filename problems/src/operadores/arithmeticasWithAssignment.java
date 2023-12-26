/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadores;

/**
 *
 * @author LUIS
 */
public class arithmeticasWithAssignment {
    
    public static void main(String[] args) {
        System.out.println("Value of number is " + 10 + " and the sum wil be " + 5);
        int number = 10;
        number = number + 5;  // is the same
        System.out.println("The result of the addition operation is:  "+ number);
        
        System.out.println("BUT");
        
        number = 10;
        System.out.println("Here it is the same operation, with different syntax and more abbreviated/shortened");
        number += 5;
//        number -= 5;  // number = number - 5
//        number *= 5;  // number = number * 5  
//        number /= 5;  // number = number / 5
//        number %= 5;  // number = number % 5
        System.out.println("And the result is the same: " + number);
    }
   
}
