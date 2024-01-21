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
public class mayorAMenor {
    
    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero: "));
        
        if ((num1 > num2) && (num2 > num3)) {
            JOptionPane.showMessageDialog(null, num1+" - "+num2+" - "+num3);
        } else if ((num1 > num3) && (num3 > num2)) {
            JOptionPane.showMessageDialog(null, num1+" - "+num3+" - "+num2);
        } else if ((num2 > num1) && (num1 > num3)) {
            JOptionPane.showMessageDialog(null, num2+" - "+num1+" - "+num3);
        } else if ((num2 > num3) && (num3 > num1)) {
            JOptionPane.showMessageDialog(null, num2+" - "+num3+" - "+num1);
        } else if ((num3 > num1) && (num1 > num2)) {
            JOptionPane.showMessageDialog(null, num3+" - "+num1+" - "+num2);
        } else if ((num3 > num2) && (num2 > num1)) {
            JOptionPane.showMessageDialog(null, num3+" - "+num2+" - "+num1);
        }
    }
    
}
