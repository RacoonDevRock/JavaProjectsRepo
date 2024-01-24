package poo.notes_ats.ejercicio3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de vehiculos: ");
        int nVehiculos = scan.nextInt();

        Vehiculo vehiculos[] = new Vehiculo[nVehiculos];

        for (int i = 0; i < vehiculos.length; i++) {
            scan.nextLine();
            System.out.println("\nVEHICULO "+(i+1));
            System.out.print("Ingrese marca del vehiculo: ");
            String marca = scan.nextLine();
            System.out.print("Ingrese modelo del vehiculo: ");
            String modelo = scan.nextLine();
            System.out.print("Ingrese precio del vehiculo: ");
            float precio = scan.nextFloat();

            vehiculos[i] = new Vehiculo(marca, modelo, precio);
        }

        int indiceBarato = indiceVehiculoBarato(vehiculos);

        System.out.println("\nEl vehiculo mas barato es");
        System.out.println(vehiculos[indiceBarato].mostrarDatos());

        scan.close();
        
    }

    public static int indiceVehiculoBarato(Vehiculo vehiculos[]) {
        float precio;
        int indice = 0;

        precio = vehiculos[0].getPrecio();
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i].getPrecio() < precio) {
                precio = vehiculos[i].getPrecio();
                indice = i;
            }
        }

        return indice;
    }
}
