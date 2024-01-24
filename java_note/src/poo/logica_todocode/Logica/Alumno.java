package poo.logica_todocode.Logica;

public class Alumno {
    int id;
    String nombre;
    String apellido;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrarNombre() {
        System.out.println("Mi nombre es... " + this.nombre);
    }

    public boolean aprobado(double calificacion) {
        if (calificacion >= 6) {
            return true;
        } else {
            return false;
        }
    }
}
