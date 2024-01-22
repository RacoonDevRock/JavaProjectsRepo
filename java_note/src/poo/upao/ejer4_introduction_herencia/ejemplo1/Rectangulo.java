package poo.upao.ejer4_introduction_herencia.ejemplo1;

public class Rectangulo extends Figura {
    private double largo;
    private double ancho;

    public Rectangulo(int x, int y, double largo, double ancho) {
        super(x, y);
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularArea() {
        return largo * ancho;
    }

    public double calcularPerimetro() {
        return (2*largo) + (ancho * 2);
    }

    @Override
    public String toString() {
        return "El area de este rectangulo es: " + calcularArea() + ", y el parametro es: "+calcularPerimetro();
    }
}
