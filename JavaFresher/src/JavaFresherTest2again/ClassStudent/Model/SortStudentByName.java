package JavaFresherTest2again.ClassStudent.Model;

import java.util.Comparator;

public class SortStudentByName implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student2.getName().compareTo(student1.getName());
    }
}
