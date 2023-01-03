package test;

import lombok.ToString;

@ToString
public class Tickets implements ITickets {
    private int id;
    private String type;
    private String destination;
    private String purchaseDate;

    public Tickets(int id, String type, String destination, String purchaseDate) {
        this.id = id;
        this.type = type;
        this.destination = destination;
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String getType() {
        return type;
    }
}
