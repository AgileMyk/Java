package Exercises_12_24_and_12_25;

import java.util.ArrayList;
import java.util.Date;

public class Faculty {

    private final String firstName;
    private final String lastName;
    private final String status;
    private final double salary;
    private final Date dateCreated = new Date();

    static ArrayList<Faculty> faculties = new ArrayList<Faculty>();

    public Faculty(String firstName, String lastName, String status, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.salary = salary;
        faculties.add(this);
    }
    public int totalFaculty() {
        return faculties.size();
    }
    public Date getDateCreated() {
        return dateCreated;
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

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + status + " " + salary;
    }

    public static double totalSalaries_assistant() {
        double total = 0.0;
        for (Faculty faculty : faculties) {
            if (faculty.getStatus().equals("assistant")) {
                total += faculty.getSalary();
            }
        }
        System.out.println("The total salaries for assistant faculty is " + total);

        return total;
    }
    public static double totalSalaries_associate() {
        double total = 0.0;
        for (Faculty faculty : faculties) {
            if (faculty.getStatus().equals("associate")) {
                total += faculty.getSalary();
            }
        }
        System.out.print("The total salaries for associate faculty is " + total);

        return total;
    }
    public static double totalSalaries_full() {
        double total = 0.0;
        for (Faculty faculty : faculties) {
            if (faculty.getStatus().equals("full")) {
                total += faculty.getSalary();
            }
        }
        System.out.print("The total salaries for full faculty is " + total);
        return total;
    }
    public static double totalSalaries() {
        double total = 0;
        for (Faculty faculty : faculties) {
            total += faculty.getSalary();
        }
        System.out.print("The total salaries for full faculty is ");
        return total;
    }
}
