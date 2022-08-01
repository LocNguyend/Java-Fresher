package JavaFresherTest2.StudentManager;



import java.util.*;

public class TestStudentManager {

    public static void printStudent(StudentController list){
        list.findAll();
    }

    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by age.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Input grade and write to file student.txt. ");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        StudentController studentManager = new StudentController();

        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    studentManager.addStudent();
                    break;
                case "2":
                    System.out.println("Input ID of student: ");
                    String studentId = scanner.nextLine();
                    studentManager.edit(studentId);
                    break;
                case "3":
                    System.out.println("Input ID of student: ");
                    String studentId2 = scanner.nextLine();
                    studentManager.delete(studentId2);
                    break;
                case "4":
                    studentManager.sortStudentByAge();
                    printStudent(studentManager);
                    break;
                case "5":
                    studentManager.sortStudentByName();
                    printStudent(studentManager);
                    break;
                case "6":
                    studentManager.inputGradeList();
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
            // show menu
            showMenu();
        }
    }
}
