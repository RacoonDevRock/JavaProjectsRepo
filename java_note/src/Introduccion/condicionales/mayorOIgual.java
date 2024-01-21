/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduccion.condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author LUIS
 */
public class mayorOIgual {
    
    public static void main(String[] args) {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero: "));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero: "));
        
        if (number1 > number2) {
            JOptionPane.showMessageDialog(null, "El número "+number1+" es mayor que " + number2);
        } else if(number1 < number2) {
            JOptionPane.showMessageDialog(null, "El número "+number2+" es mayor que " + number1);
        } else {
            JOptionPane.showMessageDialog(null, "El numero "+number1+" y el numero "+number2+" son iguales");
        }
        
    }
    
}
