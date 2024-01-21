package poo.notes.ClasesYObjetos.operacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Operacion op1 = new Operacion();

        System.out.print("Ingresa primer numero: ");
        int n1 = scan.nextInt();
        System.out.print("Ingresa segundo numero: ");
        int n2 = scan.nextInt();

        System.out.println("Suma "+op1.sumar(n1,n2));
        System.out.println("Resta "+op1.resta(n1,n2));
        System.out.println("Multi "+op1.multi(n1,n2));
        System.out.println("Div "+op1.div(n1,n2));

        scan.close();

        // op1.mostrarResultados();

    }
}
