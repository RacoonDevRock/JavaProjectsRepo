package Introduccion.ciclos;

import java.util.Scanner;

public class ejer13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("INGRESE 10 NUMEROS...");
        
//        WHILE
        int contadorCero = 0; 
        float contador = 0, contadorPositivo = 0, contadorNegativo = 0, sumaPositivo = 0, numero = 0, sumaNegativo = 0;
        float promedioPositivo, promedioNegativo;
                
        while (contador < 10) {   
            System.out.print("Ingrese numero: ");
            numero = s.nextInt();    
            
            if (numero > 0) {
                sumaPositivo += numero;
                contadorPositivo++;
            } 
            if (numero < 0) {
                sumaNegativo += numero;
                contadorNegativo++;
            }
            if (numero == 0) {
                contadorCero++;
            }
            contador++;
        }
        promedioPositivo = sumaPositivo/contadorPositivo;
        System.out.println("\nEl promedio de los numeros positivos es: "+promedioPositivo);
        promedioNegativo = sumaNegativo/contadorNegativo;
        System.out.println("El promedio d elos numeros negativos es: "+promedioNegativo);
        System.out.println("La cantidad de ceros es: "+contadorCero);



//        FOR
        float number, sumaPos = 0, conteoPos = 0, sumaNeg = 0, conteoNeg = 0, conteoCeros = 0, mediaPos, mediaNeg;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese un numero: ");
            number = s.nextInt();
            
            if (number == 0) {
                conteoCeros++;
            } else if (number > 0) {
                sumaPos += number;
                conteoPos++;
            } else if (number < 0) {
                sumaNeg += number;
                conteoNeg++;
            }
        }
        
        if (conteoPos == 0) {
            System.out.println("No es posible obtener la media de cero");
        } else {
            mediaPos = sumaPos/conteoPos;
            System.out.println("La media de los numeros positivos es: "+mediaPos);
        }
        
        if (conteoPos == 0) {
            System.out.println("No es posible obtener la media de cero");
        } else {
            mediaNeg = sumaNeg/conteoNeg;
            System.out.println("La media de los numeros positivos es: "+mediaNeg);
        }
        
        System.out.println("La cantidad de ceros es: "+conteoCeros);

        s.close();
        
    }
}
