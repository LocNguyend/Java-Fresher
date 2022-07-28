package JavaFresherDay9.Practice.ReadAndWrite;

import java.util.*;

public class NVCTestReadAndWriteFile {
    public static void main(String[] args) {

        ReadAndWriteFileView view = new ReadAndWriteFileView();
        ReadAndWriteFileModel model = new ReadAndWriteFileModel();
        model = view.getNameFile();

        ReadAndWriteFileController controller = new ReadAndWriteFileController();
        List<Integer> numbers = controller.readFile(model.getReadFile());
        int maxValue = controller.findMax(numbers);
        controller.writeFile(model.getWriteFile(), maxValue);
    }
}
