package JavaFresherDay9.Practice.ReadFileExample;

import java.io.*;

public class ReadFileExampleModel {
    public void readFileText(String filePath){
        try {
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = "";
        int sum = 0;
        while ((line = br.readLine()) != null){
            System.out.println(line);
            sum += Integer.parseInt(line);
        }
        br.close();
        System.out.println("Sum = " + sum);
        } catch (Exception e){
            System.err.println("File not exist hoac noi dung co loi");
        }
    }
}
