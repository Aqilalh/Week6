package Assignment;

public class CrewMember extends Person implements ServAble{
    public CrewMember(String name) {
        super(name);
    }
private FlightCrewJob job;
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    private float salary;

    @Override
    public String toString() {
        return "CrewMember{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public void serve(Person person) {

    }
}
