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
public class parOImpar {

    public static void main(String[] args) {
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        
        if ((num1 % 2 == 0) && (num2 % 2 == 0)) {
            JOptionPane.showMessageDialog(null, "Ambos numeros son pares");
        } else if ((num1 % 2 != 0) && (num2 % 2 != 0)) {
            JOptionPane.showMessageDialog(null, "Ambos numeros NO son pares");
        } else if ((num1 % 2 == 0) && (num2 % 2 != 0)) {
            JOptionPane.showMessageDialog(null, "El numero "+num1+" es PAR, pero el numero "+num2+" NO es par");
        } else {
            JOptionPane.showMessageDialog(null, "El numero "+num1+" es NO es par, pero el numero "+num2+" es par");
        }
    }
    
}
