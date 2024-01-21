package Introduccion.condicionales;

import javax.swing.JOptionPane;

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
