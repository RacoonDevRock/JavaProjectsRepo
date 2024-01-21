package poo.notes.ejercicio4;

public class Atleta {
    private int numAtleta;
    private String nombre;
    private float tiempoCarrera;

    public Atleta(int numAtleta, String nombre, float tiempoCarrera) {
        this.numAtleta = numAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    public int getNumAtleta() {
        return numAtleta;
    }

    public String getNombre() {
        return nombre;
    }

    public float getTiempoCarrera() {
        return tiempoCarrera;
    }

    public String mostrarGanador(){
        return "\nGANADOR---\nAtleta: "+nombre.toUpperCase()+"\nN°:"+numAtleta+"\nTiempo en carrera: "+tiempoCarrera;
    }

}
