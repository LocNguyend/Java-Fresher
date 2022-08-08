package JavaFresherTest3.BankAccount;

import JavaFresherTest3.BankAccount.Controller.AccountController;
import JavaFresherTest3.BankAccount.Model.Account;

import java.util.Scanner;

public class TestAccountManager {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        AccountController accountController = new AccountController();
        int accountID;

        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    accountController.addAccount();
                    System.out.println();
                    break;
                case "3":
                    System.out.println("Input ID account edit: ");
                    accountID = scanner.nextInt();
                    accountController.edit(accountID);
                    break;
                case "2":
                    accountController.show();
                    break;
                case "4":
                    System.out.println("Input ID account remove: ");
                    accountID = scanner.nextInt();
                    accountController.delete(accountID);
                    break;
                case "5":
                    System.out.println("Input ID name: ");
                    String accountName = scanner.nextLine();
                    accountController.findByName(accountName);
                    break;
                case "6":
                    accountController.sortAccountByName();
                    accountController.show();
                    break;
                case "7":
                    Account account = new Account();
                    System.out.println("Input ID account to withdraw: ");
                    accountID = scanner.nextInt();
                    for (int i = 0; i < accountController.getAccountList().size(); i++){
                        if (accountController.getAccountList().get(i).getID() == accountID){
                            account = accountController.getAccountList().get(i);
                        }
                    }
                    accountController.withdraw(account);
                    break;
                case "0":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
    }

    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add account");
        System.out.println("2. Show account list.");
        System.out.println("3. Edit account by id.");
        System.out.println("4. Remove account by id.");
        System.out.println("5. Find account by name.");
        System.out.println("6. Sort account by name.");
        System.out.println("7. Withdraw money.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
