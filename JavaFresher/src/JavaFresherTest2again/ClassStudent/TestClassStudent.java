package JavaFresherTest2again.ClassStudent;

import JavaFresherTest2again.ClassStudent.Controller.ClassStudentController;
import JavaFresherTest2again.ClassStudent.Model.ClassStudent;
import JavaFresherTest2again.ClassStudent.Model.Student;

import java.util.*;

public class TestClassStudent {

    public static Scanner scanner = new Scanner(System.in);

    public static void printStudent(ClassStudentController list){
        list.findAll();
    }

    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add student.");
        System.out.println("2. in hoc sinh theo class.");
        System.out.println("3. Sua student theo id");
        System.out.println("4. xoa student theo id");
        System.out.println("5. tim kiem theo name");
        System.out.println("6. Sort student by name.");
        System.out.println("7. In ra nam sinh 2000.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }

    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        ClassStudentController studentManager = new ClassStudentController();
        studentManager.addClassStudent();
        studentManager.addClassStudent();
        studentManager.addClassStudent();

            showMenu();
            while (true) {
                choose = scanner.nextLine();
                switch (choose) {
                    case "1":
                        System.out.println("Input id of class: ");
                        int id = scanner.nextInt();
                        studentManager.addStudent(studentManager.allClassStudent().get(id-1));
                        break;
                    case "2":
                        System.out.println("Input id of class: ");
                        int id1 = scanner.nextInt();
                        for (Student s : studentManager.allStudents()){
                            if (s.getClassStudent().getNameClass().equalsIgnoreCase
                                    (studentManager.allClassStudent().get(id1).getNameClass())){
                                System.out.println(s);
                            }
                        }
                        break;
                    case "3":
                        System.out.println("Input ID of student: ");
                        int studentId = scanner.nextInt();
                        studentManager.editStudent(studentId);
                        break;
                    case "4":
                        System.out.println("Input ID of student: ");
                        int studentId2 = scanner.nextInt();
                        studentManager.remove(studentId2);
                        break;
                    case "5":
                        System.out.println("Input name of student: ");
                        String studentname = scanner.nextLine();
                        studentManager.searchByName(studentname);
                        break;
                    case "6":
                        studentManager.sortStudentByName();
                        printStudent(studentManager);
                        break;
                    case "7":
                        List<Student> resStudents = studentManager.searchStudentByYear(2000);
                        for (Student iter : resStudents){
                            System.out.println(iter);
                        }
                        break;
                    case "0":
                        System.out.println("exited!");
                        exit = true;
                        break;
                    default:
                        System.out.println("invalid! please choose action in below menu:");
                        break;
                }
                if (exit) {
                    break;
                }
                showMenu();
            }
        }
    }
