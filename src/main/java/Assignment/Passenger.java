package Assignment;

public class Passenger extends Person {
    private Ticket ticket;
    private String [] luggage;
    private double creditCardLimit;

    public Passenger(String name) {
        super(name);
    }

    public Passenger(String name, Ticket ticket, String[] luggage, double creditCardLimit) {
        super(name);
        this.ticket = ticket;
        this.luggage = luggage;
        this.creditCardLimit = creditCardLimit;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public double getCreditCardLimit() {
        return creditCardLimit;
    }

    public void setCreditCardLimit(double creditCardLimit) {
        this.creditCardLimit = creditCardLimit;
    }


    public String[] getLuggage() {
        return this.luggage;
    }

    public void setLuggage(String[] luggage) {
        this.luggage = luggage;
    }

    public  int getAmtOFLuggage(){
        return luggage.length;
    };
    public void printTicket(){
        System.out.println(this.ticket);
    };
}
