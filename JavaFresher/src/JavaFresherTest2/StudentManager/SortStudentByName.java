package JavaFresherTest2.StudentManager;

import java.util.Comparator;

public class SortStudentByName implements Comparator<StudentModel> {
    @Override
    public int compare(StudentModel o1, StudentModel o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
