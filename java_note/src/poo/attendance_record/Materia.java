package poo.attendance_record;

import java.util.Date;

public class Materia {
    private String nombre;
    private Profesor titular;

    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public void agregarAlumno(Alumno alumno) {

    }

    public void eliminarAlumno(Alumno alumno) {

    }

    public void agregarAsistencia(Asistencia asistencia) {

    }

    public void eliminarAsistencia(Asistencia asistencia) {

    }

    public int calcularInscriptos() {
        return 0;
    }

    public double calcularAsistencia(Date fecha) {
        return 0.0;
    }

}
