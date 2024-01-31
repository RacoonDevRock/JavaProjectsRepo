package Introduccion.exercises;

import java.util.Scanner;

public class CalificacionAprobatoria {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int calificacion;
        do {
            System.out.print("¿Cuál es tu calificación (0-100)? ");
            calificacion = s.nextInt();
        } while (calificacion < 0 || calificacion > 100);
        String resultado = (calificacion >= 60) ? "APROBO" : "NO APROBO";
        System.out.println("El estudiante " + resultado);
        s.close();
    }
}
