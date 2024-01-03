package poo.relaciones.asociacion.bidireccional;

public class PruebaRelacionBidireccional {
    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo("Hyundai", 1987, "RET-849", "ROJO", null);
        Vehiculo v2 = new Vehiculo("Toyora", 1584, "JUH-596", "AMARILLO", null);

        Vehiculo[] vehiculosP1 = {v1,v2};
        Persona p1 = new Persona("72647339", "Guillermo", "Palacios", "15/03/2004", vehiculosP1);

        v1.setPersona(p1);
        v2.setPersona(p1);

        System.out.println("Vehiculos de "+p1.getNombre()+" "+p1.getApellido());
        for (Vehiculo vehiculo : p1.getVehiculos()) {
            System.out.println(vehiculo.getMarca()+" - "+vehiculo.getPlaca());
        }
    }
}
