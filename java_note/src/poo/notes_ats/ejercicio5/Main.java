package poo.notes_ats.ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese cantidad de triangulos: ");
        int nTriangulos = scan.nextInt();

        TrianguloIsosceles triangulos[] = new TrianguloIsosceles[nTriangulos];

        for (int i = 0; i < triangulos.length; i++) {
            System.out.println("\nTRIANGULO " + (i + 1));
            System.out.print("Ingrese la base:");
            double base = scan.nextDouble();
            System.out.print("Ingrese el lado:");
            double lado = scan.nextDouble();

            triangulos[i] = new TrianguloIsosceles(base, lado);

            System.out.println("\nEl perimetro del triangulo es: " + triangulos[i].obtenerPerimetro());
            System.out.println("El area del triangulo es: " + triangulos[i].obtenerArea());
        }

        System.out.println("\nEl area del triangulo de mayor superficie es: "+areaMayor(triangulos));

        scan.close();
    }

    public static double areaMayor(TrianguloIsosceles triangulos[]) {
        double area;

        area = triangulos[0].obtenerArea();

        for (int i = 0; i < triangulos.length; i++) {
            if (triangulos[i].obtenerArea() > area) {
                area = triangulos[i].obtenerArea();
            }
        }

        return area;
    }
}
