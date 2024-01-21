package poo.notes.ejercicio6;

public class Main {
    public static void main(String[] args) {
        OperacionCompleja z1 = new OperacionCompleja(2, 3);
        OperacionCompleja z2 = new OperacionCompleja(1, -1);

        // Operaciones
        OperacionCompleja suma = z1.suma(z2);
        OperacionCompleja resta = z1.resta(z2);
        OperacionCompleja multiplicacion = z1.multiplicacion(z2);
        OperacionCompleja division = z1.division(z2);

        // Resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}