package poo.introduction;

public class PruebaCirculo {
    public static void main(String[ ] args) {
        //Declaración de un Objeto
        Circulo c1;
        //Creación del Objeto
        c1 = new Circulo();//Invoca al Constructor por defecto
        //Declaración y creación de un Objeto en una sola linea
        Circulo c2 = new Circulo(10);//Invoca al Constructor con 1 parámetro
        //Imprimir Resultado en pantalla
        System.out.println("Area del circulo 1: "+c1.calcularArea());
        System.out.println("Perimetro del circulo 1: "+c1.calcularPerimetro());
        System.out.println("Area del circulo 2: "+c2.calcularArea());
        System.out.println("Perimetro del circulo 2: "+c2.calcularPerimetro());
    }
}