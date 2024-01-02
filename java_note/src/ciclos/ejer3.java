package ciclos;

import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero;
        
        do {  
            System.out.print("Ingrese un numero: ");
            numero = s.nextInt();
            
            if (numero == 0) {
                System.out.println("FIN DEL PROGRAMA...");
            } else if (numero % 2 == 0) {
                System.out.println("El numero es PAR");
            } else if (numero % 2 != 0) {
                System.out.println("El numero es IMPAR");
            }
        } while (numero != 0);

        s.close();
        
    }
}
