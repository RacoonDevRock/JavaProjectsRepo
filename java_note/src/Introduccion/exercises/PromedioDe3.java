package Introduccion.exercises;

import java.util.Scanner;

public class PromedioDe3 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese la cantidad de numeros a promediar: ");
        double quantity = s.nextDouble();

        System.out.println("El promedio es " + String.format("%.2f", promedio(quantity)));
        s.close();
    }

    private static double promedio(double quantity) {
        double num = 0.0;
        for (double i = 0; i < quantity; i++) {
            System.out.print("Type a number: ");
            num += s.nextInt();
        }
        return num / quantity;
    }
}
