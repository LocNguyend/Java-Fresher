package JavaFresherDay10.Practice.StudentSerializable;

import java.util.*;

public class TestStudentSerializable {

    public static void main(String[] args) {
        List<StudentSerializableModel> students = new ArrayList<>();
        students.add(new StudentSerializableModel(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new StudentSerializableModel(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new StudentSerializableModel(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new StudentSerializableModel(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new StudentSerializableModel(5, "Nguyễn Khắc Nhật", "Hà Nội"));

        StudentSerializableController controller = new StudentSerializableController();
        controller.writeToFile("student.txt", students);
        List<StudentSerializableModel> studentDataFromFile = controller.readDataFromFile("student.txt");

        StudentSerializableView view = new StudentSerializableView();
        view.printStudent(students);
        }

    }
