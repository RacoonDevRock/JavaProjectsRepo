package Introduccion.operadores;

import java.util.Scanner;

public class time {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int horasPorDia = 24;
        int horasPorSemana = 168;
        
        System.out.print("Ingrese cantidad de horas: ");
        int cantidadHoras = s.nextInt();
        
        int semanasConteo = cantidadHoras / horasPorSemana;
        int diasConteo = cantidadHoras % horasPorSemana / horasPorDia;
        int horasConteo = cantidadHoras % horasPorDia;
        
        System.out.println(semanasConteo +" semanas, "+ diasConteo +" dias y "+ horasConteo +" horas");      

        s.close();
        
    }
}
