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
public class mayusOrMinus {
    
    public static void main(String[] args) {
        char letra;
        
        letra = JOptionPane.showInputDialog("Ingrese una letra").charAt(0);
        
        if (Character.isUpperCase(letra)) { // metodo que permite comprobar si una variable de cadena o caracter es mayuscula
            JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
        } else {
            JOptionPane.showMessageDialog(null, "Esta es una letra minuscula");
        }
    }
    
}
