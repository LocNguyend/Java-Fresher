package JavaFresherDay9.Exercise.ReadFileCSV;

import java.util.Scanner;

public class NVCTestReadFileCSV {

    public static void main(String[] args) {

        ReadFileCSVView view = new ReadFileCSVView();
        ReadFileCSVModel model = new ReadFileCSVModel();
        model = view.getNameFile();

        ReadFileCSVController controller = new ReadFileCSVController();
        controller.readFileText(model.getReadFile());
    }
}
