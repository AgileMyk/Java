package Persons;

import java.util.Date;

public class Guarantor extends Client implements AuthorizedActions {

    public Guarantor(String firstName, String middleName, String lastName, Date doB) {
        super(firstName, middleName, lastName, doB);
    }

    @Override
    public void withdrawFunds(double amount) {

    }
}
