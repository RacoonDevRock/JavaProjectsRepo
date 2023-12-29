/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author LUIS
 */
public class ejer15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int edad;
        double altura, sumaAltura = 0, mediaAltura, mediaEdad, sumaEdad = 0, contadorMayor = 0, contadorEstatura = 0;
        
        System.out.println("INGRESE LA EDAD Y ALTURA DE 5 ALUMNOS");
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("ALUMNO N"+i+"\nIngrese la edad del alumno : ");
            edad = s.nextInt();
            
            sumaEdad += edad;
            
            System.out.print("Ingrese la altura del alumno: ");
            altura = s.nextDouble();
            
            sumaAltura += altura;
            
            if (edad > 18) {
                contadorMayor++;
            }
            
            if (altura > 175.0) {
                contadorEstatura++;
            }
            
        }
               
        mediaEdad = sumaEdad/5;
        System.out.println("\nLa media de las edades es: "+mediaEdad);
        
        mediaAltura = sumaAltura / 5;
        System.out.println("La media de la altura es: "+mediaAltura);
        
        System.out.println("La cantidad de alumnos mayores a 18 son.. "+contadorMayor);
        System.out.println("La cantidad de alumnos mayores a 1.75 son.. "+contadorEstatura);
    }
}
