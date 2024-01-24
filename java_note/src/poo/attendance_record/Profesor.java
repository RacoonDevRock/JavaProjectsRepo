package poo.attendance_record;

public class Profesor {
    private String nombre;
    private int legajo;
    private double basico;
    private int antiguedad;

    public Profesor(String nombre, int legajo, double basico, int antiguedad) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    // Se calcula el sueldo de acuerdo a las instrucciones en el diagrama: cada 5 años de antigüedad se suma un 10%
    public double calcularSueldo() {
        double sueldoIncrementado = this.getBasico();

        int cantidadDeAumentos = (int)(this.getAntiguedad() / 5); //resultado entero

        // agrega 10% por cada 5 años de antiguedad
        for (int i = 0; i < cantidadDeAumentos; i++) {
            sueldoIncrementado += (this.getBasico() * 0.1);
        }
         return sueldoIncrementado;
    }
}
