package test;

public class PurchaseTicketSystem<T extends ITickets> {
    T[] tickets;

    public PurchaseTicketSystem(T[] tickets) {
        this.tickets = tickets;
    }

    public void purchaseTicketInfo() {
        for (ITickets ticket : tickets) {
            System.out.println(ticket.getType());
        }
    }
}
