/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author LUIS
 */
public class time {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int hora = 60;
        int horasPorDia = 24;
        int horasPorSemana = 168;
        
        System.out.print("Ingrese cantidad de horas: ");
        int cantidadHoras = s.nextInt();
        
        int semanasConteo = cantidadHoras / horasPorSemana;
        int diasConteo = cantidadHoras % horasPorSemana / horasPorDia;
        int horasConteo = cantidadHoras % horasPorDia;
        
        System.out.println(semanasConteo +" semanas, "+ diasConteo +" dias y "+ horasConteo +" horas");        
        
    }
    
}
