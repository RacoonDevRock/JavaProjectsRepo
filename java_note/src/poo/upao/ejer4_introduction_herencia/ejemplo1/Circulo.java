package poo.ejer4_introduction_herencia.ejemplo1;

// Un Circulo es una especializaciónde Figura.
public class Circulo/*(SubClase)*/ extends Figura/*(SuperClase)*/ {
    private double radio;
    private static final double PI = 3.1415;

    public Circulo(int x, int y, double radio) {
        super(x, y);    // invoca al constructo de la clase padre Figura
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return radio * radio * PI;
    }

    public double calcularPerimetro() {
        return 2 * PI * radio;
    }

    @Override
    public String toString() {
        return "El area de este circulo es: " + calcularArea() + ", y el parametro es: "+calcularPerimetro();
    }

    

}
