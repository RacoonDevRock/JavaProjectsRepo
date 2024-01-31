package Introduccion.exercises;

import java.util.Scanner;

public class ParOImpar {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Type a number: ");
        int number = s.nextInt();
        parOImpar(number);
        s.close();
    }

    private static void parOImpar(int number) {
        String resultado = (number % 2 == 0) ? "PAR" : "IMPAR";
        System.out.println("El numero es " + resultado);
    }
}
