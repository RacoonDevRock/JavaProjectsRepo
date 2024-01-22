package poo.upao.ejer4_introduction_herencia.ejemplo2;

public class Docente extends Persona {
    private String especialidad;
    private String condicion; 
    
    public Docente(String codigo, String nombres, String apellidos, String especialidad, String condicion) {
        super(codigo, nombres, apellidos);
        this.especialidad = especialidad;
        this.condicion = condicion;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getCondicion() {
        return condicion;
    }
    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }
}
