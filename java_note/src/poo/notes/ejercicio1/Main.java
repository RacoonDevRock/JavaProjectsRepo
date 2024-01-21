package poo.notes.ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Cuadrilatero cuadrilatero1;

        System.out.print("Ingrese un lado: ");
        float lado1 = scan.nextFloat();
        System.out.print("Ingrese otro lado: ");
        float lado2 = scan.nextFloat();

        if (lado1 == lado2) {
            System.out.println("Es un cuadrado...");
            cuadrilatero1 = new Cuadrilatero(lado1);
        } else {
            System.out.println("No es un cuadrado..");
            cuadrilatero1 = new Cuadrilatero(lado1,lado2);
        } 

        System.out.println("El perimetro es: "+cuadrilatero1.getPerimetro());
        System.out.println("El area es: "+cuadrilatero1.getArea());       

        scan.close();
        
    }
}
