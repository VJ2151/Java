package Day08.Students;

import java.text.ParseException;

public class TestStudent {
    public static void main(String[] args) throws ParseException {
        PassFail pf = new PassFail();
        pf.loadData();

        System.out.println("Passed: " + pf.getPassedStudents().size());
        for (StudentData s : pf.getPassedStudents()) {
            System.out.println(s.getName() + " (" + s.getPercentage() + "%)");
        }

        System.out.println("\nFailed: " + pf.getFailedStudents().size());
        for (StudentData s : pf.getFailedStudents()) {
            System.out.println(s.getName() + " (" + s.getPercentage() + "%)");
        }
    }
}


//    public static void main(String[] args) throws ParseException {
//        PassFail s = new PassFail();
//        s.students();
//        System.out.println(s.printStudents());
//
//    }
//}
