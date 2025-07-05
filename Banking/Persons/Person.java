package Persons;

//use find function for 'correct' to access areas of needed change
import java.util.Date;

public abstract class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private final Date DoB;
    private Date deceasedDate;
    private boolean isDeceased = false;

    //constructors
    public Person(Date DoB) {
        this.DoB = DoB;
    };

    public Person(String firstName, String middleName, String lastName, Date doB) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.DoB = doB;
    }
    //names
    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getLastName() {
        return lastName;
    }

    public void changeFirstName(String firstName) {
        this.firstName = firstName;
    };
    public void changeMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void changeLastName(String lastName) {
        this.lastName = lastName;
    }

    //dates
    public Date getDoB() {
        return DoB;
    }
    public void setDeceasedDate(Date deceasedDate) {
        this.deceasedDate = deceasedDate;
        this.isDeceased = true;
    }
    public Date getDeceasedDate() {
        return deceasedDate;
    }

    //deceasedActions
    public void deceasedFlag() {
        if (isDeceased) {
            //CORRECT
            System.out.println("Deceased");
        }
    }

}
