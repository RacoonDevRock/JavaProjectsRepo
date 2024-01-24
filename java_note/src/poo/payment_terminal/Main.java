package poo.payment_terminal;

public class Main {
    public static void main(String[] args) {
        Posnet posnet = new Posnet();
        Persona p = new Persona("72647339", "Guille", "Traca", "999999999", "hola@mai.com");
        TarjetaDeCredito t = new TarjetaDeCredito("MazeBank", "7777777777777777", 30000, EntidadFinanciera.CASTERMARD, p);

        System.out.println("Tarjeta antes del pago...");
        System.out.println(t);

        System.out.println("");

        System.out.println("Ticket tras pagar...");
        Ticket ticketNuevo = posnet.efectuar(t, 1200, 3);
        System.out.println(ticketNuevo);

        System.out.println("");

        System.out.println("Tarjeta despues del pago");
        System.out.println(t);
    }
}
