package Assignment;

public class Main {
    public static void main(String[] args) {
        FlightCrewJob flightCrewJob1 = FlightCrewJob.PILOT;
        FlightCrewJob flightCrewJob2 = FlightCrewJob.CO_PILOT;
        FlightCrewJob flightCrewJob3 = FlightCrewJob.FLIGHT_ATTENDANT;
        CrewMember crewMember1 = new CrewMember("Aqil");
        CrewMember crewMember2 = new CrewMember("Bob");
        CrewMember crewMember3 = new CrewMember("Bill");
        Ticket ticket1 = new PlaneTicket(23,"america","yemen","125b",100.0);
        Ticket ticket2 = new BusTicket(45,"canada","italy","58c",50.0);

        String [] luggage1 = {"Black Luggage", "green Luggage","red Luggage"};
        String [] luggage2 = {"blue luggage","purple luggage"};
        Passenger passenger57 = new Passenger(ticket1,1000.0,luggage1);
        Passenger passenger07 = new Passenger(ticket2,800.0,luggage2);


        System.out.println(passenger57.getAmtOFLuggage());
       // System.out.println(passenger07.printTicket());
        //System.out.println(crewMember1.serve(passenger57));
    }
}
