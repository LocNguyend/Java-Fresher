package JavaFresherTest2.StudentManager;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Scanner;

public class StudentController {

    public static Scanner scanner = new Scanner(System.in);
    private List<StudentModel> studentModelList = new ArrayList<>();
    private StudentRepo studentRepo;

    public StudentController() {
        studentRepo = new StudentRepo();
    }

    public void findAll(){
        for (StudentModel i : studentModelList){
            System.out.println(i.toString());
        }
    }

    public void addStudent(){
        String name = inputName();
        Date birthDay = inputBirthDay();
        StudentModel student = new StudentModel(name,birthDay);
        studentModelList.add(student);
    }

    public void edit(String ID){
        for (int i = 0; i < studentModelList.size();i++){
            if (studentModelList.get(i).getFormatID().equalsIgnoreCase(ID)){
                studentModelList.get(i).setName(inputName());
                studentModelList.get(i).setBirthDay(inputBirthDay());
                break;
            }
        }
    }

    public void delete (String ID){
        StudentModel studentDelete = null;
        for (int i = 0; i < studentModelList.size(); i++){
            if(studentModelList.get(i).getFormatID().equalsIgnoreCase(ID)){
                studentDelete = studentModelList.get(i);
                break;
            }
        }
        if (studentDelete != null){
            studentModelList.remove(studentDelete);
        }else {
            System.out.println("ID not existed!");
        }
    }

    public void inputGradeList(){
        for (int i = 0; i < studentModelList.size(); i++){
            System.out.printf("Input grade of student id = %s", studentModelList.get(i).getFormatID());
            studentModelList.get(i).setGrade(inputGrade());
        }
        studentRepo.write(studentModelList);
    }

    private float inputGrade(){
        System.out.println("Input grade : ");
        return Float.parseFloat((scanner.nextLine()));
    }

    public void sortStudentByName(){
        Collections.sort(studentModelList, new SortStudentByName());
    }

    public void sortStudentByAge(){
        Collections.sort(studentModelList, new SortStudentByAge());
    }

    private String inputName(){
        String alphabet = "ABCDEFGHIJKLMN";
        System.out.println("Input student name: ");
        String name = scanner.nextLine();
        List<String> sameName = new ArrayList<>();
        if (!sameName.contains(name)){
            sameName.add(name);
            return name;
        }
        else {
            int count = 0;
            List<Integer> index = new ArrayList<>();
            for (int i = 0; i < studentModelList.size(); i++){
                if(studentModelList.get(i).getName().equalsIgnoreCase(name)){
                    index.add(i);
                }
            }
            for (int i = 0; i<index.size();i++){
                studentModelList.get(i).setName(name + alphabet.charAt(count));
                count ++ ;
            }
            return name + alphabet.charAt(count);
        }

        //return scanner.nextLine();
    }

    private Date inputBirthDay() {
        System.out.println("Input day of birth (as dd/mm/yyyy): ");
        String dayOfBirth = scanner.nextLine();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = (Date) df.parse(dayOfBirth);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return date;
    }
}
