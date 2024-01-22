package poo.upao.ejer3_introduction;

public class PruebaLibro {
    public static void main(String[] args) {
        
        // PRIMERA FORMA
        // Libro l1 = new Libro(458, "El ciempies humano", "1985", 486f);
        // Libro l2 = new Libro(471, "El cuatro manos", "2099", 746f);
        // Libro l3 = new Libro(128, "El traspie sin cabeza", "2004", 521f);

        // Libro[] alib = new Libro[3];
        // alib[0] = l1;
        // alib[1] = l2;
        // alib[2] = l3;

        // 

        Libro alib[];
        alib = new Libro[3];

        alib[0] = new Libro(458, "El ciempies humano", "1985", 486f);
        alib[1] = new Libro(471, "El cuatro manos", "2099", 746f);
        alib[2] = new Libro(128, "El traspie sin cabeza", "2004", 521f);

        System.out.println("Nuestro libros son:");
        for (Libro libro : alib) {
            System.out.println(libro.getTitulo());
        }

    }
}
