package structure_data.Arrays;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arreglito = { 9, 4, 2, 65, 34, 2 };

        int[] distinct = Arrays.stream(arreglito).distinct().toArray();
        System.out.println(Arrays.toString(distinct));
    }
}
