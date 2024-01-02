package ciclos;

import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double numero;
        
        do {  
            System.out.print("Ingrese un numero: ");
            numero = s.nextDouble();
            
            if (numero > 0.0) {
                System.out.println("El numero es POSITIVO");
            } else if (numero < 0.0) {
                System.out.println("El numero es NEGATIVO");
            } else {
                System.out.println("FIN DEL PROGRAMA...");
            }
        } while (numero != 0.0);

        s.close();
        
    }
}
