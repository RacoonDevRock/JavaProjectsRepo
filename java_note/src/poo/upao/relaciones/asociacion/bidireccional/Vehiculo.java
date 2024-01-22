package poo.upao.relaciones.asociacion.bidireccional;

public class Vehiculo {
    private String marca;
    private int aniof;
    private String placa;
    private String color;
    private Persona persona;    // cada vehiculo posee informacion de su persona
    
    public Vehiculo(String marca, int aniof, String placa, String color, Persona persona) {
        this.marca = marca;
        this.aniof = aniof;
        this.placa = placa;
        this.color = color;
        this.persona = persona;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAniof() {
        return aniof;
    }

    public void setAniof(int aniof) {
        this.aniof = aniof;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", aniof=" + aniof + ", placa=" + placa + ", color=" + color + ", persona="
                + persona + "]";
    }
}
