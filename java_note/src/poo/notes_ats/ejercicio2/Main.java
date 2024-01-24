package poo.notes_ats.ejercicio2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomMethods = new Random();
        Tablero tablero = new Tablero(0, 0);

        System.out.println("Posicion inicial X: 0 - Y: 0");

        int numeroDeMovimientos = 5;

        System.out.println("");
        for (int i = 0; i < numeroDeMovimientos; i++) {
            int opcRandom = randomMethods.nextInt(4);

            switch (opcRandom) {
                case 0:
                    tablero.abajo();
                    break;

                case 1:
                    tablero.arriba();
                    break;

                case 2:
                    tablero.derecha();
                    break;

                case 3:
                    tablero.izquierda();
                    break;
            }
        }

        System.out.println("");
        tablero.mostrarUbicacion();

    }
}
