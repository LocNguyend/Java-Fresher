package JavaFresherDay9.Exercise.CopyFile;

import java.util.*;

public class CopyFileView {

    Scanner sc = new Scanner(System.in);

    public void showMessage(String smg) {
        System.out.println(smg);
    }

    public CopyFileModel getNameFile() {

        CopyFileModel model = new CopyFileModel();
        System.out.println("Input path file to read: ");
        model.setReadFile(sc.nextLine());
        System.out.println("Input path file to copy: ");
        model.setWriteFile(sc.nextLine());

        return model;
    }
}
