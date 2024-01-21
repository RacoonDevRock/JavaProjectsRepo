package Introduccion.ciclos;

import java.util.Scanner;

public class ejer19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int nota, contadorAprobado = 0, contadorCondicionado = 0, contadorSuspendido = 0;
        
        System.out.println("INGRESE LA NOTA DE 6 ALUMNOS"
                + "\n NOTA MAXIMA: 10"
                + "\n NOTA MINIMA: 0");
        
        for (int i = 1; i <= 6; i++) {
            do {                
                System.out.print("Ingrese nota: ");
                nota = s.nextInt();
            } while ((nota < 0) || (nota > 10));
            
            if (nota > 4) {
                contadorAprobado++;
            } else if (nota== 4) {
                contadorCondicionado++;
            } else if (nota < 4) {
                contadorSuspendido++;
            }
        }
        
        System.out.println("\nAlumnos aprobados: "+contadorAprobado+ ""
                + "\nAlumnos condicionados: "+contadorCondicionado+ ""
                + "\nAlumnos suspendidos: "+contadorSuspendido);

        s.close();
        
    }
}
