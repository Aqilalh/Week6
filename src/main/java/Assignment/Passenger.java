package Assignment;

public class Passenger {
    private Ticket ticket;
    private String [] luggage;
    private double creditCardLimit;

    public Passenger(Ticket ticket, String[] luggage, double creditCardLimit) {
        this.ticket = ticket;
        this.luggage = luggage;
        this.creditCardLimit = creditCardLimit;
    }

    public Passenger(Ticket ticket, double creditCardLimit) {
        this.ticket = ticket;
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
        return luggage;
    }

    public void setLuggage(String[] luggage) {
        this.luggage = luggage;
    }

    public int getAmtOFLuggage(){
        return 0;
    };
    public void printTicket(){
        System.out.println();
    };
}
