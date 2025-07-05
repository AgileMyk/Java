package Persons;

import Accounts.Account;
import Accounts.clientAccounts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client extends Person implements AuthorizedActions, Accounts.clientAccounts {

    private List<Account> clientAccounts = new ArrayList<>();

    public Client(String firstName, String middleName, String lastName, Date doB) {
        super(firstName, middleName, lastName, doB);
    }

    public void createAccount(Account currentAccount) {
        clientAccounts.add(currentAccount);
    }

    public static void main(String[] args) {
        Client me = new Client("John", "Smith", "John Smith", new Date());
        Account testAccount = new Account();
        System.out.println(testAccount.getOpenDate());
        testAccount.toString();

        Client one = new Guarantor("f","m","l", new Date(2-7-1984));


    }



    @Override
    public String toString() {
        return "name: " + getFirstName() + " " + getMiddleName() + " " + getLastName() +
                "\n" + "DoB: " + getDoB();
    }

}

