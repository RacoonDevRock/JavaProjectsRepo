package Introduccion.exercises;

import java.util.Scanner;

public class MayorDeEdad {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese su edad: ");
        int edad = s.nextInt();
        String categoria = (edad <= 12) ? "Niño" : ((edad <= 18) ? "Adolescente" : "Adulto");
        System.out.println("Usted es un " + categoria);
        s.close();
    }
}
