package poo.notes_ats.ejercicio6;

public class OperacionCompleja {
    private double real;
    private double imaginario;

    public OperacionCompleja(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public OperacionCompleja suma(OperacionCompleja otro) {
        return new OperacionCompleja(this.real + otro.real, this.imaginario + otro.imaginario);
    }

    public OperacionCompleja resta(OperacionCompleja otro) {
        return new OperacionCompleja(this.real - otro.real, this.imaginario - otro.imaginario);
    }

    public OperacionCompleja multiplicacion(OperacionCompleja otro) {
        double nuevoReal = this.real * otro.real - this.imaginario * otro.imaginario;
        double nuevoImaginario = this.real * otro.imaginario + this.imaginario * otro.real;
        return new OperacionCompleja(nuevoReal, nuevoImaginario);
    }

    public OperacionCompleja division(OperacionCompleja divisor) {
        double denominador = Math.pow(divisor.real, 2) + Math.pow(divisor.imaginario, 2);
        double nuevoReal = (this.real * divisor.real + this.imaginario * divisor.imaginario) / denominador;
        double nuevoImaginario = (this.imaginario * divisor.real - this.real * divisor.imaginario) / denominador;
        return new OperacionCompleja(nuevoReal, nuevoImaginario);
    }

    public String toString() {
        return real + " + " + imaginario + "i";
    }
}