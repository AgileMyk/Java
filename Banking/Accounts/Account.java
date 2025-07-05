package Accounts;

import java.util.Date;

//MAKE ABSTRACT
/*
                            account
         checkingAccount              savingsAccount
 */
public class Account {
    private final Date openDate = new Date();
    private Date closeDate = new Date();
    private final Date DoB = new Date();
    private double balance;
    private int accountNumber;


    //Dates
    public Date getOpenDate() {
        return openDate;
    }
    public void setCloseDate(Date date) {
        date = closeDate;
    }
    public Date getCloseDate() {
        return closeDate;
    }

    //Balances
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }

    public void isClosed() {

    }


    public String toString() {
        return "Account [openDate=" + openDate + ", closeDate=" + closeDate + ", balance=" + balance;
    }
}
