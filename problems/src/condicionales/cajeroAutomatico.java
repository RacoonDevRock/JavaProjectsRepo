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
public class cajeroAutomatico {
    public static void main(String[] args) {
        int opc = Integer.parseInt(JOptionPane.showInputDialog(null, "BIENVENIDO A MI BANCO****** "
                + "\n 1.- INGRESE DINERO A LA CUENTA: "
                + "\n 2.- RETIRE DINERO DE LA CUENTA: "
                + "\n 3.- SALIR"
                + "\n\nSALDO INICIAL: 1000\n"
                + "\nIngrese una opción: "));
        
        final double salarioInicial = 1000;
        double dineroTotal, dineroIngresado, dineroRetirado;
        
//        CONDITIONAL IF-ELSE
//        if ((opc >= 1) && (opc <= 3)) {
//            if (opc == 1) {
//                dineroIngresado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero: "));
//                dineroTotal = salarioInicial + dineroIngresado;
//                JOptionPane.showMessageDialog(null, "La cantidad actual de dinero de su cuenta es de : $"+dineroTotal);
//            } else if (opc == 2) {
//                    dineroRetirado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero a retirar: "));
//                if (dineroRetirado > salarioInicial) {
//                    JOptionPane.showMessageDialog(null, "No cuenta con saldo suficente");
//                } else {
//                    dineroTotal = salarioInicial - dineroRetirado;
//                    JOptionPane.showMessageDialog(null, "La cantidad actual de dinero de su cuenta es de : $"+dineroTotal);
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "MUCHAS GRACIAS POR SU VISITA C: ...");
//            }
//        } else {
//                JOptionPane.showMessageDialog(null, "INGRESE UNA OPCIÓN VALIDA");
//        }


//        SWITCH - CASE
        switch (opc) {
            case 1:
                dineroIngresado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero: "));
                dineroTotal = salarioInicial + dineroIngresado;
                JOptionPane.showMessageDialog(null, "La cantidad actual de dinero de su cuenta es de : $"+dineroTotal);
                break;
            case 2:
                dineroRetirado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero a retirar: "));
                if (dineroRetirado > salarioInicial) {
                    JOptionPane.showMessageDialog(null, "No cuenta con saldo suficente");
                } else {
                    dineroTotal = salarioInicial - dineroRetirado;
                    JOptionPane.showMessageDialog(null, "La cantidad actual de dinero de su cuenta es de : $"+dineroTotal);
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "MUCHAS GRACIAS POR SU VISITA C: ...");
                break;
            default:
                JOptionPane.showMessageDialog(null, "INGRESE UNA OPCIÓN VALIDA");
                break;
        }
        
    }
}
