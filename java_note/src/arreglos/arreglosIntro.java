package arreglos;

public class arreglosIntro {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        
        numeros[0] = 4;
        numeros[1] = 2;
        numeros[2] = 10;
        
        for (int i = 0; i < 3; i++) {
            System.out.println(numeros[i]);
        }

        int[] numerosOtros = {2,5,1};
        
        for (int i = 0; i < 3; i++) {
            System.out.println(numerosOtros[i]);
        }
    }
}
