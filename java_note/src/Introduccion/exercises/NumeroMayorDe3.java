package Introduccion.exercises;

import java.util.Scanner;

public class NumeroMayorDe3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int num1 = s.nextInt();
        System.out.print("Type the second number: ");
        int num2 = s.nextInt();
        System.out.print("Type the third number: ");
        int num3 = s.nextInt();

        System.out.println(numMayorMenor1(num1, num2, num3));
        // numMayorMenor2(num1, num2, num3);

        s.close();
    }

    private static String numMayorMenor1(int num1, int num2, int num3) {
        int mayor = Math.max(Math.max(num1, num2), num3);
        int menor = Math.min(Math.min(num1, num2), num3);
        return "El numero mayor es " + mayor + " y el numero menor es " + menor;
    }

    @SuppressWarnings("unused")
    private static void numMayorMenor2(int num1, int num2, int num3) {
        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("El numero mayor es " + num1);
            if (num2 > num3) {
                System.out.println("El numero menor es " + num3);
            } else {
                System.out.println("El numero menor es " + num2);
            }
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("El numero mayor es " + num2);
            if (num1 > num3) {
                System.out.println("El numero menor es " + num3);
            } else {
                System.out.println("El numero menor es " + num1);
            }
        } else if ((num3 > num1) && (num3 > num2)) {
            System.out.println("El numero mayor es " + num3);
            if (num2 > num1) {
                System.out.println("El numero menor es " + num1);
            } else {
                System.out.println("El numero menor es " + num2);
            }
        }
    }
}
