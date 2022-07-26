package JavaFresherTest1.OOPTest;

public class Student extends Person {
    // Tinh ke thua tu lop Person chua cac thuoc tinh
    //va phuong thuc cua lop person, vi du la tat ca student
    //deu co ten la A

    // Tinh truu tuong the hien o phuong thuc gotoWork()
    //cua person, khong biet ro viec lam cu the cua
    //class person, ma minh se overiding lai o trong lop con
    //vi du voi class student thi se tra ve "To school" hay
    //class worker thi se tra ve "To factory"


    // Tinh dong goi the hien o modifier private,
    //chi co trong class Student thi moi co cac
    //field ID va Name, cac class khac khong truy cap
    //duoc
    private int ID = 0;

    //Tinh da hinh the hien o viec nap chong cac phuong thuc
    //o day la ham constructor khi tao 1 doi tuong student


    public Student() {
    }

    public Student(int ID) {
        this.ID = ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    void gotoWork() {
        System.out.println("Go to School!");
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                '}';
    }
}
