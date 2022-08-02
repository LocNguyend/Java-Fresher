package JavaFresherTest2again.ClassStudent.Model;

import java.util.List;

public class ClassStudent {
    private int IDclass ;

    private String nameClass;
    private String headTeacher;

    public ClassStudent(int IDclass, String nameClass, String headTeacher) {
        this.IDclass = IDclass;
        this.nameClass = nameClass;
        this.headTeacher = headTeacher;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getHeadTeacher() {
        return headTeacher;
    }

    public void setHeadTeacher(String headTeacher) {
        this.headTeacher = headTeacher;
    }

    @Override
    public String toString() {
        return "ClassStudent{" +
                "IDclass=" + IDclass +
                ", nameClass='" + nameClass + '\'' +
                ", headTeacher='" + headTeacher + '\'' +
                '}';
    }
}
