package JavaFresherTest2.StudentManager;

import java.util.Date;

public class StudentModel {
    private int ID = 0;
    private String name;
    private String formatID;
    private Date birthDay;
    private float grade = 0;

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public StudentModel() {
        ID ++;
        this.formatID = "HS"+ID;
    }

    public StudentModel(String name, Date birthDay) {
        this.name = name;
        this.birthDay = birthDay;
        ID ++;
        this.formatID = "HS"+ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormatID() {
        return formatID;
    }

    public void setFormatID(String formatID) {
        this.formatID = formatID;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}
