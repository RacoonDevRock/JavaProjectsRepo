package poo.payment_terminal;

public class Persona {
    private String DNI;
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;

    public Persona(String dNI, String nombre, String apellido, String telefono, String mail) {
        DNI = dNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Persona [DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
                + ", mail=" + mail + "]";
    }

    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

}
