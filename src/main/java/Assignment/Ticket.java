package Assignment;

public abstract class Ticket implements Payable{
    private int id;



    private String origin;

    private String destination;
    private String seatNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

    public Ticket(int id, String origin, String destination, String seatNumber, double price) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Ticket Id:" + id +'\n'+
                " Origin: " + origin + '\n' +
                " Destination: " + destination + '\n' +
                " seatNumber: " + seatNumber + '\n' +
                + price;
    }
}
