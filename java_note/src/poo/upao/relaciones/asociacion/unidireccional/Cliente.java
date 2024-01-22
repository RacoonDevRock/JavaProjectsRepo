package poo.upao.relaciones.asociacion.unidireccional;

public class Cliente {
    private String dni;
    private String nombres;
    private Direccion dir;  // Un cliente posee una direcion - 1 a 1
    
    public Cliente() {
    }

    public Cliente(String dni, String nombres, Direccion dir) {
        this.dni = dni;
        this.nombres = nombres;
        this.dir = dir;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Direccion getDir() {
        return dir;
    }

    public void setDir(Direccion dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "Cliente [dni=" + dni + ", nombres=" + nombres + ", dir=" + dir + "]";
    }
}
