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
public class cantidadCifras {
    
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
        
//        PRIMERA FORMA
//        if ((numero >= 0) && (numero <= 99999)) {
//            int cantidadDeCifras = String.valueOf(numero).length();
//            JOptionPane.showMessageDialog(null, "La cantidad de cifras del numero "+numero+" es: "+cantidadDeCifras);
//        } else {
//            JOptionPane.showMessageDialog(null, "No es un numero valido");
//        }

//        SEGUNDA FORMA
        if ((numero >= 0) && (numero < 10 )) {
            JOptionPane.showMessageDialog(null, "El numero tiene una cifra");
        } else if ((numero >= 10) && (numero < 100 )) {
            JOptionPane.showMessageDialog(null, "El numero tiene dos cifras");
        } else if ((numero >= 100) && (numero < 1000 )) {
            JOptionPane.showMessageDialog(null, "El numero tiene tres cifras");
        } else if ((numero >= 1000) && (numero < 10000 )) {
            JOptionPane.showMessageDialog(null, "El numero tiene cuatro cifras");
        } else if ((numero >= 10000) && (numero < 100000 )) {
            JOptionPane.showMessageDialog(null, "El numero tiene cinco cifras");
        } else {
            JOptionPane.showMessageDialog(null, "Numero no valido");
        }
        
    }
    
}
