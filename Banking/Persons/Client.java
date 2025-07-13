package Persons;

import Accounts.Account;

import java.lang.reflect.Array;
import java.util.*;


public class Client extends Person implements AuthorizedActions, Accounts.clientAccounts {

    protected boolean access; //should i make private?
    private Date signUpDate = new Date();
    private int SS;
    //List instead of Collections to support index Values
    List<Account> userAccounts = new ArrayList<Account>();
    private double balance = 0;


    public Client(String firstName, String middleName, String lastName, Date doB, int SS) {
        super(firstName, middleName, lastName, doB);
        SS = this.SS;
    }

    //equals method; prevent continual checking as soon as a value fails match
    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Client)) {
            return false;
        }
        boolean bool = true;
        while (bool != false) {
            bool = this.getFirstName().equals(((Person) o).getFirstName());
            bool = this.getMiddleName().equals(((Person) o).getMiddleName());
            bool = this.getLastName().equals(((Person) o).getLastName());
            bool = this.getDoB().equals(((Person) o).getDoB());
        }
        return bool;
    }

    //EDIT
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void createAccount(Account currentAccount) {
        userAccounts.add(currentAccount);
    }

    public double getBalance() {
        return this.balance;
    }

    public static void testing(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        Client me = new Client("John", "Smith", "John Smith", new Date(),111223333);
        Account testAccount = new Account();
        System.out.println(testAccount.getOpenDate());
        testAccount.toString();

        System.out.print("old balance: ");
        System.out.println(me.getBalance());
        me.depositFunds(5000.00);
        System.out.print("new balance: ");
        System.out.println(me.getBalance());


        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(5);
        ints.add(7);
        ints.add(3);
        ints.add(9);

        Stack<Integer> testStack = new Stack<>();
        testStack.push(5);
        testStack.push(7);

        Integer[] alsoInts = ints.toArray(new Integer[ints.size()]);
        //String[] moreInts = ints.toArray(new String[ints.size()]); <--invalid

        String[] array1 = new String[ints.size()];
        ints.toArray(new Integer[0]);
        //ints.toArray(array1); <-- invalid


        Client one = new Guarantor("f", "m", "l", new Date(2 - 7 - 1984));

        Person p1 = new Client(one.getFirstName(), "Smith", "John Smith", new Date(), 111223334);
        Client p2 = (Client) p1;

    }


    @Override
    public String toString() {
        return "name: " + getFirstName() + " " + getMiddleName() + " " + getLastName() +
                "\n" + "DoB: " + getDoB();
    }

    /*
    @Override
    public boolean Equals(Object p) {
        if (p instanceof Client) {
            if (this.getFirstName() == ((p.getFirstName())
                    && this.getMiddleName().equals(p.getMiddleName())
                    && this.getLastName().equals(p.getLastName())
                    && this.getDoB().equals(p.getDoB())
                    && (this.getDeceasedStatus() == p.getDeceasedStatus())
                    && this.getDeceasedDate().equals(p.getDeceasedDate())) {
                return true;
            }
        } else if (p instanceof Guarantor) {
            Guarantor g = (Guarantor) p;
        } else if (p instanceof AuthorizedUser) {
            AuthorizedUser au = (AuthorizedUser) p;
        } else if (p instanceof Employee) {
            Employee e = (Employee) p;
        } else {
            Person p1 = (Person) p;
        }
    }
}
     */

}

