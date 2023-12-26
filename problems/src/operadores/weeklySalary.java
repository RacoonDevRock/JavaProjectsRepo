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
public class weeklySalary {
    
//    REMEMBER TO USE DOUBLE FOR MORE ACCURATE RESULTS
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number of hours you work per week: ");
        float hoursWorked = s.nextFloat();
        
        System.out.print("Enter you hourly wage: ");
        float salaryPerHour = s.nextFloat();
        
        float weeklySalary = hoursWorked * salaryPerHour;
        
        System.out.println("The weekly salary is: " + weeklySalary);
        
    }
    
}
