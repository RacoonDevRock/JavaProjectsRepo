package Introduccion.ciclos;

import java.util.Scanner;

public class ejer17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int codigo, contadorFactura = 0;
        double litros, factura, factura1 = 0, factura2 = 0, factura3 = 0, cantidadLitros = 0, facturaTotal = 0;
        
        for (int i = 1; i <= 5; i++) {
            
            do {                
                System.out.print("Factura N"+i+"\nIngrese codigo del articulo: ");
                codigo = s.nextInt();
            } while ((codigo < 0) || (codigo > 3));
            
            System.out.print("Cantidad vendida(litros): ");
            litros = s.nextDouble();
            
            switch (codigo) {
                case 1 -> {
                    factura = 0.6 * litros;
                    factura1 += factura;
                }
                case 2 -> {
                    factura = 3 * litros;
                    factura2 += factura;
                }
                case 3 -> {
                    factura = 1.25 * litros;
                    factura3 += factura;
                }
                default -> {
                }
            }

            facturaTotal = factura1 + factura2 + factura3;
            
            if (codigo == 1) {
                cantidadLitros += litros;
            }
            
            if ((factura1 > 600) || (factura2 > 600) || factura3 > 600) {
                contadorFactura++;
            }
            
        }
        
        System.out.println("La facturacion total es de: "+facturaTotal);
        System.out.println("Cantidad de litros vendidos del articulo 1: "+cantidadLitros);
        System.out.println("Facturas mayores a $600: "+contadorFactura);

        s.close();
        
    }
}
