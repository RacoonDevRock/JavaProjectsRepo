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
public class fechaCorrectaReal {
    
    public static void main(String[] args) {
        int dia, mes, anio;

        // Solicitar al usuario que ingrese el día, mes y año
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
        anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año: "));

        boolean fechaValida = false;

        // Verificar si el año, mes y día cumplen las condiciones
        if (anio > 0 && mes >= 1 && mes <= 12) {
            switch (mes) {
                case 2: // Febrero
                    fechaValida = dia >= 1 && dia <= 28;
                    break;
                case 4: // Abril
                case 6: // Junio
                case 9: // Septiembre
                case 11: // Noviembre
                    fechaValida = dia >= 1 && dia <= 30;
                    break;
                default: // Resto de los meses
                    fechaValida = dia >= 1 && dia <= 31;
                    break;
            }
        }

        // Mostrar si la fecha es válida o no
        if (fechaValida) {
            System.out.println("La fecha ingresada es válida.");
        } else {
            System.out.println("La fecha ingresada no es válida.");
        }
    }
    
}
