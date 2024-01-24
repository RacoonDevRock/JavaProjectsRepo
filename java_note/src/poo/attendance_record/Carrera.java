package poo.attendance_record;

import java.util.ArrayList;

public class Carrera {

    private static ArrayList<Carrera> coleccionCarreras;
    private ArrayList<Materia> materias;
    private String nombre;
    private String facultad;

    public Carrera(ArrayList<Materia> materias, String nombre, String facultad) {
        this.materias = materias;
        this.nombre = nombre;
        this.facultad = facultad;
    }

    public static ArrayList<Carrera> getColeccionCarreras() {
        return coleccionCarreras;
    }

    public static void setColeccionCarreras(ArrayList<Carrera> coleccionCarreras) {
        Carrera.coleccionCarreras = coleccionCarreras;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void agregarMateria(Materia materia) {
        this.getMaterias().add(materia);
    }

    public void eliminarMateria(Materia materia) {
        this.getMaterias().remove(materia);
    }

    public int contarMaterias() {
        return this.getMaterias().size();
    }

    public Materia encontrarMateria(String nombre) {
        for (Materia materia : this.getMaterias()) {
            if (materia.getNombre().equals(nombre)) {
                return materia;
            }
        }
        return null;
    }
}
