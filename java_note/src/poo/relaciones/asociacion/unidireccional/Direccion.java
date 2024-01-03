package poo.relaciones.asociacion.unidireccional;

public class Direccion {
    private int numero;
    private String calle;
    
    public Direccion() {
    }
    public Direccion(int numero, String calle) {
        this.numero = numero;
        this.calle = calle;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    @Override
    public String toString() {
        return "Direccion [numero=" + numero + ", calle=" + calle + "]";
    }
}
