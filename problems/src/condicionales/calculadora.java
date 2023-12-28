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
public class calculadora {
    
    public static void main(String[] args) {
        int numero1, numero2, suma, resta, multi, div;
        char operacion;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
        
        operacion = JOptionPane.showInputDialog("Digite la operacion que deseas realizar: ").charAt(0);
        
        switch (operacion) {
            case 's':
            case 'S':
                suma = numero1 + numero2;
                JOptionPane.showConfirmDialog(null, "La suma es: " + suma);
                break;
            case 'r':
            case 'R':
                resta = numero1 - numero2;
                JOptionPane.showConfirmDialog(null, "La resta es: " + resta);
                break;
            case 'p':
            case 'P':
            case 'm':
            case 'M':
                multi = numero1 * numero2;
                JOptionPane.showConfirmDialog(null, "La multiplicacion es: " + multi);
                break;
            case 'd':
            case 'D':
                div = numero1 / numero2;
                JOptionPane.showConfirmDialog(null, "La division es: " + div);
                break;
            default:
                JOptionPane.showConfirmDialog(null, "Se equivoco de operacion");
                break;
        }
    }
    
}
