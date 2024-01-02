package arreglos;

import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        float[] numeros = new float[5];
        float sumaPositivo = 0, conteoPositivo = 0, sumaNegativo = 0, conteoNegativo = 0, conteoCeros = 0, mediaPositiva, mediaNegativa;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = s.nextFloat();
            
            if (numeros[i] > 0) {
                sumaPositivo += numeros[i];
                conteoPositivo++;
            } else if (numeros[i] < 0) {
                sumaNegativo += numeros[i];
                conteoNegativo++;
            } else if (numeros[i] == 0) {
                conteoCeros++;
            }
            
        }
        mediaPositiva = sumaPositivo/conteoPositivo;
        System.out.println("La media de los numeros positivos es: "+mediaPositiva);
        mediaNegativa = sumaNegativo/conteoNegativo;
        System.out.println("La media de los numeros negativos es: "+mediaNegativa);
        System.out.println("El conteo de ceros es: "+conteoCeros);

        s.close();
        
    }
}
