package poo.ticket_counter;

public class Ticket {

    private static int contador;
    private int numero;
    private String fechaCompra;
    private String DNIPersona;

    public Ticket(String fechaCompra, String dNIPersona) {
        contador++; // contador = contador + 1
        this.numero = contador;
        this.fechaCompra = fechaCompra;
        DNIPersona = dNIPersona;
    }

    @Override
    public String toString() {
        return "Ticket [numero=" + numero + ", fechaCompra=" + fechaCompra + ", DNIPersona=" + DNIPersona + "]";
    }

}
