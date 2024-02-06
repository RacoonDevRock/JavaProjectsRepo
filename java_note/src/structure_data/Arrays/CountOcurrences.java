package structure_data.Arrays;

import java.util.Arrays;

public class CountOcurrences {
    public static void main(String[] args) {
        int[] array = { 6, 5, 6, 7, 8, 8, 9 };

        // PRIMERA FORMA
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            System.out.print(count + ", ");
            count = 0;
        }

        System.out.println("");

        // SEGUNDA FORMA
        Arrays.sort(array);
        int counter = 0;
        int aux = array[0];
        for (int i = 0; i < array.length; i++) {
            if (aux == array[i]) {
                counter++;
            } else {
                System.out.print(counter + ", ");
                counter = 1;
                aux = array[i];
            }
        }
        System.out.println(counter);
    }
}
