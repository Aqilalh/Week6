package Assignment;

public abstract class Ticket implements Payable{
    private int id;
    private String origin;

    private String destination;
    private String seatNumber;
    private double price;

    public Ticket(int id, String origin, String destination, String seatNumber, double price) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.seatNumber = seatNumber;
        this.price = price;
    }
}
