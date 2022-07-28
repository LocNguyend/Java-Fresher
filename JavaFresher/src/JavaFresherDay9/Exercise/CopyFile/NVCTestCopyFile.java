package JavaFresherDay9.Exercise.CopyFile;

import java.util.*;

public class NVCTestCopyFile {

    public static void main(String[] args) {

        CopyFileView view = new CopyFileView();
        CopyFileModel model = new CopyFileModel();
        model = view.getNameFile();

        CopyFileController controller = new CopyFileController();
        int numChar = 0;
        String textCopied = "";
        controller.readFile(model.getReadFile());
        numChar = controller.numChar;
        textCopied = controller.copiedText;
        controller.writeFile(model.getWriteFile(), textCopied, numChar);
    }
}
