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
public class finalRating {
    
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        
        float ponderadoParticipacion = 0.1f, ponderadoPrimerExamen = 0.25f, ponderadoSegundoExamen = 0.25f, ponderadoExamenFinal = 0.4f;
        
        System.out.println("Ingrese nombre del estudiante: ");
        String nombre = s.nextLine();
        
        System.out.print("Ingrese participacion: ");
        float notaParticipacion = s.nextFloat();
        
        System.out.print("Ingrese nota Primer Examen: ");
        float notaPrimerExamenParcial = s.nextFloat();
        
        System.out.print("Ingrese nota Segundo Examen: ");
        float notaSegundoExamenParcial = s.nextFloat();
        
        System.out.print("Ingrese nota Examen Final: ");
        float notaExamenFinal = s.nextFloat();
        
//        double participacion = ponderadoParticipacion * notaParticipacion;
//        double primerExamenParcial = ponderadoPrimerExamen * notaPrimerExamenParcial;
//        double segundoExamenParcial = ponderadoSegundoExamen * notaSegundoExamenParcial;
//        double examenFinal = ponderadoExamenFinal * notaExamenFinal;

        notaParticipacion *= ponderadoParticipacion;
        notaPrimerExamenParcial *= ponderadoPrimerExamen;
        notaSegundoExamenParcial *= ponderadoSegundoExamen;
        notaExamenFinal *= ponderadoExamenFinal;
        
//        double finalRating = participacion + primerExamenParcial + segundoExamenParcial + examenFinal;
        float finalRating = notaParticipacion + notaPrimerExamenParcial + notaSegundoExamenParcial + notaExamenFinal;
        
        System.out.println("\nEstudiante: " + nombre +""
                + " Calificacion final: " + finalRating);
        
    }
    
}
