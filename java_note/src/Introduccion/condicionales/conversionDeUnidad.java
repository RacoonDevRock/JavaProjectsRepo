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
public class conversionDeUnidad {
    public static void main(String[] args) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso(kg): "));
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Conversión de KG a..."
                + "\n 1.- Gramo"
                + "\n 2.- Tonelada"
                + "\n 3.- Miligramo"
                + "\n 4.- Salir"
                + "\nIngrese peso(kg): "));
        double conversion;
        
        switch (opc) {
            case 1:
                conversion = peso * 1000;
                JOptionPane.showMessageDialog(null, peso+"(KG) -> "+conversion+"(G)");
                break;
            case 2:
                conversion = peso / 1000;
                JOptionPane.showMessageDialog(null, peso+"(KG) -> "+conversion+"(T)");
                break;
            case 3:
                conversion = peso * 1000000;
                JOptionPane.showMessageDialog(null, peso+"(KG) -> "+conversion+"(MG)");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "GRACIAS POR SU VISITA");
                break;
            default:
                JOptionPane.showMessageDialog(null, "INGRESE UNA OPCION VALIDA");
        }
        
    }
}
