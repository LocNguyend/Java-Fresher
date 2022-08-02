package JavaFresherTest2again.ClassStudent.Controller;


import JavaFresherTest2again.ClassStudent.Model.ClassStudent;
import JavaFresherTest2again.ClassStudent.Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

import static java.util.Calendar.YEAR;

public class ClassStudentController {
    public static Scanner scanner = new Scanner(System.in);
    List<Student> studentList = new ArrayList<>();
    List<ClassStudent> classStudentList = new ArrayList<>();

    public void findAll(){
        for (Student i : studentList){
            System.out.println(i.toString());
        }
    }

    public List<Student> allStudents(){
        return studentList;
    }

    public List<ClassStudent> allClassStudent(){
        return classStudentList;
    }

    public void addClassStudent(){
        int id = (classStudentList.size() > 0) ? (classStudentList.size() + 1) : 1;
        System.out.println("Class id: " + id);
        String nameClass = inputName();
        String headTeacher = inputName();
        ClassStudent classStudent = new ClassStudent(id,nameClass,headTeacher);
        classStudentList.add(classStudent);
    }

    public void addStudent(ClassStudent classStudent){
        int id = (studentList.size() > 0) ? (studentList.size() + 1) : 1;
        System.out.println("student id = " + id);
        String name = inputName();
        Date dayOfBirth = inputBirthday();
        Student student = new Student(id,name,classStudent,dayOfBirth);
        studentList.add(student);
        }

    public void editStudent(int ID) {
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getID() == ID){
                studentList.get(i).setName(inputName());
                studentList.get(i).setDayOfBirth(inputBirthday());
            }
        }
    }

    public void remove(int ID){
        Student delStudent = null;
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getID() == ID){
                delStudent = studentList.get(i);
            }
        }
        studentList.remove(delStudent);
    }

    public Student searchByName(String name){
        Student sStudent = null;
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getName().equalsIgnoreCase(name)){
                sStudent = studentList.get(i);
            }
        }
        return sStudent;
    }

    public void sortStudentByName(){
        Collections.sort(studentList, new SortStudentByName());
    }

    public List<Student> searchStudentByYear(int year){
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++){
            Calendar cL = Calendar.getInstance();
            cL.setTime(studentList.get(i).getDayOfBirth());
            int yearB = cL.get(YEAR);
            if (yearB == year){
                students.add(studentList.get(i));
            }
        }
        return students;
    }

    private String inputName(){
        System.out.print("Input student name: ");
        return scanner.nextLine();
    }

    private Date inputBirthday(){
        System.out.println("Input birthday of student: ");
        String birthDay = scanner.nextLine();
        Date dayOfBirth = new Date(birthDay);
        return dayOfBirth;
    }

}
