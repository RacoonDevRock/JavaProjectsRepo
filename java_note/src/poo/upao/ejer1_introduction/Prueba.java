package poo.ejer1_introduction;

public class Prueba {
    public static void main(String[] args) {
        Cuadrado c1, c2;
        c1 = new Cuadrado(34.5);
        c2 = new Cuadrado(23.5);

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        Empleado e1, e2;
        e1 = new Empleado("guillermo", 13);
        e2 = new Empleado("manu", 20);

        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}
