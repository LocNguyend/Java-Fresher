package JavaFresherTest3.BankAccount.Model;

import java.io.Serializable;

public class AccountHistory implements Serializable {
    private int ID;
    private String description;
    private String type;
    private double amount;
    private int accountID;

    private Boolean isDesc;

    public AccountHistory(int ID, String description, Boolean isDesc, double amount, int accountID) {
        this.ID = ID;
        this.description = description;
        if (!isDesc){
            this.type = "Giảm";
        }
        else {
            this.type = "Tăng";
        }
        this.amount = amount;
        this.accountID = accountID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public Boolean getDesc() {
        return isDesc;
    }

    public void setDesc(Boolean desc) {
        isDesc = desc;
    }

    @Override
    public String toString() {
        return "AccountHistory{" +
                "ID=" + ID +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", accountID=" + accountID +
                ", isDesc=" + isDesc +
                '}' + "\n";
    }
}
