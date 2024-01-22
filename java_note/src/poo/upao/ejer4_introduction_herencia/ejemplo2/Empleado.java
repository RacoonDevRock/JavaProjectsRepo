package poo.upao.ejer4_introduction_herencia.ejemplo2;

public class Empleado extends Persona {
    private String cargo;
    private String horario; 

    public Empleado(String codigo, String nombres, String apellidos, String cargo, String horario) {
        super(codigo, nombres, apellidos);
        this.cargo = cargo;
        this.horario = horario;
    }
    
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
}
