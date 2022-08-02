package JavaFresherTest2again.ClassStudent.Model;

import java.util.*;

public class Student {
    private int ID;
    private String name;
    private ClassStudent classStudent;
    private Date dayOfBirth;

    public Student(int ID, String name, ClassStudent classStudent, Date dayOfBirth) {
        this.ID = ID;
        this.name = name;
        this.classStudent = classStudent;
        this.dayOfBirth = dayOfBirth;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    //    public static int getID() {
//        return ID;
//    }
//
//    public static void setID(int ID) {
//        Student.ID = ID;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassStudent getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(ClassStudent classStudent) {
        this.classStudent = classStudent;
    }

    public Date getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", classStudent=" + classStudent +
                ", dayOfBirth=" + dayOfBirth +
                '}';
    }
}
