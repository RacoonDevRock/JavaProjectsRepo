package poo.ejer2_introduction;

public class Circulo {
    private double radio;   // variable de instancia
    private static int nroCir;  // variable de clase

    // constructor por defecto
    public Circulo() {

    }

    // constructor con parametro
    public Circulo(double r) {
        this.radio = r;
        nroCir++;   // un conteo de la cantidad de instancias creadas(nro de circulos creadors)
    }

    // metodo setter -> modifica valor del atributo
    public void setRadio(double r) {
        this.radio = r;
    }
    
    // metodo gette -> obtiene valor del atributo
    public double getRadio() {
        return radio;
    }

    public double calcularArea() {
        return 3.1415*radio*radio;
    }

    public double calcularPerimetro() {
        return 2*3.1415*radio;
    }

    // metodo de la clase
    public static int getNroCirculos() {
        return nroCir;
    }

}
