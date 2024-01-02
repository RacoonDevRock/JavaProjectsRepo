package ciclos;

import java.util.Scanner;

public class ejer12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int contador = 1, numero, factorial = 1;
        
        System.out.print("Ingrese el numero: ");
        numero = s.nextInt();
        
        while (contador < numero) {            
            contador++;
            factorial *= contador;
        }
        
        System.out.println("Su factorial es: "+factorial);

        s.close();
        
    }
}
