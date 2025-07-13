package Persons;
//CHANGE PERSON HIERARCHY TO GO ONLY ONE-SUBCLASS DEEP, ALL OTHER FUNCTIONALITY BEING COMPOSITION

//use find function for 'correct' to access areas of needed change
import java.util.Date;


public abstract class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private Date DoB;
    private Date deceasedDate;
    private boolean isDeceased = false;


    //constructors

    public Person(){};

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

    public String returnFullName(Object o) {
        if (o instanceof Person) {
            /*
            Client c = (Client) o;
            return "The client's name: " + c;
            } else if (o instanceof Guarantor) {
                return "The guarantor's name: " + o.toString();
            } else if (o instanceof AuthorizedUser) {
                return "The authorized user's name: " + o;
            } else if (o instanceof Employee) {
            return "The employee's name: " + o;
          }   else if (o instanceof Person) {
                return "The person's name is: " + o;
             */
            return o.toString();
            } else {
            return "invalid object type";
        }
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

    public boolean getDeceasedStatus() {
        return isDeceased;
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
