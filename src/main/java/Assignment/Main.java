package Assignment;

public class Main {
    public static void main(String[] args) {
        FlightCrewJob flightCrewJob1 = FlightCrewJob.PILOT;
        FlightCrewJob flightCrewJob2 = FlightCrewJob.CO_PILOT;
        FlightCrewJob flightCrewJob3 = FlightCrewJob.FLIGHT_ATTENDANT;
        CrewMember crewMember1 = new CrewMember("Aqil");
        CrewMember crewMember2 = new CrewMember("Bob");
        CrewMember crewMember3 = new CrewMember("Bill");
        Ticket ticket1 = new PlaneTicket(23,"america","yemen","125b",200.0);
        Ticket ticket2 = new BusTicket(45,"canada","italy","58c",340.53);

        Passenger passenger57 = new Passenger(ticket1,1000.0);
        Passenger passenger07 = new Passenger(ticket2,500.0);

        passenger07.printTicket();

    }
}
