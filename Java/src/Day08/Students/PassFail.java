package Day08.Students;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PassFail {
    ArrayList<StudentData> student = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public void loadData() throws ParseException {
        student.add(new StudentData(101, "Amit", sdf.parse("15/05/2005"), 85.5));
        student.add(new StudentData(102, "Sriya", sdf.parse("20/11/2004"), 35.0));
        student.add(new StudentData(103, "Rahul", sdf.parse("02/01/2005"), 62.0));
        student.add(new StudentData(104, "Priya", sdf.parse("12/08/2004"), 22.5));
    }

    public ArrayList<StudentData> getPassedStudents() {
        ArrayList<StudentData> passed = new ArrayList<>();
        for (StudentData s : student) {
            if (s.getPercentage() > 40) {
                passed.add(s);
            }
        }
        return passed;
    }

    public ArrayList<StudentData> getFailedStudents() {
        ArrayList<StudentData> failed = new ArrayList<>();
        for (StudentData s : student) {
            if (s.getPercentage() <= 40) {
                failed.add(s);
            }
        }
        return failed;
    }
}



//package Day08.Students;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.Scanner;
//
//public class PassFail {
//    ArrayList<StudentData>student = new ArrayList<>();
//
//    SimpleDateFormat birthDate = new SimpleDateFormat("dd/MM/yyyy");
//
//    Scanner sc=new Scanner(System.in);
//
//
//
//    public boolean students() throws ParseException {
//        for (int i = 1; i < 3; i++){
//
//            System.out.println("Student Number : "+ i);
//            System.out.println("enter your name " );
//            String name= sc.next();
//
//            System.out.println("enter your roll_no ");
//            int roll_no = sc.nextInt();
//            sc.nextLine();
//
//
//            System.out.println("Enter your DOB (dd/mm/yyyy):");
//            String dateOfBirthStr = sc.next();
//
//            System.out.println("Enter your percentage: ");
//            double percentage=sc.nextDouble();
//
//            Date dob = birthDate.parse(dateOfBirthStr);
//            student.add(new StudentData(roll_no, name ,dob, percentage));
//        }
//        return false;
//    }
//
//
//    public boolean printStudents() {
//        System.out.println("--- Student Records ---");
//        for (StudentData s : student) {
//            System.out.println("Roll No: " + s.getRoll_no() +
//                    ", Name: " + s.getName() +
//                    ", DOB: " + s.getDOB());
//        }
//        return false;
//    }
//
//
//    public String passStudents(double percentage){
//        String result = "Fail";
//
//        if(percentage>40){
//            result = "Passed";
//        }
//        return result;
//    }
//
//}
