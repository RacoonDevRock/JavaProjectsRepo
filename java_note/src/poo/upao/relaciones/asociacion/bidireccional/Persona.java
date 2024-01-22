package poo.upao.relaciones.asociacion.bidireccional;

import java.util.Arrays;

public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private String fechaNac;
    private Vehiculo vehiculos[];  // Una persona posee varios vehiculos - 1 tiene *
    
    public Persona(String dni, String nombre, String apellido, String fechaNac, Vehiculo[] vehiculos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.vehiculos = vehiculos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac
                + ", vehiculos=" + Arrays.toString(vehiculos) + "]";
    }
}
