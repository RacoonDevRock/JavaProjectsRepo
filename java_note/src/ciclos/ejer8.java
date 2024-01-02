package ciclos;

import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ingrese numero: ");
        int numero = s.nextInt();
        int contador = 0;
        
        while (contador < numero) {            
            contador++;
            System.out.println(contador);
        }

        s.close();
        
    }
}
