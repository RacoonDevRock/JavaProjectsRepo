/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LUIS
 */
public class multiplo10 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        int multiplo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el multiplo: "));
        
        if (numero % multiplo == 0) {
            JOptionPane.showMessageDialog(null, "El numero "+ numero +" es múltiplo de " + multiplo);
        } else {
            JOptionPane.showMessageDialog(null, "El numero "+ numero +" NO es múltiplo de " + multiplo);
        }
        
    }
}
