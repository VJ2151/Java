package Day08.Students;

import java.util.Date;

public class StudentData {
    int roll_no;
    String name;
    Date DOB;
    double percentage;

    public StudentData(int roll_no, String name,Date DOB,double percentage){
        this.roll_no=roll_no;
        this.name=name;
        this.DOB=DOB;
        this.percentage = percentage;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
}
