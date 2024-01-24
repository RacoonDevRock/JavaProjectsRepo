package poo.ticket_counter;

public class Main {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket("2021/07/20", "72647339");
        Ticket ticket2 = new Ticket("2021/07/16", "72648339");
        Ticket ticket3 = new Ticket("2021/07/19", "72657339");
        Ticket ticket4 = new Ticket("2021/07/18", "72547339");

        System.out.println(ticket1);
        System.out.println(ticket2);
        System.out.println(ticket3);
        System.out.println(ticket4);
    }
}
