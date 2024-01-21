package Introduccion.operadores;

import java.util.Scanner;

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

        s.close();
        
    }
}

