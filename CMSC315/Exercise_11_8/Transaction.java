package Exercise_11_8;

import java.util.Date;

public class Transaction {
    final private Date date = new Date();
    private char type;
    private double amount;
    private double balance;
    final private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;

    }
}
