package JavaFresherTest3.BankAccount.Dao;

import JavaFresherTest3.BankAccount.Model.Account;
import java.io.*;

import java.io.File;
//import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class AccountDao {
    private static final String ACCOUNT_FILE_NAME =
            "C:\\Users\\admin\\IdeaProjects\\JavaFresher\\JavaFresher\\src\\JavaFresherTest3\\BankAccount\\account.txt";

    public void writeFile(List<Account> accountList){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(ACCOUNT_FILE_NAME));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(accountList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }

    public List<Account> readFile(){
        List<Account> accountList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(ACCOUNT_FILE_NAME));
            ois = new ObjectInputStream(fis);
            accountList = (List<Account>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return accountList;
    }

    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
