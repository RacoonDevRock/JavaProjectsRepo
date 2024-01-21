package poo.notes.ClasesYObjetos;

public class Coche {
    // atributos
    String color;
    String marca;
    int KM;

    // comportamiento (metodos)
    public static void main(String[] args) {
        Coche c1 = new Coche(); // creacion de objeto

        c1.color = "amarillo";
        c1.marca = "mercedez";
        c1.KM = 1000;

        System.out.println("El color es: "+c1.color+", la marca es: "+c1.marca+", el KM es: "+c1.KM);
    }
}
