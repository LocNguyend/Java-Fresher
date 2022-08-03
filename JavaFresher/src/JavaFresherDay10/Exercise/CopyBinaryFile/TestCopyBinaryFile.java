package JavaFresherDay10.Exercise.CopyBinaryFile;

import java.io.*;
import java.util.Scanner;

public class TestCopyBinaryFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input source file: ");
        String sourceFile = scanner.nextLine();
        System.out.println("Input destination file: ");
        String destFile = scanner.nextLine();
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destFile);

            byte[] buffer = new byte[1024];
            int noOfBytes = 0;

            System.out.println("Copying file using streams");

            while ((noOfBytes = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, noOfBytes);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        }
        catch (IOException ioe) {
            System.out.println("Exception while copying file " + ioe);
        }
        finally {
            // close the streams using close method
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            }
            catch (IOException ioe) {
                System.out.println("Error while closing stream: " + ioe);
            }
        }
    }
}
