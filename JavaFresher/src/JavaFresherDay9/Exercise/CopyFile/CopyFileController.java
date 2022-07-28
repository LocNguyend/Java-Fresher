package JavaFresherDay9.Exercise.CopyFile;
import java.util.*;
import java.io.*;


public class CopyFileController {
    int numChar = 0;
    String copiedText = "";

    public void readFile(String filePath){
        CopyFileView view = new CopyFileView();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                copiedText += line;
                copiedText += "\n";
                numChar += line.length();
            }
            br.close();
        } catch (Exception e) {
            view.showMessage("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public void writeFile(String filePath, String copied, int numChar){
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(copied + "\n" + "Numbers of chars is: " + numChar );
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
