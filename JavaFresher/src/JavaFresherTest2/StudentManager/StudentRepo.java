package JavaFresherTest2.StudentManager;

import java.util.*;
import java.io.*;

public class StudentRepo {
    private static final String STUDENT_FILE_NAME =
            "C:\\Users\\admin\\IdeaProjects\\JavaFresher\\JavaFresher\\src\\JavaFresherTest2\\StudentManager\\student.txt";

    public void write(List<StudentModel> studentModelList){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(STUDENT_FILE_NAME));
            oos = new ObjectOutputStream(fos);
            for (StudentModel student : studentModelList){
                oos.writeObject(student.getName() + student.getGrade());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }

    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
