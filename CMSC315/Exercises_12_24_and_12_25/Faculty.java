package Exercises_12_24_and_12_25;

public class Faculty {

    private final String firstName;
    private final String lastName;
    private final String status;
    private final double salary;

    public Faculty(String firstName, String lastName, String status, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getStatus() {
        return status;
    }
    public double getSalary() {
        return salary;
    }

}
