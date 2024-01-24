package poo.notes_ats.ejercicio11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        llenarPoligono();
        mostrarDatosYArea();
    }

    public static void llenarPoligono() {

        int opc;
        char response;

        do {
            do {
                System.out.println("Digite que poligono desea: ");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.print("Opcion: ");
                opc = scanner.nextInt();
            } while (opc < 1 || opc > 2);

            switch (opc) {
                case 1:
                    llenarTriangulo();
                    break;
                case 2:
                    llenarRectangulo();
                    break;

                default:
                    break;
            }

            System.out.println("Desea introducir otro poligono¿: (s/n)");
            response = scanner.next().charAt(0);
        } while (response == 's' || response == 'S');
    }

    public static void llenarTriangulo() {
        double lado1, lado2, lado3;
        System.out.print("\nIngrese lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.print("Ingrese lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.print("\nIngrese lado 3: ");
        lado3 = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(3, lado1, lado2, lado3);
        poligono.add(triangulo); // guardamos un triangulo dentro de nuestro arreglo de poligonos
    }

    public static void llenarRectangulo() {
        double lado1, lado2;
        System.out.print("\nIngrese lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.print("Ingrese lado 2: ");
        lado2 = scanner.nextDouble();

        Rectangulo rectangulo = new Rectangulo(4, lado1, lado2);
        poligono.add(rectangulo);
    }

    private static void mostrarDatosYArea() {
        System.out.println("\n--------------------RESULTADOS FINALES--------------------\n");
        for (Poligono poligone : poligono) {
            System.out.println(poligone.toString() + " " + poligone.area());
        }
    }
}
