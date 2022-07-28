package JavaFresherDay9.Exercise.ReadFileCSV;

import java.util.Scanner;

public class ReadFileCSVView {
    Scanner sc = new Scanner(System.in);

    public void showMessage(String smg) {
        System.out.println(smg);
    }

    public ReadFileCSVModel getNameFile() {

        ReadFileCSVModel model = new ReadFileCSVModel();
        System.out.println("Input path file to read: ");
        model.setReadFile(sc.nextLine());

        return model;
    }
}
