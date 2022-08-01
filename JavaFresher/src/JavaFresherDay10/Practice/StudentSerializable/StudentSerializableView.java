package JavaFresherDay10.Practice.StudentSerializable;

import java.util.ArrayList;
import java.util.List;

public class StudentSerializableView {
    List<StudentSerializableModel> students = new ArrayList<>();

    void printStudent(List<StudentSerializableModel> students){
        for (StudentSerializableModel student : students){
            System.out.println(student);
        }
    }
}
