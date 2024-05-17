package ch1.disc;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    //no-arg constructor
    public Account() {
        this.dateCreated = new Date();
    }
    //A constructor that creates an account with the specified id and initial balance.
    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }
    //accessor and mutator methods
    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    //The accessor method for dateCreated.
    public Date getDateCreated() {
        return dateCreated;
    }
    //A method named getMonthlyInterestRate() that returns the monthly
    //interest rate.
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 12);
    }
    //A method named getMonthlyInterest() that returns the monthly interest.
    public double getMonthlyInterest() {
        return (balance * annualInterestRate) / 12;
    }
    //A method named withdraw that withdraws a specified amount from the
    //account.
    public void withdraw(double amount) {
        System.out.printf("You have withdrawn %.2f", amount);
        balance -= amount;
        System.out.printf("Your new balance is %.2f", balance);
    }
    //A method named deposit that deposits a specified amount to the account
    public void deposit(double amount) {
        System.out.printf("You have withdrawn %.2f", amount);
        balance += amount;
        System.out.printf("Your new balance is %.2f", balance);
    }
}

