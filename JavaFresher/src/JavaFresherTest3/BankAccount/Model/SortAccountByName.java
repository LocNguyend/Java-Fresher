package JavaFresherTest3.BankAccount.Model;

import java.util.Comparator;

public class SortAccountByName implements Comparator<Account> {
    @Override
    public int compare(Account o1, Account o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}
