package Introduccion.operadores;

import java.util.Scanner;

//OPERADORES ARITMÉTICOS
public class arithmetic {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        float number1, number2, suma, resta, multi, div, resto;
        
        System.out.println("Enter 2 numbers: ");
        
        System.out.println("The first number: ");
        number1 = scanner.nextFloat();
        
        System.out.println("The second number: ");
        number2 = scanner.nextFloat();
        
        suma = number1 + number2;
        resta = number1 - number2;
        multi = number1 * number2;
        div = number1 / number2;
        resto = number1 % number2;
        
        System.out.println("The sum between "+ number1 +" and "+ number2 +" is: " + suma);
        System.out.println("The subtraction between "+ number1 +" and "+ number2 +" is: " + resta);
        System.out.println("The multiplication between "+ number1 +" and "+ number2 +" is: " + multi);
        System.out.println("The division between "+ number1 +" and "+ number2 +" is: " + div);
        System.out.println("The rest between "+ number1 +" and "+ number2 +" is: " + resto);

        scanner.close();
        
    }
}
