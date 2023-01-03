package test;

public class Main {
    public static void main(String[] args) {
        Tickets[] tickets = new Tickets[]{
                new Tickets(123, "One-way", "Berlin", "09.12.2020"),
                new Tickets(123, "Round-way", "Munich", "09.12.2021")
        };
        PurchaseTicketSystem<Tickets> purchaseTicketSystem = new PurchaseTicketSystem<>(tickets);
        purchaseTicketSystem.purchaseTicketInfo();
        for (Tickets ticket : tickets) {
            System.out.println(ticket);
        }
    }
}
