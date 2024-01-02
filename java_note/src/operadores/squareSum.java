package operadores;

import java.util.Scanner;

public class squareSum {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ingrese valor de A: ");
        int a = s.nextInt();
        
        System.out.print("Ingrese valor de B: ");
        int b = s.nextInt();
        
        System.out.println("\n(a+b)^2 = a^2 + b^2 + 2ab");
        
        System.out.println();
        
        int primerResultado = (int)Math.pow((a + b), 2);                
        System.out.println("(a+b)^2 = " + primerResultado);
        
        System.out.println();
        
        int segundoResultado = (int)Math.pow(a,2) + (int)Math.pow(b,2)+ (2*a*b);
        System.out.println("a^2 + b^2 + 2ab = " + segundoResultado);

        s.close();
        
    }
}
