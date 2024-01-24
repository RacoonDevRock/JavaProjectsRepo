package poo.attendance_record;

import java.util.ArrayList;
import java.util.Date;

public class Asistencia {
    private Date fecha;
    private ArrayList<Alumno> alumnos;

    public Asistencia(Date fecha, ArrayList<Alumno> alumnos) {
        this.fecha = fecha;
        this.alumnos = alumnos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void agregarAlumno(Alumno alumno) {
        this.getAlumnos().add(alumno);
    }

    public void eliminarAlumno(Alumno alumno) {
        this.getAlumnos().remove(alumno);
    }

    public int contarAlumnos() {
        return this.getAlumnos().size();
    }
}
