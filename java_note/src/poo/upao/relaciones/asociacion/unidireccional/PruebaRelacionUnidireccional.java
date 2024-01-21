package poo.relaciones.asociacion.unidireccional;

public class PruebaRelacionUnidireccional {
    public static void main(String[] args) {
        Direccion d1 = new Direccion(350, "Santa Maria");
        Direccion d2 = new Direccion(1014, "Miraflores La Molina");
        // Direccion d3 = new Direccion(1391, "Hermilia Valdizan");

        Cliente c1 = new Cliente("72647339", "Guillermo Sanchez", d2);
        Cliente c2 = new Cliente("74732865", "Boy Lane", d1);

        System.out.println(c1.toString());
        d1.setNumero(842);  // cambio de dato en el numero de la direccion
        System.out.println(c2.toString());

    }
}
