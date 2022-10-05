package Assignment;

public class CrewMember extends Person implements ServAble,Payable{
    public FlightCrewJob getJob() {
        return job;
    }

    public void setJob(FlightCrewJob job) {
        this.job = job;
    }

    private FlightCrewJob job;
    private float salary;

    public CrewMember(String name, FlightCrewJob job, float salary) {
        super(name);
        this.job = job;
        this.salary = salary;
    }

    public CrewMember(String name) {
        super(name);
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "CrewMember{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public void serve(Person person) {

        System.out.println("Now serving " + person.getName());
    }

    @Override
    public void printPaymentAmount() {
        System.out.println(salary);
    }
}
