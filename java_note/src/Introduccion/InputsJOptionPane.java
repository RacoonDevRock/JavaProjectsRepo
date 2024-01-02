/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduccion;

import javax.swing.JOptionPane;

/**
 *
 * @author LUIS
 */
public class InputsJOptionPane {
    
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");    
        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
        
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));   //debemo transformar la cadena por defecto a un entero
        JOptionPane.showMessageDialog(null, "El numero entero es: " + entero);
        
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        JOptionPane.showMessageDialog(null, "El caracter es: " + letra);
        
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));   // debemos tranformar la cadena por defecto a un decimal o double
        JOptionPane.showMessageDialog(null, "El decimal es: " + decimal);
        
        
    }
    
}
