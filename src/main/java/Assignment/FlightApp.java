package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class FlightApp {
    public static void printEachFlightCrewJob(ArrayList<FlightCrewJob> flightCrewJobs) {
        for (int i = 0; i < flightCrewJobs.size(); i++) {
            System.out.println(flightCrewJobs.get(i));
        }
    }

    public static void printAmountForEachThingThatIsPayable(Payable[] payables) {
        for (int i = 0; i < payables.length; i++) {
            payables[i].printPaymentAmount();
        }
    }

    ;

    public static void sortAndPrintCrewMembersByJob(ArrayList<FlightCrewJob> flightCrewJobs) {
        Collections.sort(flightCrewJobs, new SortArraylist());
        for (FlightCrewJob x : flightCrewJobs) {
            System.out.println(x.toString());
        }
    }

    ;

    public static void printAllJobsExceptThisCrewMemberJob(ArrayList<FlightCrewJob> flightCrewJobs, CrewMember crewMember) {
        //String x = crewMember.toString();
        for(FlightCrewJob flightCrewJob: flightCrewJobs){
            if(flightCrewJob != crewMember.getJob()){
                System.out.println(flightCrewJob);
            }
        }

       // for (int i = 0; i < flightCrewJobs.size(); i++) {
         //   if(flightCrewJobs.get(i) == crewMember)
       // }
    }//
}





