package Assignment;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FlightCrewJob flightCrewJob1 = FlightCrewJob.PILOT;
        FlightCrewJob flightCrewJob2 = FlightCrewJob.CO_PILOT;
        FlightCrewJob flightCrewJob3 = FlightCrewJob.FLIGHT_ATTENDANT;
        CrewMember crewMember1 = new CrewMember("Aqil",flightCrewJob1,100000.0f);
        CrewMember crewMember2 = new CrewMember("Bob",flightCrewJob2,900000.0f);
        CrewMember crewMember3 = new CrewMember("Bill",flightCrewJob3,70000.0f);
       PlaneTicket planeTicket = new PlaneTicket(23,"america","yemen","125b",100.0);
        BusTicket busTicket = new BusTicket(45,"canada","italy","58c",50.0);

        String [] luggage1 = {"Black Luggage", "green Luggage","red Luggage"};
        String [] luggage2 = {"blue luggage","purple luggage"};
        Passenger passenger57 = new Passenger("Aqil",busTicket,luggage1,1000.0);
        Passenger passenger07 = new Passenger("Ali",planeTicket,luggage2,800.0);
        Payable [] payables = { crewMember1,crewMember2,crewMember3, planeTicket,busTicket};
        ArrayList<FlightCrewJob> flightCrewJobs = new ArrayList<>();
       flightCrewJobs.add(flightCrewJob3);
       flightCrewJobs.add(flightCrewJob1);
       flightCrewJobs.add(flightCrewJob2);


        System.out.println(passenger57.getAmtOFLuggage());
        System.out.println("==============");
        passenger07.printTicket();
        System.out.println("==============");
       passenger57.getLuggage();
        System.out.println("================");
        crewMember3.serve(passenger57);
        System.out.println("==============");
       FlightApp.printAmountForEachThingThatIsPayable(payables);
        System.out.println("=========After Sorting=======");
    FlightApp.printEachFlightCrewJob(flightCrewJobs);
        System.out.println("========Before Sorting========");
        FlightApp.sortAndPrintCrewMembersByJob(flightCrewJobs);
        System.out.println("================");
        FlightApp.printAllJobsExceptThisCrewMemberJob(flightCrewJobs,crewMember1);

    }
}
