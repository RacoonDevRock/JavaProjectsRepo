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
public class ifelse {
    
    public static void main(String[] args) {
        int number, dato = 5;
        
        number = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        /*
        == : Igualdad
        != : Diferencia
        > : Mayor
        < : Menor
        >= : Mayor que
        <= : Menor que
        */
        
        if (number <= dato) {
            JOptionPane.showMessageDialog(null, "El número es 5 o menor");
        } else {
            JOptionPane.showMessageDialog(null, "El número es mayor que 5");
        }
        
    }
    
}
