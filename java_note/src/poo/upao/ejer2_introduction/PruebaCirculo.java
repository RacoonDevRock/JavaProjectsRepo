package poo.upao.ejer2_introduction;

public class PruebaCirculo {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(23);
        Circulo c2 = new Circulo(15);

        c1.setRadio(34);
        System.out.println("Radio nuevo (metodo getter): "+c1.getRadio());

        System.out.println("Area de c2: "+c2.calcularArea()+""
        +"\nPerimetro de c2: "+c2.calcularPerimetro());

        System.out.println("Nro de circulos creados (instancias del objeto): "+Circulo.getNroCirculos());

    }
}
