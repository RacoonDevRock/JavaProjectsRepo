package poo.notes.ejercicio1;

public class Cuadrilatero {
    // atributos
    private float lado1;
    private float lado2;

    // constructores
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    // getter y setter
    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    // metodos
    public float getPerimetro() {
        return 2 * (lado1 + lado2);
    }

    public float getArea() {
        return lado1 * lado2;
    }

}
