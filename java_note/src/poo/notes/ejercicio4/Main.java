package poo.notes.ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("BIENVENIDO A LA CARRERA DEL SIGLO.");

        System.out.print("Ingrese cantidad de competidores: ");
        int nCompetidores = scan.nextInt();

        Atleta atletas[] = ingreseCompetidores(nCompetidores);

        int indiceGanador = ganadorCarrera(atletas);

        System.out.println(atletas[indiceGanador].mostrarGanador());
        scan.close();

    }

    public static Atleta[] ingreseCompetidores(int nCompetidores) {
        Scanner scan = new Scanner(System.in);

        Atleta atletas[] = new Atleta[nCompetidores];

        for (int i = 0; i < atletas.length; i++) {
            System.out.println("\nCOMPETIDOR "+(i+1));
            System.out.print("Ingrese numero del competidor: ");
            int numero = scan.nextInt();

            // Consumir el salto de línea pendiente
            scan.nextLine();

            System.out.print("Ingrese el nombre del competidor: ");
            String nombre = scan.nextLine();
            System.out.print("Ingrese tiempo de carrera: ");
            float tiempo = scan.nextFloat();

            atletas[i] = new Atleta(numero, nombre, tiempo);
        }
        
        scan.close();
        return atletas;
    }
    
    public static int ganadorCarrera(Atleta atletas[]) {
        int indice = 0;
        float tiempo = atletas[0].getTiempoCarrera();
        for (int i = 0; i < atletas.length; i++) {
            if (atletas[i].getTiempoCarrera() < tiempo) {
                tiempo = atletas[i].getTiempoCarrera();
                indice = i;
            }
        }

        return indice;
    }
}
