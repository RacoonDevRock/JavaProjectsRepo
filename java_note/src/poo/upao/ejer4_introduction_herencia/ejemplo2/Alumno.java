package poo.upao.ejer4_introduction_herencia.ejemplo2;

public class Alumno extends Persona {
    private String anioIngreso;
    private String ciclo;

    public Alumno(String codigo, String nombres, String apellidos, String anioIngreso, String ciclo) {
        super(codigo, nombres, apellidos);
        this.anioIngreso = anioIngreso;
        this.ciclo = ciclo;
    }
    
    public String getAnioIngreso() {
        return anioIngreso;
    }
    public void setAnioIngreso(String anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
    public String getCiclo() {
        return ciclo;
    }
    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
}
