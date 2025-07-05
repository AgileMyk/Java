package Persons;

import java.util.Date;

public abstract class Employee {
    String firstName;
    String lastName;
    Date dateOfBirth;
    String[] sexes = {"male","female"};
    String employeeID;
    String[] possibleStatus = {"hourly","salary","unpaidLeave","sabbatical"};
    String employeeStatus;
    Schedule schedule;
    private Schedule days;

    protected boolean checkShiftClock(Employee employee) {
        return true;
    }
}
