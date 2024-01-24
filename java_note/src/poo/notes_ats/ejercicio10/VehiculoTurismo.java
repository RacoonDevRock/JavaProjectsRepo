package poo.notes_ats.ejercicio10;

public class VehiculoTurismo extends Vehiculo {
    private int numeroPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String mostrarDatos() {
        return "Matricula: " + getMatricula() + "\nMarca: " + getMarca() + "\nModelo: " + getModelo()
                + "\nNumero de puertas: " + numeroPuertas;
    }

}
