package poo.ejer4_introduction_herencia.ejemplo1;

import java.util.Scanner;

public class PruebaHerencia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x, y;
        double radio, largo, ancho;

        System.out.println("Ingrese datos del circulo: ");
        System.out.print("Ingrese x: ");
        x = s.nextInt();
        System.out.print("Ingrese y: ");
        y = s.nextInt();
        System.out.print("Ingrese radio: ");
        radio = s.nextDouble();

        Circulo c1 = new Circulo(x, y, radio);

        System.out.println(c1.toString());

        System.out.println("\nIngrese datos del rectangulo: ");
        System.out.print("Ingrese x: ");
        x = s.nextInt();
        System.out.print("Ingrese y: ");
        y = s.nextInt();
        System.out.print("Ingrese largo: ");
        largo = s.nextDouble();
        System.out.print("Ingrese ancho: ");
        ancho = s.nextDouble();

        Rectangulo r1 = new Rectangulo(x, y, largo, ancho);

        System.out.println(r1.toString());

        s.close();

    }
}
