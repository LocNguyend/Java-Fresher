package JavaFresherDay9.Practice.ReadAndWrite;

import JavaFresherDay9.Practice.ReadFileExample.ReadFileExampleModel;

import java.util.*;

public class ReadAndWriteFileView {

    Scanner sc = new Scanner(System.in);

    public void showMessage(String smg) {
        System.out.println(smg);
    }

    public ReadAndWriteFileModel getNameFile() {

        ReadAndWriteFileModel model = new ReadAndWriteFileModel();
        System.out.println("Input path file to read: ");
        model.setReadFile(sc.nextLine());
        System.out.println("Input path file to write: ");
        model.setWriteFile(sc.nextLine());

        return model;
    }
}
