/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadores;

/**
 *
 * @author LUIS
 */
public class equation {
    
    public static void main(String[] args) {
        double a = 2, b = 6, c = 4;
        
        double x_positivo = (-b + (Math.sqrt((Math.pow(b, 2)) - (4*a*c))))/(2*a);
        double x_negativo = (-b - (Math.sqrt((Math.pow(b, 2)) - (4*a*c))))/(2*a);
        
        System.out.println(x_positivo);
        System.out.println(x_negativo);
        
        
        double y_positivo = (a * Math.pow(x_positivo, 2)) + (b*x_positivo) + c;
        System.out.println(y_positivo);
        
        double y_negativo = (a * Math.pow(x_negativo, 2)) + (b*x_negativo) + c;
        System.out.println(y_negativo);
    }
    
}
