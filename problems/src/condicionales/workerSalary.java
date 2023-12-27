/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author LUIS
 */
public class workerSalary {
    
    public static void main(String[] args) {
        float paga;
        int hours = Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas de trabajo: "));
        
        if (hours > 0) {
            if (hours <= 40) {
                paga = hours * 16;
            } else {
                paga = (40 * 16) + ((hours - 40) * 20);
            }
            JOptionPane.showMessageDialog(null, "Su salario es de: $" + paga);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese horas validas");
        }
    }
    
}
