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
public class megaplaza {
    
    public static void main(String[] args) {
        float compra;
        compra = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor total de su compra: "));
        
        if (compra > 300) {
            float descuento = compra * 0.2f;
            JOptionPane.showMessageDialog(null, "EL valor de tu compra es de: "+descuento);
        } else {
            JOptionPane.showMessageDialog(null, "No has superado los $300 no se aplica el 20%");
        }
    }
    
}
