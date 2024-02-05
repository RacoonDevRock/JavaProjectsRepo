package structure_data.Arrays.proof;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class intro {
    public static void main(String[] args) {
        int[] ArregloA = { 1, 2, 3, 4, 5, 6 };
        int[][] ArregloB = { { 3, 6 }, { 8, 7 } };
        Integer[] ArregloC = { 1, 2, 3, 4, 5, 6 };
        // System.out.println(ArregloA);

        System.out.println("Bucle For");
        for (int i = 0; i < ArregloA.length; i++) {
            System.out.println(ArregloA[i]);
        }

        System.out.println("\nBucle For-Each");
        for (int i : ArregloA) {
            System.out.println(i);
        }

        System.out.println("\nMetodo Arrays.toString()");
        System.out.println(Arrays.toString(ArregloA));

        System.out.println("\nMetodo Arrays.deepToString()");
        System.out.println(Arrays.deepToString(ArregloB));

        System.out.println("\nMetodo Arrays.asList()");
        System.out.println(Arrays.asList(ArregloC));

        // Interfaz Java Iterator
        System.out.println("\nInterfaz Java Iterator");
        List<Integer> list = Arrays.asList(ArregloC); // creando una lista de entero (List of Integer)
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nJava Stream API");
        Arrays.stream(ArregloC)
                .forEach(System.out::print);
    }
}
