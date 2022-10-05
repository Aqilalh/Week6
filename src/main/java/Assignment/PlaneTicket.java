package Assignment;

public class PlaneTicket extends Ticket{
protected boolean isFrequesntFlyer;

    public PlaneTicket(int id, String origin, String destination, String seatNumber, double price) {
        super(id, origin, destination, seatNumber, price);
    }

    @Override
    public void printPaymentAmount() {
        System.out.println(getPrice());
    }
}
