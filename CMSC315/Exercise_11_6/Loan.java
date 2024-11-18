
package Exercise_11_6;

public class Loan {
    private int loanID;
    private double amount;
    private double rate;

    public Loan(int loanID, double amount, double rate) {
        this.loanID = loanID;
        this.amount = amount;
        this.rate = rate;
    }

    public int getLoanID() {
        return loanID;
    }

    public void setLoanID(int loanID) {
        this.loanID = loanID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Loan{" + "loanID=" + loanID + ", amount=" + amount + '}';
    }
}
