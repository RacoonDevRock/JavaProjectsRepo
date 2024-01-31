package Introduccion.exercises;

import java.util.Scanner;

public class NumeroMayorDe2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese numero: ");
        int numero1 = s.nextInt();
        System.out.print("Ingrese numero: ");
        int numero2 = s.nextInt();
        System.out.println("El numero mayor es: " + mayorONo(numero1, numero2));
        s.close();
    }

    private static int mayorONo(int numero1, int numero2) {
        return (numero1 > numero2) ? numero1 : numero2;
    }
}
