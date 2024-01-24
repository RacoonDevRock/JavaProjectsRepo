package poo.notes_ats.ejercicio7;

public class Estudiante extends Persona {
    private int codigoEstudiante;
    private float notaFinal;

    public Estudiante(String nombre, String apellidos, int edad, int codigoEstudiante, float notaFinal) {
        super(nombre, apellidos, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos() {
        System.out.println("Nombre y Apellidos: " + getNombre() + " " + getApellidos() + "\nEdad: " + getEdad()
                + "\nCodigo estudiante: " + codigoEstudiante + "\nNota final: " + notaFinal);
    }

}
