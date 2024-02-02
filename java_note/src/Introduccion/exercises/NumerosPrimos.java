package Introduccion.exercises;

public class NumerosPrimos {
    public static void main(String[] args) {
        String resultado = "";

        int contador = 0;
        int numero = 1;
        while (contador < 100) {
            if (esPrimo(numero)) {
                resultado += numero + ", ";
                contador++;
            }
            numero++;
        }
        System.out.println(resultado);
    }

    private static boolean esPrimo(int numero) {
        Boolean esNumeroPrimo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esNumeroPrimo = false;
            }
        }
        return esNumeroPrimo;
    }
}
