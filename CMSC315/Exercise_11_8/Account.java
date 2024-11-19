package Exercise_11_8;

import java.util.ArrayList;
import java.util.Date;

import static java.lang.System.in;

public class Account {
    private int transactionNumber = 000;
    final private String customerName;
    private int id;
    private double balance;
    private double annualInterestRate;
    final private Date dateCreated = new Date();
    private ArrayList<Transaction> transactions;

    public Account(String customerName, int id, double balance) {
        this.customerName = customerName;
        this.id = id;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public int getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public Date dateCreated() {
        return dateCreated;
    }
    public double withdraw(double amount) {
        Date thisDate = new Date();
        String currentTransactionNum = this.transactionNumber+"";
        this.transactionNumber++;
        Transaction thisTransaction = new Transaction('w',amount, balance,
                "a withdrawal in the amount of " + amount +
                        "on " + thisDate + " resulting in a balance of " + balance + "\nthis was transaction number "+ currentTransactionNum);
        transactions.add(thisTransaction);
        this.balance -= amount;
        return balance;
    }
    public double deposit(double amount) {
        Date thisDate = new Date();
        String currentTransactionNum = this.transactionNumber+"";
        this.transactionNumber++;
        Transaction thisTransaction = new Transaction('d',amount, balance,
                "a deposit in the amount of " + amount +
                        "on " + thisDate + " resulting in a balance of " + balance + "\nthis was transaction number "+ currentTransactionNum);
        transactions.add(thisTransaction);
        this.balance += amount;
        return balance;
    }
    public String inputDescription(String s) {
        return s;
    }
}
