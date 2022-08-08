package JavaFresherTest3.BankAccount.Model;

import java.io.Serializable;
import java.util.List;

public class Account implements Serializable {
    private int ID;
    public static int count = 0;
    private String fullName;
    private double amount;
    private int accountNumber;
    private List<AccountHistory> accountHistories;

    public Account() {
        count++;
        ID = count;
    }

    public Account(String fullName, double amount, int accountNumber) {
        count ++;
        this.ID = count;
        this.fullName = fullName;
        this.amount = amount;
        this.accountNumber = accountNumber;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public List<AccountHistory> getAccountHistories() {
        return accountHistories;
    }

    public void setAccountHistories(List<AccountHistory> accountHistories) {
        this.accountHistories = accountHistories;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ID=" + ID +
                ", fullName='" + fullName + '\'' +
                ", amount=" + amount +
                ", accountNumber=" + accountNumber +
                ", accountHistories=" + accountHistories +
                '}';
    }
}
