package Introduccion.ciclos;

import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int numero, conteo = 0, contador = 0;
        
        do {            
            System.out.print("Ingrese un numero: ");
            numero = s.nextInt();
            
            if (numero >= 0) {
                conteo += numero;
                contador++;
            }
            
        } while (numero >= 0);
        
        double promedio = conteo / contador; // Realiza la división con uno de los operandos como double para obtener un resultado decimal
        System.out.println("El promedio es: " + promedio);

        s.close();
        
    }
}
