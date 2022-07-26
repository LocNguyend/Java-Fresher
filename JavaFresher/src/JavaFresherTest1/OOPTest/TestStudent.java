package JavaFresherTest1.OOPTest;

public class TestStudent {

    public static void main(String[] args) {
        // tinh da hinh
        Student s1 = new Student();
        Student s2 = new Student(58);

        System.out.println(s1);
        System.out.println(s2);

        // tinh dong goi khong the truy cap s1.ID vi da de private, phai
        // thong qua ham set
        s1.setID(1711);
        System.out.println(s1);
        s1.gotoWork();
    }
}
