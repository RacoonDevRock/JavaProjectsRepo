package poo.upao.ejer1_introduction;

public class Cuadrado {
    public double lado;

    public Cuadrado() {

    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    double calcularArea() {
        return lado * lado;
    }

    double calcularPerimetro() {
        return lado + lado;
    }

    @Override
    public String toString() {
        return "El area del cuadrado es: "+this.calcularArea()+"\nY perimetro es: "+this.calcularPerimetro();
    }
}
