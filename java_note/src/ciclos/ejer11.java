package ciclos;

public class ejer11 {
    public static void main(String[] args) {
        int contador = 0, conteo = 0, multi = 1;
////        WHILE
        while (conteo < 10) {
            if (contador % 2 != 0) {
                System.out.println(contador);
                multi *= contador;
                conteo++;
            }
            contador++;
        }
        System.out.println("El producto es:" +multi);

////      FOR
        long producto = 1;
        for (int i = 1; i < 20; i += 2) {
            producto *= i;
            System.out.print(" " + i);
        }
        
        System.out.println("\nEl producto es: "+producto);
    }
}
