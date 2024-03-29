package poo.notes_ats.constante;

public class Persona {
    private final String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("El nombre es "+nombre+" y la edad es: "+edad);
    }
}
