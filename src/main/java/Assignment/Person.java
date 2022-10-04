package Assignment;

public abstract class  Person {
    public Person(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
