package JavaFresherDay9.Practice.ReadFileExample;

import java.util.*;
import java.util.*;

public class TestReadFileExample {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExampleModel readfileEx = new ReadFileExampleModel();
        readfileEx.readFileText(path);
    }

}
