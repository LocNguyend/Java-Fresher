package JavaFresherTest3.BankAccount.Controller;

import JavaFresherTest3.BankAccount.Dao.AccountDao;
import JavaFresherTest3.BankAccount.Model.Account;
import JavaFresherTest3.BankAccount.Model.AccountHistory;
import JavaFresherTest3.BankAccount.Model.SortAccountByName;

import java.util.*;

public class AccountController {
    public static Scanner scanner = new Scanner(System.in);
    private List<Account> accountList;
    private AccountDao accountDao;

    private List<AccountHistory> accountHistories = new ArrayList<>();

    public List<AccountHistory> getAccountHistories() {
        return accountHistories;
    }

    public void setAccountHistories(List<AccountHistory> accountHistories) {
        this.accountHistories = accountHistories;
    }

    public AccountController() {
        accountDao = new AccountDao();
        accountList = accountDao.readFile();
    }

    public void addAccount() {
        //int id = (accountList.size() > 0) ? (accountList.size() + 1) : 1;
        System.out.println("Account ID = " + (accountList.size() + 1));
        scanner.nextLine();
        String nameAccount = inputNameAccount();
        double amount = inputAccountAmount();
        int accountNumber = inputAccountNumber();
        System.out.println();
        Account account = new Account(nameAccount,amount,accountNumber);
        accountList.add(account);
        accountDao.writeFile(accountList);
        System.out.println();
    }

    public void edit (int id) {
        boolean isExisted = false;
        int size = accountList.size();
        for (int i = 0; i < size; i++) {
            if (accountList.get(i).getID() == id) {
                isExisted = true;
                accountList.get(i).setFullName(inputNameAccount());
                accountList.get(i).setAmount(inputAccountAmount());
                accountList.get(i).setAccountNumber(inputAccountNumber());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
            accountDao.writeFile(accountList);
        }
    }

    public void delete (int id){
        Account account = null;
        int size = accountList.size();
        for (int i = 0; i < size; i++) {
            if (accountList.get(i).getID() == id) {
                account = accountList.get(i);
                break;
            }
        }
        if (account != null) {
            accountList.remove(account);
            accountDao.writeFile(accountList);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
    }

    public void sortAccountByName(){
        Collections.sort(accountList, new SortAccountByName());
    }

    public Account findByName(String name){
        Account account = null;
        int size = accountList.size();
        for (int i = 0; i < size; i++) {
            if (accountList.get(i).getFullName().toUpperCase(Locale.ROOT).equals(name.toUpperCase())) {
                account = accountList.get(i);
                break;
            }
        }
        if (account != null) {
            return account;
        } else {
            System.out.printf("name = %s not existed.\n", name);
            return null;
        }
    }

    public void show(){
        for (Account account : accountList){
            System.out.format("%5d | ", account.getID());
            System.out.format("%20s | ", account.getFullName());
            System.out.format("%20d | ", account.getAccountNumber());
            System.out.format("%20f | ", account.getAmount());
            System.out.println();
        }
        System.out.println();
    }

    public void withdraw(Account account){
        addWithdrawHistories(account);
        double amountWithdraw = account.getAccountHistories().get(accountHistories.size()-1).getAmount();
        if (amountWithdraw > account.getAmount()){
            System.out.println("Amount not available to withdraw !");
        }
        else {
            double currnet = account.getAmount();
            currnet = currnet - amountWithdraw;
            account.setAmount(currnet);
            accountDao.writeFile(accountList);
            //addWithdrawHistories(account);
        }
    }

    public void transfer(Account account){
        addTransferHistories(account);
        double amountWithdraw = account.getAccountHistories().get(accountHistories.size()-1).getAmount();
        double currnet = account.getAmount();
        currnet = currnet + amountWithdraw;
        account.setAmount(currnet);
        accountDao.writeFile(accountList);
        //addWithdrawHistories(account);
    }

    public void addWithdrawHistories(Account account){
        int id = (accountHistories.size() > 0) ? (accountHistories.size() + 1) : 1;
        double amount = inputAmountWithdraw();
        int accountID = account.getID();
        Boolean isDesc = false;
        scanner.nextLine();
        String des = inputDescription();
        AccountHistory accountHistory = new AccountHistory(id,des,isDesc,amount,accountID);
        accountHistories.add(accountHistory);
        for (int i = 0; i< accountList.size();i++){
            if (accountList.get(i).getID() == account.getID()){
                accountList.get(i).setAccountHistories(accountHistories);
            }
        }
        accountDao.writeFile(accountList);
    }

    public void addTransferHistories(Account account){
        int id = (accountHistories.size() > 0) ? (accountHistories.size() + 1) : 1;
        double amount = inputAmountTransfer();
        int accountID = account.getID();
        Boolean isDesc = true;
        scanner.nextLine();
        String des = inputDescription();
        AccountHistory accountHistory = new AccountHistory(id,des,isDesc,amount,accountID);
        accountHistories.add(accountHistory);
        for (int i = 0; i< accountList.size();i++){
            if (accountList.get(i).getID() == account.getID()){
                accountList.get(i).setAccountHistories(accountHistories);
            }
        }
        accountDao.writeFile(accountList);
    }

    public String inputNameAccount(){
        System.out.print("Input fullname of account: ");
        String name = scanner.nextLine();
        return name;
    }

    public double inputAccountAmount(){
        System.out.println("Input amount of account: ");
        return scanner.nextDouble();
    }

    public int inputAccountNumber(){
        System.out.println("Input number of account: ");
        return scanner.nextInt();
    }

    public String inputDescription(){
        System.out.print("Input description for account history: ");
        return scanner.nextLine();
    }

    public double inputAmountWithdraw(){
        System.out.println("Input amount withdraw: ");
        return scanner.nextDouble();
    }

    public double inputAmountTransfer(){
        System.out.println("Input amount transfer: ");
        return scanner.nextDouble();
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }
}
