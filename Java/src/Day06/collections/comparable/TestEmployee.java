package Day06.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {
    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(3, "a"));
        employeeList.add(new Employee(1, "b"));
        employeeList.add(new Employee(2, "C"));

        System.out.println(employeeList);
        System.out.println("AFTER SORTING");

        Collections.sort(employeeList);
        System.out.println(employeeList);
    }
}
