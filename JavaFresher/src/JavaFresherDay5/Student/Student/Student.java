package JavaFresherDay5.Student.Student;

public class Student {

    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    //public
    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }

    // test ke thua protected
    protected static void sayHello(){
        System.out.println("Hello");
    }


    //default
    /*
    void setName(String name) {
        this.name = name;
    }

    void setClasses(String classes) {
        this.classes = classes;
    }
     */

    //protected
    /*
    protected void setName(String name) {
        this.name = name;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }
     */

    //private
    /*
    private void setName(String name) {
        this.name = name;
    }

    private void setClasses(String classes) {
        this.classes = classes;
    }
     */



}
