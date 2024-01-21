package poo.ejer1_introduction;

public class Empleado {
    public String nombre;
    public int numeroHoras;
    private static final int sueldoFijo = 80;   //Similar a las variables de Instancia, con la diferencia que sus valores se aplican a todas las instancias y a la misma clase. Se definen y almacenan en laClase. No hay una copia del dato para cada objeto sino una sola copia quees compartida por todos los objetos de laclase.

    public Empleado() {

    }

    public Empleado(String nombre, int numeroHoras) {
        this.nombre = nombre;
        this.numeroHoras = numeroHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public static int getSueldofijo() {
        return sueldoFijo;
    }

    double calcularSueldo() {
        return numeroHoras * sueldoFijo;
    }

    @Override
    public String toString() {
        return "Empleado con nombre '"+this.nombre.toUpperCase()+"'', gana $"+calcularSueldo();
    }

    
}
