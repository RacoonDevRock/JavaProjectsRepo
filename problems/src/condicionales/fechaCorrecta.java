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
public class fechaCorrecta {
    
    public static void main(String[] args) {
        int dia, mes, anio;
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa mes: "));
        anio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa anio: "));
        
        if ((dia >= 1) && (dia <= 30) && (mes >= 1) && (mes <= 12) && (anio >= 0) && (anio != 0)) {
            JOptionPane.showMessageDialog(null, "La fecha "+dia+"/"+mes+"/"+anio+" es correcta");
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese correctamente la fecha");
        }
        
    }
    
}
