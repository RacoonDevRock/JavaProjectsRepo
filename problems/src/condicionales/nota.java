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
public class nota {
    public static void main(String[] args) {
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una nota (0-10): "));
        
        if ((nota >= 0) && (nota <= 10)) {
            if (nota == 1) {
                JOptionPane.showMessageDialog(null, "INSUFICIENTE");
            } else if ((nota >= 2) && (nota <= 5))  {
                JOptionPane.showMessageDialog(null, "SUFICIENTE");
            } else if ((nota > 5) && (nota <= 8)) {
                JOptionPane.showMessageDialog(null, "BIEN");
            } else if (nota == 9) {
                JOptionPane.showMessageDialog(null, "NOTABLE");
            } else if (nota == 10) {
                JOptionPane.showMessageDialog(null, "SOBRESALIENTE");
            }
        }
    }
}
