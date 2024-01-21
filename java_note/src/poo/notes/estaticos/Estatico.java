package poo.notes.estaticos;

public class Estatico {
    private static String frase = "ola ci";

    public static int sumar(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        System.out.println(Estatico.frase);
        System.out.println(Estatico.sumar(2, 4));
    }
}
