package poo.notes.ejercicio5;

public class TrianguloIsosceles {
    private double base;
    private double lado;

    public TrianguloIsosceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double obtenerPerimetro() {
        return 2 * lado + base;
    }

    public double obtenerArea() {
        return (base * Math.sqrt((lado * lado) - ((base * base) / 4))) / 2;
    }

    public String mostrarDatos() {
        return "Base: " + base + "\nLado: " + lado + "\nPerimetro: " + obtenerPerimetro() + "\nArea: " + obtenerArea()
                + "\n";
    }

}
