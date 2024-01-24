package poo.notes_ats.ejercicio10;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculos[] = new Vehiculo[4];

        vehiculos[0] = new Vehiculo("GH67", "Ferrari", "0ER");
        vehiculos[1] = new VehiculoTurismo("PL45", "ranca", "tru98", 3);
        vehiculos[2] = new VehiculoDeportivo("EX54", "towell", "racer", 500);
        vehiculos[3] = new VehiculoFurgoneta("KJ8", "suzuki", "raptor", 234);

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("");
            System.out.println(vehiculo.mostrarDatos());
        }
    }
}
