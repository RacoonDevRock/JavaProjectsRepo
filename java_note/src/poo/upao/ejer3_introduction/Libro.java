package poo.upao.ejer3_introduction;

public class Libro {
    private double codigo;
    private String titulo;
    private String anio;
    private float precio;

    public Libro(double codigo, String titulo, String anio, float precio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anio;
        this.precio = precio;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
