package operadores;

import java.util.Scanner;

public class equation {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los coeficientes (a, b, c) de la ecuación cuadrática:");
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        // Calcular el discriminante
        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            // Dos raíces reales distintas
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Las raíces son: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            // Una raíz real (raíz doble)
            double raiz = -b / (2 * a);
            System.out.println("La raíz doble es: " + raiz);
        } else {
            // Raíces imaginarias
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);

            System.out.println("Las raíces son complejas: " + parteReal + " + " + parteImaginaria + "i y " + parteReal + " - " + parteImaginaria + "i");
        }
        
        
//        double a = 2, b = 6, c = 4;
//        
//        double x_positivo = (-b + (Math.sqrt((Math.pow(b, 2)) - (4*a*c))))/(2*a);
//        System.out.println(x_positivo);
//        
//        double x_negativo = (-b - (Math.sqrt((Math.pow(b, 2)) - (4*a*c))))/(2*a);
//        System.out.println(x_negativo);
//        
//        
//        double y_positivo = (a * Math.pow(x_positivo, 2)) + (b*x_positivo) + c;
//        System.out.println(y_positivo);
//        
//        double y_negativo = (a * Math.pow(x_negativo, 2)) + (b*x_negativo) + c;
//        System.out.println(y_negativo);

        scanner.close();
        
    }
}
