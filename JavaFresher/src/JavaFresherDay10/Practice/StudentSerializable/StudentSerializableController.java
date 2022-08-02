package JavaFresherDay10.Practice.StudentSerializable;

import java.util.*;
import java.io.*;

public class StudentSerializableController {

    public void writeToFile(String path, List<StudentSerializableModel> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<StudentSerializableModel> readDataFromFile(String path){
        List<StudentSerializableModel> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<StudentSerializableModel>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }


}
