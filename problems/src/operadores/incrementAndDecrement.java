/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadores;

/**
 *
 * @author LUIS
 */
public class incrementAndDecrement {

    // Increment and decrement operators in Java
    // x++; postfix increment: x += 1 or x = x + 1
    // x--; postfix decrement: x -= 1 or x = x - 1
    
    public static void main(String[] args) {
        int x = 5, y;
        
        // Postfix increment operator (x++)
        y = x++; // If we execute this, 'y' will hold 5, not 6 as one might initially think
        System.out.println("y = x++");
        System.out.println(y); // The reason is that the ++ operator is after the variable 'x',
                               // so the current value of 'x' is assigned to 'y' first, and then 'x' is incremented
                               // 'y' holds the original value of 'x' before the increment
        System.out.println();
        
        // Prefix increment operator (++x)
        x = 5;
        y = 0;
        
        y = ++x; // In this case, 'y' holds the value of 'x' after the increment
        System.out.println("y = ++x");
        System.out.println(y); // Now 'y' has the value of 6, since ++ is before 'x',
                               // meaning 'x' is incremented first and then assigned to 'y'
    }
}
